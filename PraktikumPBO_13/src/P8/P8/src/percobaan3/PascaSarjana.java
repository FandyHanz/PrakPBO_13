package percobaan3;

public class PascaSarjana extends Mahasiswa implements Icumlaude, IBerprestasi{
    PascaSarjana(String n){
        super(n);
    }
    
    @Override
    public void lulus() {
        System.out.println("Aku menyelesaikan tesis");
    }

    @Override
    public void meraihIpkTertinggi() {
        System.out.println("Meraih ipk diatas 3,71");
    }
    
    @Override
    public void menjuaraiKompetisi() {
        System.out.println("menjuarai Kompetisi Internasional");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("saya membuat artikel bersekala internasional");
    }
}
