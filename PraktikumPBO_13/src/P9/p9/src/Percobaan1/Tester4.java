package Percobaan1;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eb = new ElectricityBill(5, "R-1");
        ow.pay(eb);
        System.out.println("-----------------------");
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("------------------------");
        InternshipEmployee iEmp = new InternshipEmployee("Andik", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("--------------------------");
        ow.showMyEmployee(iEmp);
    }
}
