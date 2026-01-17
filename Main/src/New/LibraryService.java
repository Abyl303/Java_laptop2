package New;

import java.util.ArrayList;

public class LibraryService {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Reader> readers = new ArrayList<>();

    // ===== BOOKS =====
    public void addBook(Book book) {
        if (book == null) throw new IllegalArgumentException("book == null");
        if (findBookById(book.getId()) != null) {
            throw new IllegalArgumentException("Книга с таким ID уже существует: " + book.getId());
        }
        books.add(book);
    }

    public void removeBook(long bookId) {
        Book book = findBookById(bookId);
        if (book == null) throw new IllegalArgumentException("Книга не найдена: " + bookId);
        if (book.getStatus()) throw new IllegalStateException("Нельзя удалить: книга сейчас выдана");
        books.remove(book);
    }

    public Book findBookById(long bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) return b;
        }
        return null;
    }

    public void printAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Книг нет.");
            return;
        }
        for (Book b : books) b.printInfo();
    }

    public void printAvailableBooks() {
        boolean any = false;
        for (Book b : books) {
            if (!b.getStatus()) { // false = свободна
                b.printInfo();
                any = true;
            }
        }
        if (!any) System.out.println("Нет доступных книг.");
    }

    public void printBorrowedBooks() {
        boolean any = false;
        for (Book b : books) {
            if (b.getStatus()) { // true = занята
                b.printInfo();
                any = true;
            }
        }
        if (!any) System.out.println("Нет выданных книг.");
    }

    // ===== READERS =====
    public void registerReader(Reader reader) {
        if (reader == null) throw new IllegalArgumentException("reader == null");
        if (findReaderById(reader.getId()) != null) {
            throw new IllegalArgumentException("Читатель с таким ID уже существует: " + reader.getId());
        }
        readers.add(reader);
    }

    public Reader findReaderById(long readerId) {
        for (Reader r : readers) {
            if (r.getId() == readerId) return r;
        }
        return null;
    }

    public void printAllReaders() {
        if (readers.isEmpty()) {
            System.out.println("Читателей нет.");
            return;
        }
        for (Reader r : readers) r.printInfo();
    }

    // ===== LOANS =====
    public void giveBook(long readerId, long bookId) {
        Reader reader = findReaderById(readerId);
        if (reader == null) throw new IllegalArgumentException("Читатель не найден: " + readerId);

        Book book = findBookById(bookId);
        if (book == null) throw new IllegalArgumentException("Книга не найдена: " + bookId);

        // основная логика уже в Reader
        reader.borrowBook(book);

        System.out.println("Выдано: книга " + bookId + " -> читателю " + readerId);
    }

    public void returnBook(long readerId, long bookId) {
        Reader reader = findReaderById(readerId);
        if (reader == null) throw new IllegalArgumentException("Читатель не найден: " + readerId);

        Book book = findBookById(bookId);
        if (book == null) throw new IllegalArgumentException("Книга не найдена: " + bookId);

        reader.returnBook(book);

        System.out.println("Возврат: книга " + bookId + " <- от читателя " + readerId);
    }
}
