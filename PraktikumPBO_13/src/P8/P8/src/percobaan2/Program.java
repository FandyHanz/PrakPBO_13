public class Program {
    public static void main(String[] args) {

        Rektor rek = new Rektor();
        Sarjana sarjanaCumLaude = new Sarjana("Ana");
        PascaSarjana MasterCumLaude = new PascaSarjana("Alan");
        
        rek.beriSertifikatPadaCumLaude(sarjanaCumLaude, sarjanaCumLaude);
        rek.beriSertifikatPadaCumLaude(MasterCumLaude, MasterCumLaude);
    }
}
