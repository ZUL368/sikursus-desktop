
package app;

import model.Instruktur;
import model.Kursus;
import model.Peserta;

/**
 * Uji validasi untuk Pertemuan 6.
 */
public class UjiValidasi {

    private interface Aksi {
        void jalankan();
    }

    public static void main(String[] args) {
        int pass = 0;
        int total = 9;

        // 1. Peserta dengan data valid
        pass += harusBerhasil("Peserta valid", new Aksi() {
            @Override
            public void jalankan() {
                new Peserta(
                    1, "Alya", "081234567890",
                    "252001", "Informatika"
                );
            }
        });

        // 2. Instruktur dengan data valid
        pass += harusBerhasil("Instruktur valid", new Aksi() {
            @Override
            public void jalankan() {
                new Instruktur(
                    2, "Dina", "081211110001",
                    "Java Desktop"
                );
            }
        });

        // 3. ID negatif harus ditolak
        pass += harusDitolak("ID negatif", new Aksi() {
            @Override
            public void jalankan() {
                new Peserta(
                    -1, "Alya", "081234567890",
                    "252001", "Informatika"
                );
            }
        });

        // 4. Nama kosong harus ditolak
        pass += harusDitolak("Nama kosong", new Aksi() {
            @Override
            public void jalankan() {
                new Peserta(
                    1, "", "081234567890",
                    "252001", "Informatika"
                );
            }
        });

        // 5. Nomor HP berisi huruf harus ditolak
        pass += harusDitolak("No HP huruf", new Aksi() {
            @Override
            public void jalankan() {
                new Peserta(
                    1, "Alya", "telepon",
                    "252001", "Informatika"
                );
            }
        });

        // 6. NIM kosong harus ditolak
        pass += harusDitolak("NIM kosong", new Aksi() {
            @Override
            public void jalankan() {
                new Peserta(
                    1, "Alya", "081234567890",
                    "", "Informatika"
                );
            }
        });

        // 7. Program studi kosong harus ditolak
        pass += harusDitolak("Prodi kosong", new Aksi() {
            @Override
            public void jalankan() {
                new Peserta(
                    1, "Alya", "081234567890",
                    "252001", ""
                );
            }
        });

        // 8. Keahlian kosong harus ditolak
        pass += harusDitolak("Keahlian kosong", new Aksi() {
            @Override
            public void jalankan() {
                new Instruktur(
                    2, "Dina", "081211110001", ""
                );
            }
        });

        // 9. Biaya kursus negatif harus ditolak
        pass += harusDitolak("Biaya negatif", new Aksi() {
            @Override
            public void jalankan() {
                Kursus k = new Kursus();
                k.setBiaya(-100000);
            }
        });

        System.out.println();
        System.out.println("HASIL: " + pass + "/" + total
                + " TEST PASS");

        if (pass != total) {
            throw new IllegalStateException(
                "Masih ada test validasi yang gagal"
            );
        }
    }

    private static int harusBerhasil(
            String nama, Aksi aksi) {
        try {
            aksi.jalankan();
            System.out.println("PASS | " + nama);
            return 1;
        } catch (RuntimeException ex) {
            System.out.println("FAIL | " + nama
                    + " | " + ex.getMessage());
            return 0;
        }
    }

    private static int harusDitolak(
            String nama, Aksi aksi) {
        try {
            aksi.jalankan();
            System.out.println("FAIL | " + nama
                    + " | input invalid tidak ditolak");
            return 0;
        } catch (IllegalArgumentException ex) {
            System.out.println("PASS | " + nama
                    + " | DITOLAK: " + ex.getMessage());
            return 1;
        }
    }
}
