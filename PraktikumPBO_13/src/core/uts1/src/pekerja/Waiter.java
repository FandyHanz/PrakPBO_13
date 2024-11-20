package pekerja;
import java.util.Scanner;


public class Waiter {
    public void useJobDesk(String input,Chef ch){
        Scanner sc = new Scanner(System.in);
        if(input.equalsIgnoreCase("q")){
            System.out.println("deliver this food to buyer");
            System.out.println("1. burger");
            System.out.println("2. beverages");
            System.out.println("3. Kentang");
            System.out.println("Do: ");
            String decison = sc.nextLine();
            if (decison.equalsIgnoreCase("1")){
                System.out.println("The food delivered");
                ch.order.remove("burger");
            } else if (decison.equalsIgnoreCase("2")){
                System.out.println("The drink delivered");
                ch.order.remove("beverages");
            } else if (decison.equalsIgnoreCase("3")){
                System.out.println("The food delivered");
                ch.order.remove("kentang");
            }
        }
    }
}
