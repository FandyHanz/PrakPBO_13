package P2.TokoGame.src;

public class Penjualan {
    public String id, namaMember, namaGame;
    public int harga, time;

    public Penjualan(String i, String nM, String nG, int hrg, int t){
        this.id = i;
        this.namaMember = nM;
        this.namaGame = nG;
        this.harga = hrg;
        this.time = t;
    }

    int hargaTotal(){
        return harga * time;
    }

    void tampilStruk(int input){
        System.out.println("id :" + id);
        System.out.println("nama member: " + namaMember);
        System.out.println("nama game: " + namaGame);
        System.out.println("Total Harga: " + input);
    }


}
