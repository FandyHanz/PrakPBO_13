package P1.TugasPraktikum.src;

public class Handphone {
    private String merk;
    private int memory, price;

    public void setMerk(String input){
        merk = input;
    }

    public void setMemory(int input){
        memory = input;
    }

    public void setPrice(int input){
        price = input;
    }

    public void infoTab(){
        System.out.println("Merk: " + merk);
        System.out.println("Memory: " + memory);
        System.out.println("Price: " + price);

    }
}
