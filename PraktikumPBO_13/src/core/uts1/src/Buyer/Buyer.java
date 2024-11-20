package Buyer;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import Resto.Resto;

public class Buyer extends Resto {
    private ArrayList<String> order;
    private int patient, bill;

    public Buyer() {
        int rndm = new Random().nextInt(3);
        this.order = new ArrayList<>();
        this.patient = rndm;
        this.bill = 0;
    }

    public ArrayList<String> getOrder() {
        return order;
    }

    public void addOrder(String input) {
        if (input.equals("burger")) {
            order.add("burger");
        } else if (input.equals("Kentang")) {
            order.add("kentang");
        } else if (input.equals("Beverages")) {
            order.add("beverages");
        }
    }

    void setBil(int input) {
        this.bill = input;
    }

   public String doOrdering() {
        Random prop = new Random();
        if (order.size() == 0) {
            int probability = prop.nextInt(0, 2);
            if (probability == 0) {
                return "Buyer: I want Burger";
            } else if (probability == 1) {
                return "Buyer: I want Kentang";
            } else {
                return "Buyer: I want Beverages";
            }
        } else {
            int probability = prop.nextInt(0, 10);
            if (probability == 0) {
                return "Buyer: I want Burger";
            } else if (probability == 1) {
                return "Buyer: I want Kentang";
            } else if (probability == 2) {
                return "Buyer: I want Beverages";
            } else {
                return "Thats all ";
            }
        }
    }

    public void paying() {
        System.out.println("here my cash is: " + bill);
    }

    void updateRating() {
        Scanner sc = new Scanner(System.in);
        int input = 1;
        System.out.println("click yes if you feel better");
        String rate = sc.nextLine();
            if(rate.equalsIgnoreCase("yes")){
                super.setRating(input);
            } else {
                super.setRating(input -1);
            }
        }
    }
