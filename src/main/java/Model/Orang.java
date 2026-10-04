
package model;

public class Orang {
    // Field umum yang diwariskan oleh Peserta dan Instruktur
    private int id;
    private String nama;
    private String noHp;

    // Constructor parent
    public Orang(int id, String nama, String noHp) {
        this.id = id;
        this.nama = nama;
        this.noHp = noHp;
    }

    // Getter dan setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    // Menampilkan informasi umum
    public String getInfo() {
        return "ID: " + id
                + " | Nama: " + nama
                + " | No. HP: " + noHp;
    }
}