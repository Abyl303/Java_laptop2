import java.util.Scanner;

public class User {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = sc.nextLine();

        System.out.print("Введите возраст: ");
        int age = sc.nextInt();
        sc.nextLine();  // очистка после nextInt()

        System.out.print("Введите должность: ");
        String position = sc.nextLine();

        System.out.print("Введите зарплату: ");
        double salary = sc.nextDouble();

        System.out.print("Введите ID клиента (число): ");
        int id = sc.nextInt();

        // Создаем объекты разных типов
        Person user1 = new Person(name, age);
        user1.info();
        DatabaseHandler.insertPerson(user1);

        Employee user2 = new Employee(name, age, position, salary);
        user2.info();
        DatabaseHandler.insertPerson(user2);

        Client user3 = new Client(name, age, String.valueOf(id));
        user3.info();
        DatabaseHandler.insertPerson(user3);

        sc.close();
    }
}
