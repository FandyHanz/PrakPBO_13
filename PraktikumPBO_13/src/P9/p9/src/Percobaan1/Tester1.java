package Percobaan1;

public class Tester1 {
   public static void main(String[] args) {
    PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
    InternshipEmployee iEmp = new InternshipEmployee("Andik", 5);
    ElectricityBill eB = new ElectricityBill(5, "A-1");

    Employee e;
    Ipayable p;
    e = pEmp;
    e = iEmp;
    p = pEmp;
    p = eB;
   }
}
