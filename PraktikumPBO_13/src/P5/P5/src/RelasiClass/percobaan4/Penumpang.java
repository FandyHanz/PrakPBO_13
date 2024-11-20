package P5.P5.src.RelasiClass.percobaan4;

public class Penumpang {
    private String ktp;
    private String nama;

    Penumpang(String k, String n){
        this.ktp = k;
        this.nama = n; 
    }

    void setKtp(String input){
        this.ktp = input;
    }

    String getKtp(){
        return ktp;
    }

    void setNama(String input){
        this.nama = input;
    }

    String getnama(){
        return nama;
    }

    String info(){
        String info = "";
        info += "ktp: " + this.ktp + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
