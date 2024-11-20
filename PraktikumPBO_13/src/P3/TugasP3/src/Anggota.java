package P3.TugasP3.src;

public class Anggota {
    private String noKtp, nama;
    private int limitPinjam, jumlahPinjam;

    Anggota(String nK, String n, int lp) {
        this.noKtp = nK;
        this.nama = n;
        this.limitPinjam = lp;
        this.jumlahPinjam = 0;
    }

    String getNama() {
        return nama;
    }

    int getLimitPinjam() {
        return limitPinjam;
    }

    int getJumlahPinjam() {
        return jumlahPinjam;
    }

    void pinjam(int uang) {

        if (uang <= limitPinjam) {
            jumlahPinjam += uang;
            limitPinjam -= uang;
        } else {
            System.out.println("Maaf jumlah peminjaman melebihi limit");
        }
    }

    void angsur(int uang) {
        if (uang >= 0.1 * jumlahPinjam) {
                jumlahPinjam -= uang;
                limitPinjam += uang;
            }else {
            System.out.println(" Maaf uang kurang untuk membayar pinjaman");
        }
    }
}
