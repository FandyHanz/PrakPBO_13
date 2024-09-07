package P2.Barang.src;

public class Barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public Barang(String k, String nB, int hD, float dsk){
        this.kode = k;
        this.namaBarang = nB;
        this.hargaDasar = hD;
        this.diskon = dsk;
    }

    int hitungHargaJual(){
        double dskn = diskon * hargaDasar;
       return (int) (hargaDasar - dskn);
    }

    void tampilHarga( int input){
        System.out.println("Kode: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: RP." + hargaDasar);
        System.out.println("Diskon: " + diskon  * 100 + "%");
        System.out.println("Harga Jual : RP." + input);
    }
}
