package Orders;

public class Drink implements PricedItem {
    private String name;
    private double price;
    private int volumeMl;

    public Drink(String name,double price,int volumeMl){
        setName(name);
        setPrice(price);
        setVolumeMl(volumeMl);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
    public int getVolumeMl(){
        return volumeMl;
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
    public void setVolumeMl(int volumeMl){
        if (volumeMl <= 0) {
            throw new IllegalArgumentException("VolumeMl cannot be negative");
        }
        this.volumeMl=volumeMl;
    }

    @Override
    public String toString() {
        return name + " (" + volumeMl + "ml): " + price;
    }
}
