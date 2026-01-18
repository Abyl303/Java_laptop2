package Shopp;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args){
        Shop shop=new Shop();
        Scanner sc=new Scanner(System.in);

        shop.addProduct(new Product(1, "Water",400));
        shop.addProduct(new Product(2, "Terea",500));
        shop.addProduct(new Product(3, "Chocolate",1400));
        shop.addProduct(new Product(4, "Tea",700));
        shop.addProduct(new Product(5, "Bread",100));

        shop.showProducts();

        while(true){
            System.out.println("\n1. Show products");
            System.out.println("2. Find product by id");
            System.out.println("3. Remove product by id");
            System.out.println("0. Exit");

            int choice=sc.nextInt();

            if(choice==0){
                System.out.println("Bye");
                break;
            }

            switch (choice){
                case 1:
                    shop.showProducts();
                    break;

                case 2:
                    int idd= sc.nextInt();
                    shop.findProductById(idd);
                    break;

                case 3:
                    int id1= sc.nextInt();
                    shop.removeProductById(id1);
                    shop.showProducts();
                    break;

                default:
                    System.out.println("Wrong option");
            }
        }
        sc.close();
    }
}
