package core.core.presentation.src;
public class Peserta {
    private String idPeserta;
    private String nama;
    private String email;

    public Peserta(String idPeserta, String nama, String email) {
        this.idPeserta = idPeserta;
        this.nama = nama;
        this.email = email;
    }

    public String getIdPeserta() {
        return idPeserta;
    }

    public void setIdPeserta(String idPeserta) {
        this.idPeserta = idPeserta;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void daftarKursus(Kursus kursus) {
        System.out.println("Peserta " + nama + " telah mendaftar ke kursus: " + kursus.getNamaKursus());
    }
}