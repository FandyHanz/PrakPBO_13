package P7.P7.src.Percobaan1;

public class Karyawan {
    private String nama, nip, golongan;
    private double gaji;

    void setNama(String input){
        this.nama = input;
    }

    String getNama(){
        return nama;
    }

    void setNip(String input){
        this.nip = input;
    }

    String getNip(){
        return nip;
    }

    void setGolongan(String input){
        this.golongan = input;
    }

    String getGolongan(){
        return golongan;
    }

    void setGaji(int input){
        this.gaji = input;
    }

    double getGaji(){
        return gaji;
    }
}
