package P5.P5.src.RelasiClass.percobaan3;

public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    KeretaApi(String n, String k, Pegawai m, Pegawai a){
        this.nama = n;
        this.kelas = k;
        this.masinis = m;
        this.asisten = a;
    }

    void setNama(String input){
        this.nama = input;
    }

    String getNama(){
        return nama;
    }

    void setKelas(String input){
        this.kelas = input;
    }

    String getKelas(){
        return kelas;
    }

    void setMasinis(Pegawai input){
        this.masinis = input;
    }

    Pegawai getMasinis(){
        return masinis;
    }

    void setAsisten(Pegawai input){
        this.asisten = input;
    }

    Pegawai getAsisten(){
        return asisten;
    }

    String info(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }
}
