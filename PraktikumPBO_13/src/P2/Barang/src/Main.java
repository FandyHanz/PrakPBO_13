package P2.Barang.src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sctr = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);

        System.out.println("Masukan kode barang: ");
        String kode = sctr.nextLine();
        System.out.println("Masukan Nama Barang: ");
        String nama = sctr.nextLine();
        System.out.println("Masukan harga dasar:");
        int hargaDasar = scint.nextInt();
        System.out.println("Masukan diskon: ");
        float diskon = scint.nextFloat();
        Barang brg = new Barang(kode, nama, hargaDasar, diskon);

        int result = brg.hitungHargaJual();
        brg.tampilHarga(result);
    }
}
