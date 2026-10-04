
package model;

public class Peserta extends Orang {
    // Field khusus untuk peserta
    private String nim;
    private String prodi;

    // Constructor Peserta memanggil constructor Orang
    public Peserta(int id, String nama, String noHp,
                   String nim, String prodi) {
        super(id, nama, noHp);
        this.nim = nim;
        this.prodi = prodi;
    }

    // Getter dan setter NIM
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter dan setter program studi
    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Menampilkan informasi peserta
    @Override
    public String getInfo() {
        return "[Peserta] " + super.getInfo()
                + " | NIM: " + nim
                + " | Prodi: " + prodi;
    }
}