public class Program {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        Ikan ikan = new Ikan();

        Orang ani = new Orang("ani");
        Orang budi = new Orang("budi");

        ani.hewanPeliharan(kucing);
        budi.hewanPeliharan(ikan);

        ani.ajakPeliharanJalanJalan();
        budi.ajakPeliharanJalanJalan();

    }
}
