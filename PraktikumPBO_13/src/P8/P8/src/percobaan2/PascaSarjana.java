public class PascaSarjana extends Mahasiswa implements Icumlaude{
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
}
