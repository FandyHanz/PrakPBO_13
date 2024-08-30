package P1.TugasPraktikum.src;

public class Mamalia {
    private String Gender, bloodType;

    public void canPregnant(String value){
        Gender = value;
    }
    
    public void nursing(String value){
        bloodType = value;
    }

    public void checkAnimals(){
        System.out.println("Gender: " + Gender);
        System.out.println("Blood type: " + bloodType);
    }
}
