package P6.P6.src.soal1;

public class Dosen extends Pegawai{
    public int jumlahSkS, tarifSKS;

    Dosen(String n, String na, String a){
        super(n, na, a);
    }

    void setSKS(int input){
        this.jumlahSkS = input;
    }
    int getGaji(){
        return jumlahSkS * tarifSKS;
    }

}
