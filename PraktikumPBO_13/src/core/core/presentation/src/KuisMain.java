package core.core.presentation.src;
public class KuisMain {
    public static void main(String[] args) {
        Kursus kursus = new Kursus("K001", "Pemrograman Java", 500000);
        Instruktur instruktur = new Instruktur("I001", "Budi", "Pemrograman");
        Video video = new Video("V001", "Belajar Java Dasar", 60, "Video pengenalan Java", "1080p", "MP4");
        Artikel artikel = new Artikel("A001", "Pengenalan Java", "Pengenalan Java Dasar", "Tutorial", "Lukman");
        Kuis kuis = new Kuis("Q001", "Kuis Java Dasar", "Kuis tentang Java Dasar", "Pilihan Ganda", 10);
        Peserta peserta = new Peserta("P001", "Alfin", "Alfin1234@example.com");
        Pembayaran pembayaran = new Pembayaran("B001", "Transfer Bank", kursus.getHarga());

        System.out.println("============================");
        System.out.println("Informasi Kursus:");
        System.out.println("============================");
        System.out.println("ID Kursus: " + kursus.getIdKursus());
        System.out.println("Nama Kursus: " + kursus.getNamaKursus());
        System.out.println("Harga Kursus: " + kursus.getHarga());

        System.out.println("\n============================");
        System.out.println("Informasi Instruktur:");
        System.out.println("============================");
        System.out.println("ID Instruktur   :   " + instruktur.getIdInstruktur());
        System.out.println("Nama Instruktur :   " + instruktur.getNama());
        System.out.println("Spesialisasi Instruktur :   " + instruktur.getSpesialisasi());

        System.out.println("\n============================");
        System.out.println("Informasi Konten:");
        System.out.println("============================");
        System.out.println("ID Video    :   " + video.getIdKonten());
        System.out.println("Judul Video :   " + video.getJudul());
        System.out.println("Durasi Video    :   " + video.getDurasi() + " menit");
        System.out.println("Deskripsi Video :   " + video.getDeskripsi());

        System.out.println("\n============================");
        System.out.println("Instruktur membuat konten:");
        System.out.println("============================");
        instruktur.buatKonten(video);
        System.out.println("\nID Artikel    :   " + artikel.getIdKonten());
        System.out.println("Judul Artikel   :   " + artikel.getJudul());
        System.out.println("tipe Artikel    :   " + artikel.getTipeArtikel());
        System.out.println("Penulis Artikel :   " + artikel.getPenulis());
        System.out.println("Deskripsi Artikel   :   " + artikel.getDeskripsi());

        System.out.println("\n============================");
        System.out.println("Instruktur membuat konten:");
        System.out.println("============================");
        instruktur.buatKonten(artikel);

        System.out.println("\nID Kuis   :   " + kuis.getIdKonten());
        System.out.println("Judul Kuis  :   " + kuis.getJudul());
        System.out.println("Jenis Kuis  :   " + kuis.getJenisKuis());
        System.out.println("Jumlah Soal Kuis    :   " + kuis.getJmlPertanyaan());
        System.out.println("Deskripsi Kuis  :   " + kuis.getDeskripsi());
        
        System.out.println("\n============================");
        System.out.println("Instruktur membuat konten:");
        System.out.println("============================");
        instruktur.buatKonten(kuis);

        System.out.println("\nInformasi Peserta:");
        System.out.println("ID Peserta  :   " + peserta.getIdPeserta());
        System.out.println("Nama Peserta    :   " + peserta.getNama());
        System.out.println("Email Peserta   :   " + peserta.getEmail());

        System.out.println("\n============================");
        System.out.println("Peserta mendaftar kursus:");
        System.out.println("============================");
        peserta.daftarKursus(kursus);

        System.out.println("\nInformasi Pembayaran:");
        System.out.println("ID Pembayaran   :   " + pembayaran.getIdPembayaran());
        System.out.println("Metode Pembayaran   :   " + pembayaran.getMetode());
        System.out.println("Jumlah Pembayaran   :   " + pembayaran.getJumlah());

        System.out.println("\n============================");
        System.out.println("Pembayaran berhasil:");
        System.out.println("============================");
        pembayaran.bayar();
    }
}