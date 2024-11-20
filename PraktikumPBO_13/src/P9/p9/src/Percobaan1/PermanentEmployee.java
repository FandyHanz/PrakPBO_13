package Percobaan1;

public class PermanentEmployee extends Employee implements Ipayable{
    private int salary;

    PermanentEmployee(String n, int s){
        this.name = n;
        this.salary = s;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmount() {
        return (int) (salary + 0.05 * salary);
    }

    @Override
    public String getEmployeeInfo() {
       String info = super.getEmployeeInfo() + "\n";
       info += "registered as permanent employee " + salary+ " month";
       return info;
    }
}
