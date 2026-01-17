import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args){
        ArrayList <Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println(list);

        ArrayList<Integer> unique = new ArrayList<>();
        for (int value : list) {
            if (!unique.contains(value)) {
                unique.add(value);
            }
        }
        System.out.println(unique);
    }
}
