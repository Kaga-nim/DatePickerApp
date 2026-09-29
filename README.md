# Mini Planner Android App (DatePickerApp)

Aplikasi Android sederhana berbasis **Kotlin** untuk mencatat agenda atau kegiatan harian lengkap dengan integrasi pemilih tanggal (*Date Picker*) dan penyimpanan data lokal secara permanen.

---

## 🛠️ Fitur Utama

- 📝 **Input Nama Kegiatan**: Memasukkan deskripsi atau nama rencana kegiatan.
- 📅 **Pemilih Tanggal Interactive (`DatePickerDialog`)**: Memilih tanggal kegiatan secara akurat menggunakan dialog kalender native Android.
- 💾 **Penyimpanan Data Lokal (`SharedPreferences` & JSON)**: Menyimpan daftar kegiatan dalam format `JSONArray` ke `SharedPreferences`, sehingga data tetap tersimpan meskipun aplikasi ditutup/direstart.
- 📋 **Daftar Kegiatan (`ListView`)**: Menampilkan seluruh riwayat kegiatan dan tanggalnya secara rapi dalam daftar.
- 🗑️ **Hapus Item Kegiatan**: Menghapus kegiatan tertentu secara instan cukup dengan menekan (*click*) item kegiatan pada daftar.
- 📱 **Tampilan Responsif**: Menggunakan `ScrollView` agar antarmuka fleksibel di berbagai ukuran layar perangkat.

---

## 🚀 Teknologi & Spesifikasi

- **Bahasa Pemrograman**: Kotlin
- **UI Framework**: Android XML Views (`ScrollView`, `LinearLayout`, `ListView`, `DatePickerDialog`)
- **Penyimpanan Data**: `SharedPreferences` & `org.json.JSONArray`
- **Package Name**: `id.kaganim.datepickerapp`
- **Min SDK**: API 24 (Android 7.0 Nougat)
- **Target SDK**: API 36
- **Build System**: Gradle with Kotlin DSL (`.gradle.kts`)

---

## 📂 Struktur Proyek

```text
p8/
├── apk/
│   └── app-debug.apk             # File APK siap pakai
├── datepickerapp/                # Modul utama aplikasi
│   └── app/
│       └── src/main/
│           ├── java/id/kaganim/datepickerapp/
│           │   └── MainActivity.kt       # Logika utama (DatePicker, SharedPreferences, ListView)
│           └── res/layout/
│               ├── activity_main.xml     # Layout utama aplikasi
│               └── item_kegiatan.xml     # Layout item kegiatan
└── README.md
```

---

## 📲 Download & Instalasi APK

Anda dapat menginstal aplikasi langsung tanpa perlu *compile* proyek melalui file APK yang tersedia:
- 📥 **[Download APK Debug](apk/app-debug.apk)** (`apk/app-debug.apk`)

---

## 👨‍💻 Author

- **Nama**: Kaga-nim
