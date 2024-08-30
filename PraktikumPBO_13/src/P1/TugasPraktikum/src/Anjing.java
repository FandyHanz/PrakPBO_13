package P1.TugasPraktikum.src;

public class Anjing extends Mamalia {
    private String type, hairColor;
    private int pupilsSize;

    public void setType(String input) {
        type = input;
    }

    public void running(int input){
        pupilsSize = input;
    }

    public void setHairColor(String input){
        hairColor = input;
    }

    public void checkAnimals(){
        super.checkAnimals();
        System.out.println("Type: " + type);
        System.out.println("Pupil size; " + pupilsSize);
        System.out.println("Hair color: " + hairColor);
    }
}
