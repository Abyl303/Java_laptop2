package Project;

public class Main {
    public static void main(String[] args) {

        // 1️⃣ Создаём библиотеку
        Library library = new Library();

        // 2️⃣ Создаём предметы
        Book book1 = new Book(1, "Clean Code", "Robert Martin", 464);
        Book book2 = new Book(2, "Effective Java", "Joshua Bloch", 416);
        Magazine mag1 = new Magazine(3, "Java Monthly", 42);

        // 3️⃣ Добавляем в библиотеку
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(mag1);

        // 4️⃣ Регистрируем пользователя
        User user = new User("Alex", 101);
        library.registerUser(user);

        // 5️⃣ Показываем доступные предметы
        System.out.println("\n📚 Доступные предметы:");
        library.showAvailableItems();

        // 6️⃣ Пользователь берёт книгу
        System.out.println("\n➡️ Пользователь берёт книгу:");
        Item itemToBorrow = library.findItemById(1);
        user.borrowItem(itemToBorrow);

        // 7️⃣ Проверяем, что осталось доступно
        System.out.println("\n📚 Доступные предметы после взятия:");
        library.showAvailableItems();

        // 8️⃣ Смотрим, что у пользователя
        System.out.println();
        user.showBorrowedItems();

        // 9️⃣ Возвращаем книгу
        System.out.println("\n⬅️ Пользователь возвращает книгу:");
        user.returnItem(itemToBorrow);

        // 🔟 Финальная проверка
        System.out.println("\n📚 Доступные предметы после возврата:");
        library.showAvailableItems();
    }
}
