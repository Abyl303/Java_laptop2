package Orders;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<PricedItem> items;

    public Order(){
        this.items = new ArrayList<>();
    }

    public List<PricedItem> getItems(){
        return items;
    }

    public void setItems(List<PricedItem> items){
        this.items=items;
    }

    public void addItem(PricedItem item){
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        items.add(item);
    }
    public boolean removeItemByName(String name){
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        String target = name.trim();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equalsIgnoreCase(target)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }
    public double total(){
        double sum=0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).getPrice();
        }
        return sum;
    }
    public String receipt(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order:\n");

        for (PricedItem item : items) {
            sb.append("- ").append(item.getName())
                    .append(": ").append(item.getPrice())
                    .append("\n");
        }

        sb.append("Total: ").append(total());
        return sb.toString();
    }

}
