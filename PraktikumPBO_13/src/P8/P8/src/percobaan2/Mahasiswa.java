public class Mahasiswa {
    protected String nama;

    Mahasiswa(String n){
        this.nama = n;
    }
    public void KuliahDiKampus(){
        System.out.println("Namaku: " + nama);
        System.out.println("aku berkuliah di kampus");
    }
}
