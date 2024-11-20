package P7.P7.src.Percobaan1;

public class Manager extends Karyawan{
    private double tunjangan;
    private String bagian;
    private Staff st[];

    void setTunjangan(double input) {
        tunjangan = input;
    }

    double getTunjangan() {
        return tunjangan;
    }

    void setBagian(String input) {
        bagian = input;
    }

    String getBagian(){
        return bagian;
    }

    void setSt(Staff[] input) {
        st = input;
    }

    void viewStaff(){
        for (int i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
    }

    void lihatInfo(){
        System.out.println("Nama: " + getNama() );
        System.out.println("NIP: " + getGaji());
        System.out.println("Golongan: " + super.getGolongan());
        System.out.println("Jumlah Tunjangan: " + getTunjangan());
        System.out.println("Bagian: " + getBagian());
        System.out.println("Jumlah Gaji: " + getGaji());
        this.viewStaff();
    }

    double getGaji(){
        return super.getGaji() + tunjangan;
    }
}
