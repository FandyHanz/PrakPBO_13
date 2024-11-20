package P5.P5.src.RelasiClass.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] kursi;

    Gerbong(String k, int jumlah) {
        this.kode = k;
        this.kursi = new Kursi[jumlah];
        this.intKursi();
    }

    private void intKursi() {
        for (int i = 0; i < kursi.length; i++) {
            this.kursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    void setKode(String input) {
        this.kode = input;
    }

    void setPenumpang(Penumpang input, int nomor) {
        if (this.kursi[nomor -1].getPenumpang() == null){
            this.kursi[nomor -1].setPenumpang(input);
        } else {
            System.out.println("Kursi yang diminta penuh mohon pindah");
        }
        
    }

    Kursi[] getKursi() {
        return kursi;
    }

    String info() {
        String info = "";
        info += "info: " + "\n";
        for (Kursi kursi : kursi) {
            info += kursi.info();
        }
        return info;
    }
}
