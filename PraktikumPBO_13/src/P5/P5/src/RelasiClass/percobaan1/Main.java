package P5.P5.src.RelasiClass.percobaan1;

public class Main {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop l = new Laptop("Thinkpad", p);
        l.info();
        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop l1 = new Laptop();
        l1.setMerk("thinkpad");
        l1.setProc(p1);
        l1.info();
    }
}
