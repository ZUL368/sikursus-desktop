package model;

public class Instruktur extends Orang {
    // Field khusus untuk instruktur
    private String keahlian;

    // Constructor Instruktur memanggil constructor Orang
    public Instruktur(int id, String nama, String noHp,
                      String keahlian) {
        super(id, nama, noHp);
        this.keahlian = keahlian;
    }

    // Getter dan setter keahlian
    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    // Menampilkan informasi instruktur
    @Override
    public String getInfo() {
        return "[Instruktur] " + super.getInfo()
                + " | Keahlian: " + keahlian;
    }
}