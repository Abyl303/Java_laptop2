package Tz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Task> list =new ArrayList<>();

        list.add(new Task(1, "Book", "Funny", "New"));
        list.add(new Task(2, "Water", "Goofy", "Old"));
        list.add(new Task(3, "Phone", "Loly", "In progress"));
        list.add(new Task(4, "Sim", "Funny", "New"));

        for (Task task : list) {
            System.out.println(task);
        }
    }
}
