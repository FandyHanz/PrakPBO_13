package P1.TugasPraktikum.src;

public class AirCon {
    private String merk;
    private int consumptionDay, price;

    public void setMerk(String input){
        merk = input;
    }

    public void setConsumptionDay( int input){
        consumptionDay = input;
    }

    public void setPrice(int input){
        price = input;
    }

    public void infoTab(){
        System.out.println("Merk: " + merk);
        System.out.println("compsution day / kwh: " + consumptionDay);
        System.out.println("Price: " + price);
    
    }
}
