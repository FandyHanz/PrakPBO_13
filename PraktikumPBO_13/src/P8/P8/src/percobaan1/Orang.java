public class Orang {
    private String nama;
    private Hewan hewanPeliharan;

    Orang(String n) {
        this.nama = n;
    }

    public void hewanPeliharan(Hewan input) {
        this.hewanPeliharan = input;
    }

    public void ajakPeliharanJalanJalan(){
        System.out.println("namaku: " + this.nama);
        System.out.println("hewan pelihaaraanku berjalan dengan cara: ");
        this.hewanPeliharan.bergerak();
        System.out.println("==========================================");

    }
}
