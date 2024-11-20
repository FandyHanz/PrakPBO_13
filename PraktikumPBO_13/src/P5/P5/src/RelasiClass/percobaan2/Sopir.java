package P5.P5.src.RelasiClass.percobaan2;

public class Sopir {
    private String nama;
    private int biaya;

    Sopir() {

    }

    void setNama(String input) {
        nama = input;
    }

    String getNama() {
        return nama;
    }

    void setBiaya(int input) {
        biaya = input;
    }

    int getBiaya() {
        return biaya;
    }

    int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}
