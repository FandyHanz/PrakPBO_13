package Percobaan1;

public class Owner {
    public void pay(Ipayable p){
        System.out.println("total payment: " + p.getPaymentAmount());
        if(p instanceof ElectricityBill){
            ElectricityBill eb = (ElectricityBill) p;
            System.out.println("" + eb.getBillInfo());
        } else if (p instanceof PermanentEmployee){
            PermanentEmployee pe = (PermanentEmployee) p;
            System.out.println("" + pe.getEmployeeInfo());
        }
    }

    public void showMyEmployee(Employee e){
        System.out.println("" + e.getEmployeeInfo());
        if(e instanceof PermanentEmployee){
            System.out.println("you must pay him/her monthly");
        } else {
            System.out.println("you dont need to pay him/her");
        }
    }
}
