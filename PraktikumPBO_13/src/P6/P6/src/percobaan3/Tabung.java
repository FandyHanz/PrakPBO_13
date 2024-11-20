package P6.P6.src.percobaan3;

public class Tabung extends Bangun{
    protected int t;
    void setSuperPhi(double input){
        super.phi = input;
    }

    void setSuperR(int input){
        super.r = input;
    }

    void setT(int input){
        this.t = input;
    }

    void volume(){
        System.out.println("Volume: " + (super.phi * super.r * super.r * this.t));
    }
}
