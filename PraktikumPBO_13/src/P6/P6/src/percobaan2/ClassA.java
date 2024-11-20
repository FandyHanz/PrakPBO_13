package P6.P6.src.percobaan2;

public class ClassA {
    private int x, y;

    void setX(int input) {
        this.x = input;
    }

    int getX(){
        return this.x;
    }

    void setY(int input) {
        this.y = input;
    }

    int getY(){
        return this.y;
    }

    void getNilaiXY() {
        System.out.println("Nilai X: " + this.x);
        System.out.println("Nilai Y: " + this.y);
    }
}
