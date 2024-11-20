package P5.P5.src.RelasiClass.percobaan2;

public class Mobil {
    private String merk;
    private int biaya;

    Mobil() {

    }

    Mobil(String m, int b) {
        merk = m;
        biaya = b;
    }

    void setMerk(String input) {
        merk = input;
    }

    String getMerk() {
        return merk;
    }

    void setBiaya(int input) {
        biaya = input;
    }

    int getBiaya() {
        return biaya;
    }

    int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}
