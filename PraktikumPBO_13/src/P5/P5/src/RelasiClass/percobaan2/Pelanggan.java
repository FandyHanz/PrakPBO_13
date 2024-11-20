package P5.P5.src.RelasiClass.percobaan2;

public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    Pelanggan() {

    }

    void setNama(String input) {
        nama = input;
    }

    String getNama(){
        return nama;
    }

    void setMobil(Mobil input){
        mobil = input;
    }

    Mobil getMobil(){
        return mobil;
    }

    void setSopir(Sopir input){
        sopir = input;
    }

    Sopir getSopir(){
        return sopir;
    }

    void setHari(int input){
        hari = input;
    }

    int getHari(){
        return hari;
    }

    int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + 
        sopir.hitungBiayaSopir(hari);
    }

    
}
