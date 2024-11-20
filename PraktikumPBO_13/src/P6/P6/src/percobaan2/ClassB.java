package P6.P6.src.percobaan2;

public class ClassB extends ClassA{
    private int z;

    void setZ(int input){
        this.z = input;
    }

    void getNilaiZ(){
        System.out.println("Nilai Z: " + this.z);
    }

    void getJumlah(){
        System.out.println("Jumlah: " + (getX() + getY() + z));
    }
}
