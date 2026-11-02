# Tugas 1 - Sistem Keanggotaan Gym FitTrack

## Identitas
- Nama: Moula Zaki
- NPM: 250810701100083
- Kelas Praktikum: A

## Deskripsi
Program Java untuk mendata member gym FitTrack.

## Teknologi
- Java
- Visual Studio Code

## Deskripsi
FitTrack merupakan program Java sederhana untuk mendata member gym.
Program menyimpan nama, nomor telepon, tanggal pendaftaran, dan jenis
paket member selama aplikasi berjalan. Validasi dilakukan agar data
yang dimasukkan sesuai dengan aturan yang ditentukan.

## Fitur Utama
- Menyimpan data member.
- Memvalidasi nama dan nomor telepon.
- Memvalidasi tanggal pendaftaran dan jenis paket.
- Menyediakan paket Basic secara otomatis jika menggunakan
  constructor tanpa paket.
- Menampilkan informasi member dengan format yang mudah dibaca.

## Konsep OOP yang Diterapkan

| Konsep | Penerapan | Tujuan |
|---|---|---|
| Class | Member dan TesFitTrack | Mengatur data dan pengujian |
| Object | Objek Member | Merepresentasikan seorang member |
| Encapsulation | Atribut private | Mengendalikan akses atribut |
| Constructor | Member(...) | Menginisialisasi objek |
| Overloading | Constructor 3 dan 4 parameter | Menyediakan cara pembuatan objek berbeda |
| this | Constructor dan setter | Merujuk objek saat ini |
| Method | Getter dan setter | Mengakses serta memvalidasi data |
| Array | Member[] | Menyimpan beberapa objek |
| Perulangan | for | Menampilkan seluruh objek |
| Overriding | toString() | Mengatur format informasi objek |

## Struktur Project
tugas1-fittrack/
- src/Member.java
- src/TesFitTrack.java
- .gitignore
- README.md

## Prasyarat
- JDK yang mendukung kompilasi kode Java.
- Visual Studio Code.
- Extension Pack for Java pada VS Code.

## Cara Menjalankan di VS Code
1. Buka folder project tugas1-fittrack.
2. Pastikan JDK dan extension Java sudah terpasang.
3. Buka src/TesFitTrack.java.
4. Jalankan method main menggunakan tombol Run.

## Cara Menjalankan melalui Terminal
Jalankan perintah berikut dari folder utama project:

```bash
javac -d out src/Member.java src/TesFitTrack.java
java -cp out TesFitTrack