package Orders;

public class Food implements PricedItem {
    private String name;
    private double price;
    private int weightGr;

    public Food(String name,double price,int weightGr){
        setName(name);
        setPrice(price);
        setWeightGr(weightGr);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
    public int getWeightGr(){
        return weightGr;
    }

    public void setName(String name){
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name.trim();
    }
    public void setPrice(double price){
        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price=price;
    }
    public void setWeightGr(int weightGr){
        if (weightGr <= 0) {
            throw new IllegalArgumentException("Weight must be greater than 0");
        }
        this.weightGr=weightGr;
    }

    @Override
    public String toString() {
        return name + " (" + weightGr + "gr): " + price;
    }
}
