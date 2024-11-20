import java.util.Scanner;

import Buyer.Buyer;
import Resto.Resto;
import pekerja.Chef;
import pekerja.Waiter;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        boolean isLoop = true;
        Resto resto = new Resto();
        while (isLoop) {
            int x = rnd.nextInt(2);
            if (x == 0) {
                resto.addNewBuyer();
                System.out.println("there new buyer is coming");
            }
            System.out.println("Welcome to the restaurant: ");
            System.out.println("Select your role: ");
            System.out.println("1. Cashier");
            System.out.println("2. Chef");
            System.out.println("3. Waitres");
            System.out.println("4. See the inventory");
            String decison = sc.nextLine();
            if (decison.equalsIgnoreCase("1")) {
                System.out.println("You role as cashier");
                System.out.println("press 'q' to continue");
                String decison1 = sc.nextLine();
                if (decison1.equalsIgnoreCase("q")) {
                    if (resto.getByr().size() == 0) {
                        System.out.println("there is no buyer");
                        System.out.println("press enter to continue");
                        sc.nextLine();
                    } else {
                        System.out.println("there is a buyer");
                        resto.useJobdeskCashier(decison1, resto.getByr().get(0));
                        resto.addToWaitingList(resto.getByr().get(0));
                        resto.removeBuyer();
                        
                        System.out.println("lets play another role: ");
                        String decison2 = sc.nextLine();
                        if (decison2.equalsIgnoreCase("y")) {
                            isLoop = false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (decison.equalsIgnoreCase("2")) {
                String temp = decison;
                String temp1 = "y";
                temp = temp1;
                Chef ch = new Chef();
                ch.useJobdesk(temp, resto);
                System.out.println("lets play another role: ");
                String decison2 = sc.nextLine();
                if (decison2.equalsIgnoreCase("y")) {
                    continue;
                }
            } else if (decison.equalsIgnoreCase("3")) {
                resto.useWtJobdesk("q",resto.getChf());
                System.out.println("lets play another role: ");
                String decison2 = sc.nextLine();
                if (decison2.equalsIgnoreCase("y")) {
                    continue;
                }
            } else if (decison.equalsIgnoreCase("4")) {
                resto.viewStok();
                System.out.println("lets play another role: ");
                String decison2 = sc.nextLine();
                if (decison2.equalsIgnoreCase("y")) {
                    continue;
                }
            }
        }
    }
}
