package P5.P5.src.RelasiClass.percobaan1;

public class Laptop {
    private String merk;
    private Processor proc;

    Laptop() {

    }

    Laptop(String m, Processor pr) {
        merk = m;
        proc = pr;
    }

    void setMerk(String input) {
        merk = input;
    }

    String getMerk() {
        return merk;
    }

    void setProc(Processor input) {
        proc = input;
    }
    Processor getProc(){
        return proc;
    }
    void info() {
        System.out.printf("Merk Laptop = %s \n", merk);
        proc.info();
    }

}
