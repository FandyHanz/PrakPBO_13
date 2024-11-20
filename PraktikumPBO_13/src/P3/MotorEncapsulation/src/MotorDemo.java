package P3.MotorEncapsulation.src;

public class MotorDemo {
    public static void main(String[] args) {
        Motor mtr = new Motor();
        mtr.printStatus();
        mtr.tambahKecepatan();

        mtr.nyalakanMesin();
        mtr.printStatus();

        mtr.tambahKecepatan();
        mtr.printStatus();

        mtr.tambahKecepatan();
        mtr.printStatus();

        mtr.tambahKecepatan();
        mtr.printStatus();

        mtr.matikanMesin();
        mtr.printStatus();
    }
}
