package id.kaganim.datepickerapp

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONArray
import java.util.*

class MainActivity : AppCompatActivity() {

    private var tanggalDipilih = ""
    private lateinit var listView: ListView
    private lateinit var adapter: ArrayAdapter<String>
    private var dataList = mutableListOf<String>()
    private lateinit var sharedPref: android.content.SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etKegiatan = findViewById<EditText>(R.id.etKegiatan)
        val btnPilihTanggal = findViewById<Button>(R.id.btnPilihTanggal)
        val tvTanggal = findViewById<TextView>(R.id.tvTanggal)
        val btnSimpan = findViewById<Button>(R.id.btnSimpan)
        listView = findViewById(R.id.listView)

        sharedPref = getSharedPreferences("DATA", MODE_PRIVATE)

        loadData()

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dataList)
        listView.adapter = adapter

        btnPilihTanggal.setOnClickListener {
            val cal = Calendar.getInstance()

            DatePickerDialog(
                this,
                { _, y, m, d ->
                    tanggalDipilih = "$d/${m + 1}/$y"
                    tvTanggal.text = "Tanggal: $tanggalDipilih"
                },
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)
            ).show()
        }

        btnSimpan.setOnClickListener {
            val kegiatan = etKegiatan.text.toString()

            if (kegiatan.isEmpty() || tanggalDipilih.isEmpty()) {
                Toast.makeText(this, "Isi dulu!", Toast.LENGTH_SHORT).show()
            } else {
                val item = "$kegiatan - $tanggalDipilih"
                dataList.add(item)

                saveData()
                adapter.notifyDataSetChanged()

                etKegiatan.text.clear()
            }
        }

        // 🔥 HAPUS PER ITEM (klik item)
        listView.setOnItemClickListener { _, _, position, _ ->
            dataList.removeAt(position)
            saveData()
            adapter.notifyDataSetChanged()
            Toast.makeText(this, "Data dihapus", Toast.LENGTH_SHORT).show()
        }
    }

    private fun saveData() {
        val jsonArray = JSONArray(dataList)
        sharedPref.edit().putString("list", jsonArray.toString()).apply()
    }

    private fun loadData() {
        val json = sharedPref.getString("list", null)
        if (json != null) {
            val jsonArray = JSONArray(json)
            for (i in 0 until jsonArray.length()) {
                dataList.add(jsonArray.getString(i))
            }
        }
    }
}