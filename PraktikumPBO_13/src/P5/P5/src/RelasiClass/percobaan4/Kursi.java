package P5.P5.src.RelasiClass.percobaan4;

public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    Kursi(String n){
        this.nomor = n;
    }

    void setNomor(String input){
        this.nomor = input;
    }

    String getNomor(){
        return nomor;
    }

    void setPenumpang(Penumpang input){
        this.penumpang = input;
    }

    Penumpang getPenumpang(){
        return penumpang;
    }

    String info(){
        String info = "";
        info += "Nomor: " + this.nomor + "\n";
        if (this.penumpang != null){
            info += "Penumpang: " + this.penumpang.info() + "\n";
        }
        return info;
    }
}
