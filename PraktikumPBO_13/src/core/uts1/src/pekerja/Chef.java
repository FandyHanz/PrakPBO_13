package pekerja;

import java.util.Scanner;

import Resto.Resto;

import java.util.ArrayList;

public class Chef {
    public Scanner sc = new Scanner(System.in);
    public ArrayList<String> order = new ArrayList<>();
    public boolean isLoop = true;

    public void useJobdesk(String input, Resto rs) {
        if (input.equalsIgnoreCase("y")) {
            System.out.println("Done some order:");
            System.out.println("1. burger");
            System.out.println("2. Beverages");
            System.out.println("3. kentang");
            String decison = sc.nextLine();
            if (decison.equalsIgnoreCase("1")) {
                while (isLoop) {
                    System.out.println("List job to done");
                    System.out.println("1. Cut the bun into 2 pieces");
                    System.out.println("2. toast the bun in margarine");
                    System.out.println("3. toast beef in margarine");
                    System.out.println("4. Prepare the dishes (tomato, lettuce)");
                    System.out.println("5. Rack the Patty beef lettuce and tomato from down to top");
                    System.out.println("6. Give some tomato sauce and garnish with little spray of butter");
                    System.out.println("7. Ready To serve");
                    System.out.println("Done some list: ");
                    String decision = sc.nextLine();
                    if (decision.equalsIgnoreCase("1")) {
                        System.out.println("Cut the bun into 2 pieces");
                        rs.stok[0] -= 1;
                    } else if (decision.equalsIgnoreCase("2")) {
                        System.out.println("toast the bun in margarine");
                    } else if (decision.equalsIgnoreCase("3")) {
                        System.out.println("toast beef Patty in margarine");
                        rs.stok[3] -= 1;
                    } else if (decision.equalsIgnoreCase("4")) {
                        System.out.println("Prepare the dishes (tomato, lettuce)");
                        rs.stok[1] -= 1;
                        rs.stok[2] -= 1;
                    } else if (decision.equalsIgnoreCase("5")) {
                        System.out.println("Rack the beef Patty lettuce and tomato from down to top");
                    } else if (decision.equalsIgnoreCase("6")) {
                        System.out.println("Give some tomato sauce and garnish with little spray of butter");
                    } else if (decision.equalsIgnoreCase("7")) {
                        System.out.println("the food handled to waiter");
                        order.add("burger");
                        isLoop = false;
                    }
                }
            } else if (decison.equalsIgnoreCase("2")) {
                while (isLoop) {
                    System.out.println("List Job to Done:");
                    System.out.println("1. Prepare the cup");
                    System.out.println("2. Pour the drink on the cup");
                    System.out.println("3. Give some topping");
                    System.out.println("4. Ready to Serve");
                    System.out.println("Done some list: ");
                    String decision = sc.nextLine();
                    if (decision.equalsIgnoreCase("1")) {
                        System.out.println("Prepare the cup");
                    } else if (decision.equalsIgnoreCase("2")) {
                        System.out.println("Pour the drink on the cup");
                        rs.stok[5] -= 1;
                    } else if (decision.equalsIgnoreCase("3")) {
                        System.out.println("Give some topping");
                    } else if (decision.equalsIgnoreCase("4")) {
                        System.out.println("the drink handled to waiters");
                        order.add("beverages");
                        isLoop = false;
                    }
                }
            } else if (decison.equalsIgnoreCase("3")) {
                while (isLoop) {
                    System.out.println("List Job to Done:");
                    System.out.println("1. Cut the kentang into wedges");
                    System.out.println("2. Deep fry the kentang");
                    System.out.println("3. rinse the oil, give it ith some seasoning while tossing");
                    System.out.println("4. Ready to serve");
                    System.out.println("Done some List: ");
                    String decision = sc.nextLine();
                    if (decision.equalsIgnoreCase("1")) {
                        System.out.println("Cut the kentang into wedges");
                        rs.stok[4] -= 1;
                    } else if (decision.equalsIgnoreCase("2")) {
                        System.out.println("Deep fry the kentang");
                    } else if (decision.equalsIgnoreCase("3")) {
                        System.out.println("rinse the oil, give it ith some seasoning while tossing");
                    } else if (decision.equalsIgnoreCase("4")) {
                        System.out.println("the food handled to waiters");
                        order.add("kentang");
                        isLoop = false;
                    }
                }
            }
        }
    }
}
