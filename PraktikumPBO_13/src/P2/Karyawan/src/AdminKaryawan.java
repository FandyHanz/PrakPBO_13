package P2.Karyawan.src;

public class AdminKaryawan {
    private String id, nama, jenisKelamin, jabatan, gaji;

    // public Karyawan( String i, String n, String jK, String j, String g){
    // id = i;
    // nama = n;
    // jenisKelamin = jK;
    // jabatan = j;
    // gaji = g;
    // }

    void getID(String input) {
        this.id = input;
    }

    void getNama(String input) {
        this.nama = input;
    }

    void getJenisKelamin(String input) {
        this.jenisKelamin = input;
    }

    void getJabatan(String input) {
        this.jabatan = input;
    }

    void getGaji(String input) {
        this.gaji = input;
    }

    void tampilDataDiri(){
        System.out.println("id: " + id);
        System.out.println("nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
    }
}
