# Mini Planner Android App (DatePickerApp)

Aplikasi Android sederhana berbasis **Kotlin** untuk mencatat agenda atau kegiatan harian lengkap dengan integrasi pemilih tanggal (*Date Picker*) dan penyimpanan data lokal secara permanen.

---

## 🛠️ Fitur Utama

- 📝 **Input Nama Kegiatan**: Memasukkan deskripsi atau nama rencana kegiatan.
- 📅 **Pemilih Tanggal Interactive (`DatePickerDialog`)**: Memilih tanggal kegiatan secara interaktif menggunakan dialog kalender native Android.
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
- **Build System**: Gradle dengan Kotlin DSL (`build.gradle.kts`) & Version Catalog (`gradle/libs.versions.toml`)

---

## 📂 Struktur Proyek

```text
p8/
├── app/                          # Modul utama aplikasi
│   ├── build/                    # Hasil kompilasi & file APK
│   │   └── outputs/apk/debug/
│   │       └── app-debug.apk     # File APK Debug
│   ├── build.gradle.kts          # Konfigurasi build modul app
│   └── src/
│       ├── main/
│       │   ├── AndroidManifest.xml
│       │   ├── java/id/kaganim/datepickerapp/
│       │   │   └── MainActivity.kt       # Logika utama (DatePicker, SharedPreferences, ListView)
│       │   └── res/
│       │       └── layout/
│       │           ├── activity_main.xml # Layout utama aplikasi
│       │           └── item_kegiatan.xml # Layout item kegiatan
│       ├── androidTest/
│       └── test/
├── gradle/
│   └── libs.versions.toml        # Gradle Version Catalog
├── build.gradle.kts              # Root build script
├── settings.gradle.kts           # Konfigurasi project & include(:app)
└── README.md
```

---

## 📲 Download & Lokasi APK

Hasil kompilasi APK Debug dapat ditemukan atau diunduh langsung melalui tautan berikut:
- 📥 **[Download APK](app/build/outputs/apk/debug/app-debug.apk)** (`app/build/outputs/apk/debug/app-debug.apk`)

---

## 💻 Cara Menjalankan Proyek

1. Buka folder proyek `DatePickerApp` di **Android Studio**.
2. Lakukan sync Gradle (`Sync Project with Gradle Files`).
3. Hubungkan perangkat Android atau jalankan Emulator.
4. Klik tombol **Run 'app'** (`Shift + F10`).

---

## 👨‍💻 Author

- **Nama**: Kaga-nim
