package P7.P7.src.Percobaan1;

public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    void setLembur(int input){
        lembur = input;
    }

    int getLembur(){
        return lembur;
    }
    void setGajiLembur(double input){
        gajiLembur = input;
    }

    double getGajiLembur(){
        return gajiLembur;
    }

    double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    double getGaji(){
        return super.getGaji() + lembur * gajiLembur;
    }

    void lihatInfo(){
        System.out.println("Nama: " + getNama() );
        System.out.println("NIP: " + getGaji());
        System.out.println("Golongan: " + super.getGolongan());
        System.out.println("Jumlah lembur: " + getLembur());
        System.out.println("Jumlah gaji Lembur: " + getGajiLembur());
        System.out.println("Jumlah Gaji: " + getGaji());
    }
}
