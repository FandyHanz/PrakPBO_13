package P2.TokoGame.src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scstr = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);

        System.out.println("Masukan id: ");
        String id = scstr.nextLine();
        System.out.println("Masukan Nama member: ");
        String namaMem = scstr.nextLine();
        System.out.println("Masukan nama Game: ");
        String namaGam = scstr.nextLine();
        System.out.println("Masukan harga yang tertera: ");
        int harga = scint.nextInt();
        System.out.println("Masukn lama Sewa: ");
        int sewa = scint.nextInt();
        Penjualan pnj = new Penjualan(id, namaMem, namaGam, harga, sewa);
        int result = pnj.hargaTotal();
        pnj.tampilStruk(result);
    }
}
