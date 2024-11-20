package P5.P5.src.RelasiClass.percobaan3;

public class Pegawai {
    private String nip;
    private String nama;

    Pegawai(String ni, String na){
        this.nip = ni;
        this.nama = na;
    }

    void setNip(String input){
        this.nip = input;
    }

    String getNip(){
        return nip;
    }

    void setNama(String input){
        this.nama = input;
    }

    String getNama(){
        return nama;
    }

    String info(){
        String info = "";
        info += "nip: " + this.nip + "\n";
        info += "nama: " + this.nama + "\n";
        return info;
    }
}
