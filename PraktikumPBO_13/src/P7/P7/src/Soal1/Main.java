package P7.P7.src.Soal1;

public class Main {
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();

        System.out.println(sg.totalSudutA(30));
        System.out.println(sg.totalSudutB(30, 60));
        System.out.println(sg.kelilingA(30, 60, 90));
        System.out.println(sg.kelilingB(30, 60));
    }
}
