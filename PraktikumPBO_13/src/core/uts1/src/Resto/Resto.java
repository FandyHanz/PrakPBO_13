package Resto;
import Buyer.Buyer;
import java.util.Scanner;
import java.util.ArrayList;
import pekerja.Cashier;
import pekerja.Chef;
import pekerja.Waiter;

public class Resto {
    public String[] name = { "Bun", "Lettuce", "Tomato", "Beef", "Kentang", "Beverages" };
    public int[] stok = { 100, 100, 100, 100, 100, 100 };
    ArrayList<Buyer> byrr = new ArrayList<>();
    int rate = 0;
    ArrayList<Buyer> byr = new ArrayList();
    Chef chf = new Chef();
    Cashier cs = new Cashier();
    Waiter wt = new Waiter();
    public void viewStok() {
        Scanner sc = new Scanner(System.in);
        int decision;
        boolean isLoop = true;
        while (isLoop) {
            System.out.println("==========================");
            System.out.println("choose the option below:");
            System.out.println("==========================");
            System.out.println("1. Burger ingredients");
            System.out.println("2. Beverages ingredients");
            System.out.println("3. Kentang ingredients");
            System.out.print("click it: ");
            decision = sc.nextInt();
            switch (decision) {
                case 1:
                    for (int i = 0; i < stok.length - 2; i++) {
                        System.out.println(name[i] + ": " + stok[i]);
                    }
                    System.out.println("return to menus");
                    decision = sc.nextInt();
                    if (decision == 1) {
                        isLoop = false;
                    }
                    break;
                case 2:
                    System.out.println(name[5] + ": " + stok[5]);
                    System.out.println("return to menus");
                    decision = sc.nextInt();
                    if (decision == 1) {
                        isLoop = false;
                    }
                    break;
                case 3:
                    System.out.println(name[4] + ": " + stok[4]);
                    System.out.println("return to menus");
                    decision = sc.nextInt();
                    if (decision == 1) {
                        isLoop = false;
                    }
            }
        }
    }
    public Waiter getWt() {
        return wt;
    }

    public void useWtJobdesk(String input, Chef ch){
        wt.useJobDesk(input, ch);
    }

    public void updateStok() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int decision;
        boolean isLoop = true;

        while (isLoop) {
            System.out.println("==========================");
            System.out.println("choose the option below:");
            System.out.println("==========================");
            System.out.println("1. Burger");
            System.out.println("2. Beverages");
            System.out.println("3. Kentang");
            System.out.print("click it: ");
            decision = sc.nextInt();
            switch (decision) {
                case 1:
                    for (int i = 0; i < stok.length - 2; i++) {
                        System.out.println(name[i] + ": " + stok[i]);
                        System.out.println("Masukan Nama untuk direfill: ");
                        String choose = sc1.nextLine();
                        if (name[i].equalsIgnoreCase(choose)) {
                            int temp = i;
                            System.out.println("Masukan jumlah yang dibutuhkan: ");
                            int value = sc1.nextInt();
                            stok[temp] = value;
                        }
                    }
                    System.out.println("return to menus");
                    decision = sc.nextInt();
                    if (decision == 1) {
                        isLoop = false;
                    }
                    break;

                case 2:
                    System.out.println(name[4] + ": " + stok[4]);
                    for (int i = 0; i < stok.length; i++) {
                        System.out.println("Masukan Nama untuk direfill: ");
                            String choose = sc1.nextLine();
                                if (name[i].equalsIgnoreCase(choose)) {
                                    int temp = i;
                                    System.out.println("Masukan jumlah yang dibutuhkan: ");
                                    int value = sc1.nextInt();
                                    stok[temp] = value;
                        }
                    }
                    System.out.println("return to menus");
                    decision = sc.nextInt();
                    if (decision == 1) {
                        isLoop = false;
                    }
                    break;
                case 3:
                    System.out.println(name[3] + ": " + stok[3]);
                    for (int i = 0; i < name.length; i++) {
                        System.out.println("Masukan Nama untuk direfill: ");
                            String choose = sc1.nextLine();
                                if (name[i].equalsIgnoreCase(choose)) {
                                    int temp = i;
                                    System.out.println("Masukan jumlah yang dibutuhkan: ");
                                    int value = sc1.nextInt();
                                    stok[temp] = value;
                                }
                            }
                            System.out.println("return to menus");
                            decision = sc.nextInt();
                            if (decision == 1) {
                                isLoop = false;
                            }
                            break;
                        }
                    }
                }

                public void setRating(int input){
                    this.rate = input;
                }

                public String viewRateInfo(){
                    return "curently rate based is: " + rate;
                }

                public void addNewBuyer(){
                    byr.add(new Buyer());
                }

                public ArrayList<Buyer> getByr() {
                    return byr;
                }

                public void useJobdeskCashier(String input, Buyer buyer){
                    cs.useJobDesk(input, buyer);
                }

                public void removeBuyer(){
                    byr.remove(0);
                }

                public void addToWaitingList(Buyer byr){
                    byrr.add(byr);
                }

                public Chef getChf() {
                    return chf;
                }
            }
            
