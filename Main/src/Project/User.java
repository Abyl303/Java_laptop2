package Project;

import java.util.LinkedList;

public class User {
    private String name;
    private int userid;
    private LinkedList<Item> borrowedItems = new LinkedList<>();

    public User(String name, int userid) {
        this.name = name;
        this.userid = userid;
        this.borrowedItems = borrowedItems;
    }

    public String getName() {
        return name;
    }

    public int getUserid() {
        return userid;
    }

    public LinkedList<Item> getBorrowedItems() {
        return borrowedItems;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setBorrowedItems(LinkedList<Item> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

    public void borrowItem(Item item) {
        if (item == null) return;

        if (item.borrow()) { // ✅ было Item.borrow()
            borrowedItems.add(item);
            System.out.println(name + " взял(а): " + item.getTitle());
        } else {
            System.out.println("Нельзя взять: предмет недоступен");
        }
    }

    public void returnItem(Item item) {
        if (item == null) return;

        if (!borrowedItems.contains(item)) {
            System.out.println("У пользователя нет этого предмета");
            return;
        }

        if (item.returnItem()) { // ✅ было Item.returnItem()
            borrowedItems.remove(item);
            System.out.println(name + " вернул(а): " + item.getTitle());
        } else {
            System.out.println("Возврат невозможен (предмет уже был доступен)");
        }
    }

    public void showBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println(name + " ничего не взял(а).");
            return;
        }

        System.out.println("У " + name + " на руках:");
        for (int i=0; i<borrowedItems.size(); i++) {
            Item item = borrowedItems.get(i);
            System.out.println(" - " + item.getInfo()); }
    }
}
