package core.core.presentation.src;
public class Video extends Konten {
    private String resolusi;
    private String format;
    private int durasi;

    public Video(String idKonten, String judul, int durasi, String deskripsi, String resolusi, String format) {
        super(idKonten, judul, "Video", deskripsi);
        this.resolusi = resolusi;
        this.format = format;
        this.durasi = durasi;
    }

    public String getResolusi() {
        return resolusi;
    }

    public void setResolusi(String resolusi) {
        this.resolusi = resolusi;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
}