package P2.Karyawan.src;

public class Main {
    public static void main(String[] args) {
        Karyawan kry = new Karyawan();
        kry.getGaji("10000000");
        kry.getID("01");
        kry.getJabatan("Janitor");
        kry.getJenisKelamin("laki laki");
        kry.getNama("Andi");
        kry.lihatGaji();
    }
}
