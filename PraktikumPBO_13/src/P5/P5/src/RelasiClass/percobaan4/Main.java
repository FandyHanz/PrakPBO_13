package P5.P5.src.RelasiClass.percobaan4;

public class Main {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr.Krab");
        Penumpang p2 = new Penumpang("4321", "Budi");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        gerbong.setPenumpang(p2, 1);
        System.out.println(gerbong.info());
    }
}
