package core.core.presentation.src;
public class Instruktur {
    private String idInstruktur;
    private String nama;
    private String spesialis;

    public Instruktur(String idInstruktur, String nama, String spesialisasi) {
        this.idInstruktur = idInstruktur;
        this.nama = nama;
        this.spesialis = spesialisasi;
    }

    public String getIdInstruktur() {
        return idInstruktur;
    }

    public void setIdInstruktur(String idInstruktur) {
        this.idInstruktur = idInstruktur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialisasi() {
        return spesialis;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialis = spesialisasi;
    }

    public void buatKonten(Konten konten) {
        System.out.println("Instruktur " + nama + " membuat konten dengan judul: " + konten.getJudul());
    }
}