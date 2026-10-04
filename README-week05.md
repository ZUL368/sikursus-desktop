# Pertemuan 5 – Inheritance pada Java

## Deskripsi

Tugas ini menerapkan konsep inheritance (pewarisan) pada Java menggunakan kelas `Orang` sebagai parent class serta `Peserta` dan `Instruktur` sebagai child class.

## Struktur Kelas

* **Orang**: menyimpan data umum berupa ID, nama, dan nomor HP.
* **Peserta**: mewarisi kelas `Orang` dan menambahkan data NIM serta program studi.
* **Instruktur**: mewarisi kelas `Orang` dan menambahkan data keahlian.

## Konsep yang Diterapkan

1. **Inheritance**: kelas `Peserta` dan `Instruktur` menggunakan `extends Orang`.
2. **Constructor `super()`**: memanggil constructor kelas induk.
3. **Method overriding**: kedua kelas turunan menyesuaikan method `getInfo()`.
4. **Polymorphism**: objek `Peserta` dan `Instruktur` disimpan dalam `ArrayList<Orang>`.
5. **Encapsulation**: atribut kelas menggunakan akses `private` dan diakses melalui getter serta setter.

## Pengujian

Program `DemoInheritance` membuat 3 objek `Peserta` dan 2 objek `Instruktur`, menyimpan objek ke dalam `ArrayList<Orang>`, mengubah nama salah satu peserta melalui setter, kemudian menampilkan informasi seluruh objek.

## Bukti Pengerjaan

* Screenshot struktur package dan class.
* Screenshot constructor `super()` pada kelas turunan.
* Screenshot hasil program pada console.
