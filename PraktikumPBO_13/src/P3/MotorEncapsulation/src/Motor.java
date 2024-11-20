package P3.MotorEncapsulation.src;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    void nyalakanMesin() {
        kontakOn = true;
    }

    void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    void tambahKecepatan() {
        if (kontakOn == true) {
            kecepatan += 50;
        } else {
            System.out.println("kecepatan tidak bisa bertambah karena mesin mati!");
        }
    }

    void kurangiKecepatan(){
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("kecepatn tiak bisa dikurangi karena mesin mati!");
        }
    }

    void printStatus() {
        if (kontakOn == true) {
            System.out.println("kontak on");
        } else {
            System.out.println("kontak off");
        }
        System.out.println("kecepatan " + kecepatan + "\n");
        maxSpeedStatus();
    }

    void maxSpeedStatus(){
        if (kecepatan >= 100) {
            System.out.println("kecepatan telah mencapai batasnya");
            kecepatan = 50;
        } else {
            System.out.println("kecepatan masih dalam batas aman");
        }
    }
}
