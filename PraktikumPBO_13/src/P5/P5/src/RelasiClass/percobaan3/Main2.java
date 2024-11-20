package P5.P5.src.RelasiClass.percobaan3;

public class Main2 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Budi");
        Pegawai asisten = new Pegawai("4567", "Andi");
        KeretaApi keretaApi = new KeretaApi("Arga", "Argo Bromo Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
