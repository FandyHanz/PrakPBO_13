package P2.Mahasiswa.src;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jalan vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
    }
}
