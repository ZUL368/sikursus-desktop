package app;

import java.util.ArrayList;
import model.Orang;
import model.Peserta;
import model.Instruktur;

public class DemoInheritance {
    public static void main(String[] args) {

        // Membuat list dengan tipe parent Orang
        ArrayList<Orang> daftarOrang = new ArrayList<>();

        // Menambahkan 3 object Peserta
        daftarOrang.add(new Peserta(
                1, "Alya Rahma", "081234567890",
                "252001", "Informatika"));

        daftarOrang.add(new Peserta(
                2, "Rafi Akbar", "081298765432",
                "252002", "Informatika"));

        daftarOrang.add(new Peserta(
                3, "Nadia Putri", "081277778888",
                "252003", "Sistem Informasi"));

        // Menambahkan 2 object Instruktur
        daftarOrang.add(new Instruktur(
                101, "Dina Pratama", "081211110001",
                "Java Desktop"));

        daftarOrang.add(new Instruktur(
                102, "Rizal Maulana", "081211110002",
                "Data Science"));

        // Mengubah nama peserta menggunakan setter parent
        Peserta pesertaUji = (Peserta) daftarOrang.get(0);
        pesertaUji.setNama("Alya Rahma Putri");

        // Menampilkan seluruh data
        System.out.println("=== DATA SIKURSUS ===");

        for (Orang orang : daftarOrang) {
            System.out.println(orang.getInfo());
        }

        // Menguji jumlah object
        System.out.println("\nJumlah object: " + daftarOrang.size());
    }
}