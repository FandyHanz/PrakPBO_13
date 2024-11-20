public class Rektor {
    public void beriSertifikatPadaCumLaude(Icumlaude mahasiswa, Mahasiswa mhs){
        System.out.println("saya selaku rektor memberikan sertifikat atas nama");
        mhs.KuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIpkTertinggi();
        System.out.println("======================================================");
    }
}
