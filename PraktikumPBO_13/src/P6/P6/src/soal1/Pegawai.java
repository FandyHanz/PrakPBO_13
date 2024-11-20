package P6.P6.src.soal1;

public class Pegawai {
    public String nip, nama, alamat;
    
    
    Pegawai(String n, String na, String a){
        this.nip = n;
        this.nama = na;
        this.alamat = a;
    }

    String getNip(){
        return nip;
    }

    String getAlamat(){
        return alamat;
    }

    String getNama(){
        return nama;
    }

    int getGaji(){
        return 0;
    }
}
