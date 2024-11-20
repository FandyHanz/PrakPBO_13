package Percobaan1;

public class ElectricityBill implements Ipayable {
    private int kwh;
    private String category;

    ElectricityBill(int k, String c){
        this.kwh = k;
        this.category = c;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public int getKwh() {
        return kwh;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public int getBasePrice(){
        int bPrice = 0;
        switch (category) {
            case ("R-1"): bPrice = 100; break;
            case ("R-2"): bPrice = 200; break;
        }
        return bPrice;
    }

    @Override
    public int getPaymentAmount() {
        return kwh * getBasePrice();
    }

    public String getBillInfo(){
        return "Kwh: " + kwh + "\n" +
            "category: " + category + "\n";
    }


}
