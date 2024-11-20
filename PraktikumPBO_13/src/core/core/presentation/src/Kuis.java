package core.core.presentation.src;
public class Kuis extends Konten {
    private String jenisKuis;
    private int jmlPertanyaan;

    public Kuis(String idKonten, String judul, String deskripsi, String jenisKuis, int jmlPertanyaan) {
        super(idKonten, judul, "Kuis", deskripsi);
        this.jenisKuis = jenisKuis;
        this.jmlPertanyaan = jmlPertanyaan;
    }

    public String getJenisKuis() {
        return jenisKuis;
    }

    public void setJenisKuis(String jenisKuis) {
        this.jenisKuis = jenisKuis;
    }

    public int getJmlPertanyaan() {
        return jmlPertanyaan;
    }

    public void setJmlPertanyaan(int jmlPertanyaan) {
        this.jmlPertanyaan = jmlPertanyaan;
    }
}