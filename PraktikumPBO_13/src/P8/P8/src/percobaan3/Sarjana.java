package percobaan3;

public class Sarjana extends Mahasiswa implements Icumlaude, IBerprestasi{
    Sarjana(String n){
        super(n);
    }
    @Override
    public void lulus() {
        System.out.println("aku telah menyelesaikan skripsi");
    }

    @Override
    public void meraihIpkTertinggi() {
        System.out.println("lulus dengan ipk diatas 3,51");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("saya menjuari kompetisi nasional");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("saya menerbitkan artikel secara nasional");
    }
}
