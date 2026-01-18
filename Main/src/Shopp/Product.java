package Shopp;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id,String name,double price){
        this.id=id;
        setName(name);
        setPrice(price);
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public void setName(String name){
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name.trim();
    }
    public void setPrice(double price){
        if(price<=0){
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        this.price=price;
    }

    @Override
    public String toString() {
        return "Name: "+name+". Price: " + price;
    }
}
