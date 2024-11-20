public class Sarjana extends Mahasiswa implements Icumlaude{
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
}
