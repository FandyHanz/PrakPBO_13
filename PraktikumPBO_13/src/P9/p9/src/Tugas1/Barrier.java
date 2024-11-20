package Tugas1;

public class Barrier implements iDestroyable{
    private int strength;

    Barrier(int s){
        this.strength = s;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void destroyed() {
        strength -= (int)strength * 0.02;
    }

    public String getBarrierInfo(){
        return "Barrier strength: " + strength;
    }
}
