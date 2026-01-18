package Shopp;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> items=new ArrayList<>();

    public Shop(){
        this.items = new ArrayList<>(items);
    }

    public ArrayList<Product> getItems(){
        return new ArrayList<>(items);
    }
    public void setItems(ArrayList<Product> items){
        this.items = new ArrayList<>(items);
    }

    public void addProduct(Product product){
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        items.add(product);
    }

    public boolean removeProductById(int id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    public void showProducts(){
        if (items.isEmpty()) {
            System.out.println("Shop is empty");
            return;
        }
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }

    public void findProductById(int id){
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                System.out.println(items.get(i));
                return;
            }
        }
        System.out.println("Product not found");
    }
}
