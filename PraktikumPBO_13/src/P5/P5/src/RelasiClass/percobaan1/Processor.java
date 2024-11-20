package P5.P5.src.RelasiClass.percobaan1;

public class Processor {
    private String merk;
    private double cache;

    Processor() {

    }

    Processor(String m, double c) {
        merk = m;
        cache = c;
    }

    void setMerk(String input) {
        merk = input;
    }

    String getMerk() {
        return merk;
    }

    void setCache(double input) {
        cache = input;
    }

    double getCache() {
        return cache;
    }

    void info() {
        System.out.printf("Merk Processor = %s \n", merk);
        System.out.printf("Cache Memory = %.2f \n", cache);
    }
}