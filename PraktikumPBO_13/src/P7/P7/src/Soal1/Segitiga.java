package P7.P7.src.Soal1;
import java.math.*;

public class Segitiga {
    private int sudut;
    public void setSudut(int input) {
        sudut = input;
    }

    public int getSudut() {
        return sudut;
    }

    int totalSudutA(int sudutA){
        return 180 - sudutA;
    }

    int totalSudutB(int sudutA, int sudutB){
        return 180 - (sudutA + sudutB);
    }

    int kelilingA(int sudutA, int sudutB, int sudutC){
        return sudutA + sudutB + sudutC;
    }

    int kelilingB(int sudutA, int sudutB){
        int temp = (sudutA * sudutA) + (sudutB * sudutB);
        return (int) Math.sqrt(temp);
    }
}
