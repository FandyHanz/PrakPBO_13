package makanan;

import java.util.ArrayList;

public class Kentang extends Item {
    private String orderName;
    private double price;
    private int time;
    private ArrayList<Ingredients> ingredient;

    public Kentang(){
        this.orderName = "Kentang";
        this.price = 10000;
        ingredient = new ArrayList <Ingredients>();
    }

    public void setTime(int input) {
        this.time = 100 - input;
    }

    public double getPrice(){
        return price;
    }

    public void setIngredients(String ingredients) {
        Ingredients ing = new Ingredients(ingredients);
        ingredient.add(ing);

    }

    public ArrayList<Ingredients> getIngredient() {
        return ingredient;
    }

}
