package P1.SepedaDemo.src;

public class SepedaDemo {
    public static void main(String[] args) {
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();

        spd1.setMerk("Polygon");
        spd1.tambahKeceptan(10);
        spd1.gantiGear(2);
        spd1.cekStatus();

        spd2.setMerk("Wimcycle");
        spd2.tambahKeceptan(10);
        spd2.gantiGear(2);
        spd2.tambahKeceptan(10);
        spd2.gantiGear(3);
        spd2.cekStatus();

        spd3.setMerk("Klinee");
        spd3.tambahKeceptan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas suspension");
        spd3.cekStatus();

    }
}
