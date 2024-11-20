package core.core.presentation.src;
public class Pembayaran {
    private String idPembayaran;
    private String metode;
    private double jumlah;

    public Pembayaran(String idPembayaran, String metode, double jumlah) {
        this.idPembayaran = idPembayaran;
        this.metode = metode;
        this.jumlah = jumlah;
    }

    public String getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public void bayar() {
        System.out.println("Pembayaran sebesar " + jumlah + " berhasil menggunakan metode: " + metode);
    }
}