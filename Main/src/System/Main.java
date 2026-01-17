package System;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ArrayList<Employee> list=new ArrayList<>();

        list.add(new Developer(1, "David", 150000, 3));
        list.add(new Manager(2, "Amanda", 120000, 4));

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}