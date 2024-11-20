package P6.P6.src.soal1;

public class Main {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(10);
        Dosen dosen1 = new Dosen("1234","Joko","Jl. Sudirman");
        Dosen dosen2 = new Dosen("5678","Budi","Jl. Cempaka");

        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);
        dosen1.setSKS(5);
        dosen2.setSKS(6);
        dosen1.getGaji();
        dosen2.getGaji();

        daftar.printSemuaGaji();
    }
}
