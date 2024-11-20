package P3.KoperasiGetterSetter.src;

public class Anggota {
    private String nama, alamat;
    private float simpanan;

    public Anggota(String n, String a){
        this.nama = n;
        this.alamat = a;
        this.simpanan = 0;
    }

    void setNama(String input){
        this.nama = input;
    }

    void setAlamat(String input){
        this.alamat = input;
    }

    String getAlamat(){
        return alamat;
    }

    String getNama(){
        return nama;
    }

    float getSimpanan(){
        return simpanan;
    }
    
    void setor( float input){
        simpanan += input;
    }

    void tarik(float input){
        simpanan -= input;
    }
}
