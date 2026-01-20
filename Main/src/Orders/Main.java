package Orders;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Order order=new Order();

        order.addItem(new Drink("Latte", 1200,300));
        order.addItem(new Food("Sandwich", 1800, 250));

        System.out.println(order.receipt());

    }
}
