package Tech;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList <LibraryItem> list =new LinkedList<>();

        list.add(new Book(1, "Harry Potter", 1999, false, "Dorian Grey", 120, "Adventure"));
        list.add(new Magazine(2, "Harry Potter", 1999, false, 1234, "July"));

        System.out.println("=== Library items ===");
        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i).getInfo());
        }
        Iterator<LibraryItem> iterator = list.iterator();

        while (iterator.hasNext()) {
            LibraryItem item = iterator.next();
            if (item.getId() % 2 == 0) {
                iterator.remove();
            }
        }
        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i).getInfo());
        }



    }
}
