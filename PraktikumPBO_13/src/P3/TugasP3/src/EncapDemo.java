package P3.TugasP3.src;

public class EncapDemo {
    private String name;
    private int age;

    String getName(){
        return name;
    }
    void setName(String input){
        name = input;
    }

    int getAge(){
        return age;
    }

    void setAge(int input){
        if (input > 30){
            age = 30;
        } else if (input <= 18){
            age = 18;
        } else {
            System.out.println("Umur dibwah 18 tidak dapat di entry");
        }
    }


}
