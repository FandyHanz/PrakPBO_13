package P3.TugasP3.src;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner inptstr = new Scanner(System.in);
        Scanner inptint = new Scanner(System.in);

        System.out.println("Masukan no ktp: ");
        String noKtp = inptstr.nextLine();
        System.out.println("Masukan nama: ");
        String nama = inptstr.nextLine();
        System.out.println("Masukan Limit pinjam: ");
        int lp = inptint.nextInt();
        Anggota donny = new Anggota(noKtp, nama, lp);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjam());

        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());

        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());

        System.out.println("\nMembayar angsuran: ");
        int uang = inptint.nextInt();
        donny.angsur(uang);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());

        System.out.println("\nMembayar angsuran: ");
        donny.angsur(uang);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());

    }
}
