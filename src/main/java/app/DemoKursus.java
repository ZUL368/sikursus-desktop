
package app;

import model.Kursus;

public class DemoKursus {
    public static void main(String[] args) {

        // DEMO OBJECT KURSUS
        System.out.println("=== DEMO OBJECT KURSUS ===");

        Kursus k1 = new Kursus(
            "JAVA-BSC",
            "Java Desktop Fundamental",
            "BASIC",
            500000
        );

        double hasilDemo = k1.hitungBiayaSetelahDiskon(10);

        System.out.println("Kode Kursus: JAVA-BSC");
        System.out.println("Nama Kursus: Java Desktop Fundamental");
        System.out.println("Level: BASIC");
        System.out.println("Biaya Awal: Rp500000");
        System.out.println("Diskon: 10%");
        System.out.println("Biaya setelah diskon: Rp" + hasilDemo);


        // PENGUJIAN LIMA SKENARIO
        System.out.println("\n=== TEST MATRIX ===");

        double[] biaya = {
            500000, 500000, 500000, 0, 500000
        };

        double[] diskon = {
            0, 10, 25, 10, 100
        };

        double[] expected = {
            500000, 450000, 375000, 0, 0
        };

        System.out.printf(
            "%-5s %-12s %-10s %-12s %-12s %-8s%n",
            "No", "Biaya", "Diskon", "Expected", "Actual", "Status"
        );

        for (int i = 0; i < biaya.length; i++) {

            Kursus kursus = new Kursus(
                "TEST-" + (i + 1),
                "Kursus Pengujian",
                "BASIC",
                biaya[i]
            );

            double actual =
                kursus.hitungBiayaSetelahDiskon(diskon[i]);

            String status =
                (actual == expected[i]) ? "PASS" : "FAIL";

            System.out.printf(
                "%-5d %-12.0f %-10.0f %-12.0f %-12.0f %-8s%n",
                (i + 1),
                biaya[i],
                diskon[i],
                expected[i],
                actual,
                status
            );
        }
    }
}