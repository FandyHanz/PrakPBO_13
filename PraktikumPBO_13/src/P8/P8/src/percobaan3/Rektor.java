package percobaan3;

public class Rektor {
    public void beriSertifikatPadaCumLaude(Icumlaude mahasiswa, Mahasiswa mhs){
        System.out.println("saya selaku rektor memberikan sertifikat atas nama");
        mhs.KuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIpkTertinggi();
        System.out.println("======================================================");
    }

    public void beriSertifikatMawapres(IBerprestasi berprestasi){
        System.out.println("saya selaku rektor memberikan sertifikat atas nama");
        berprestasi.menjuaraiKompetisi();
        berprestasi.membuatPublikasiIlmiah();
        System.out.println("======================================================");
    }
}
