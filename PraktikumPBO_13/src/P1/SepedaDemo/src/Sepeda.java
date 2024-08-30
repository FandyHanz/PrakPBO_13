package P1.SepedaDemo.src;

public class Sepeda {
    private String merek;
    private int kecepatan, gear;

    public void setMerk(String newValue) {
        merek = newValue;
    }

    public void gantiGear(int newValue) {
        gear = newValue;
    }

    public void tambahKeceptan (int increment){
        kecepatan += increment;
    }

    public void rem(int decrement){
        kecepatan -= decrement;
    }

    public void cekStatus(){
        System.out.println( "Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
    }
}