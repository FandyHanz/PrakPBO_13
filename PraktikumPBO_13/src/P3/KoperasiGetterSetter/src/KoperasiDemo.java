package P3.KoperasiGetterSetter.src;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota angt1 = new Anggota("Iwan", "Jalan Mawar");
        System.out.println("Simpanan anggota: " + angt1.getNama() + " Rp: " + angt1.getSimpanan());
        angt1.setNama("Iwan setiawan");
        angt1.setAlamat("Jalan Sukarno Hatta no 18");
        angt1.setor(10000);
        System.out.println("Simpanan anggota: " + angt1.getNama() + " Rp: " + angt1.getSimpanan());
        angt1.tarik(5000);
        System.out.println("Simpanan anggota: " + angt1.getNama() + " Rp: " + angt1.getSimpanan());
    }
}
