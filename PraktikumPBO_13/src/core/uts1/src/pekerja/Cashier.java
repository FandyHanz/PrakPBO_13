package pekerja;

import java.util.Scanner;
import Buyer.Buyer;
import Resto.Resto;
import makanan.Burger;
import makanan.Beverages;
import makanan.Kentang;

public class Cashier {
    public void useJobDesk(String input, Buyer buyer) {
        Scanner sc = new Scanner(System.in);
        String conversation = "";
        if (input.equalsIgnoreCase("q")) {
            System.out.println("may, i help you. Can i get your order please:");
            conversation = buyer.doOrdering();
            buyer.addOrder(conversation);
            System.out.println(conversation);
            sc.nextLine();
            useJobDesk(conversation, buyer);
        } else if (input.equalsIgnoreCase("Buyer: I want Burger")) {
            buyer.addOrder("burger");
            System.out.println("anything else:");
            conversation = buyer.doOrdering();
            buyer.addOrder(conversation);
            System.out.println(conversation);
            sc.nextLine();
            useJobDesk(conversation, buyer);
        } else if (input.equalsIgnoreCase("Buyer: I want Beverages")) {
            buyer.addOrder("Beverages");
            System.out.println("anything else:");
            conversation = buyer.doOrdering();
            buyer.addOrder(conversation);
            System.out.println(conversation);
            sc.nextLine();
            useJobDesk(conversation, buyer);
        } else if (input.equalsIgnoreCase("Buyer: I want kentang")) {
            buyer.addOrder("kentang");
            System.out.println("anything else:");
            conversation = buyer.doOrdering();
            buyer.addOrder(conversation);
            System.out.println(conversation);
            sc.nextLine();
            useJobDesk(conversation, buyer);
        } else if (input.equalsIgnoreCase("thats all")) {
            buyer.paying();
            System.out.println("please wait");
        }
    }

    public double doCalculation(Buyer buyer) {
        double price = 0;
        for (int i = 0; i < buyer.getOrder().size(); i++) {
            if (buyer.getOrder().equals("burger")) {
                Burger bgr = new Burger();
                price = bgr.getPrice();
            } else if (buyer.getOrder().equals("Beverages")) {
                Beverages bvg = new Beverages();
                price = bvg.getPrice();
            } else {
                Kentang kntg = new Kentang();
                price = kntg.getPrice();
            }
        }
        return price;
    }
}
