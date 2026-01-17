package New;

public class Main {
    public static void main(String[] args) {

        LibraryService library = new LibraryService();

        // книги
        Book b1 = new Book(1, "1984", "Orwell", 1949, "Dystopia", false);
        Book b2 = new Book(2, "Clean Code", "Robert Martin", 2008, "Programming", false);

        // читатель
        Reader r1 = new Reader(1, "Ivan", 3);

        // регистрация
        library.addBook(b1);
        library.addBook(b2);
        library.registerReader(r1);

        // работа
        library.giveBook(1, 2);
        library.printBorrowedBooks();

        library.returnBook(1, 2);
        library.printAvailableBooks();
    }
}
