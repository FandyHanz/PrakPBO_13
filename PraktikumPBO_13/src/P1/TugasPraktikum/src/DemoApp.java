package P1.TugasPraktikum.src;

public class DemoApp {
    public static void main(String[] args) {
        AirCon obj1 = new AirCon();
        Anjing obj2 = new Anjing();
        Handphone obj3 = new Handphone();
        Kucing obj4 = new Kucing();

        obj1.setMerk("Daikin");
        obj1.setConsumptionDay(40);
        obj1.setPrice(1200000);
        obj1.infoTab();

        obj2.canPregnant("female");
        obj2.nursing("warm");
        obj2.setType("golden retriever");
        obj2.running(10);
        obj2.setHairColor("brown");
        obj2.checkAnimals();

        obj3.setMerk("Samzong");
        obj3.setMemory(8);
        obj3.setPrice(1000000);
        obj3.infoTab();

        obj4.canPregnant("female");
        obj4.nursing("warm");
        obj4.setType("anggora");
        obj4.running(5);
        obj4.setHairColor("grey");
        obj4.checkAnimals();

    }
}
