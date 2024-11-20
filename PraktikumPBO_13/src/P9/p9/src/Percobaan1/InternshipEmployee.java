package Percobaan1;

public class InternshipEmployee extends Employee {
    private int length;

    InternshipEmployee(String n, int l){
        this.name = n;
        this.length = l;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String getEmployeeInfo() {
       String info = super.getEmployeeInfo() + "\n";
       info += "registered as internship employee " + length + " month";
       return info;
    }

}
