package Project;

import java.util.ArrayList;

public class Library {
    private ArrayList<Item> items=new ArrayList<>();
    private ArrayList<User> users=new ArrayList<>();

    public Library(ArrayList<Item> items,ArrayList<User> users){
        this.items=items;
        this.users=users;
    }

    public Library() {

    }

    public ArrayList<Item> getItems(){
        return items;
    }
    public ArrayList<User> users(){
        return users;
    }

    public void setItems(ArrayList<Item> items){
        this.items=items;
    }
    public void setUsers(ArrayList<User> users){
        this.users=users;
    }

    public void addItem(Item item){
        if (item == null) return;
        items.add(item);
    }
    public void registerUser(User user){
        if (user == null) return;
        users.add(user);
    }
    public void showAvailableItems(){
        boolean found = false;

        for (int i=0; i<items.size(); i++) {
            Item item = items.get(i);
            if (item.isAvailable()) {
                System.out.println(item.getInfo());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Нет доступных предметов.");
        }
    }
    public Item findItemById(int id){
        for (int i=0; i<items.size(); i++) {
            Item item = items.get(i);
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
