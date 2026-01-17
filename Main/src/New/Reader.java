package New;

import java.util.ArrayList;

public class Reader {
    private long id;
    private String name;
    private int maxBooks;
    private ArrayList<Book> borrowedBooks=new ArrayList<>();

    public Reader(long id,String name,int maxBooks){
        this.id=id;
        setName(name);
        setMaxBooks(maxBooks);
        this.borrowedBooks = new ArrayList<>();
    }

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getMaxBooks(){
        return maxBooks;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setId(long id){
        this.id=id;
    }
    public void setName(String name){
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name не может быть пустым");
        }
        this.name = name;
    }
    public void setMaxBooks(int maxBooks){
        if (maxBooks<=0) {
            throw new IllegalArgumentException("Книги не может быть пустым");
        }
        this.maxBooks = maxBooks;
    }

    public boolean canBorrow(){
        return borrowedBooks.size() < maxBooks;
    }
    public void borrowBook(Book book){
        if (book == null) {
            throw new IllegalArgumentException("Книга не может быть null");
        }
        if (!canBorrow()) {
            throw new IllegalStateException("Достигнут лимит книг");
        }
        if (book.getStatus()) { // true = занято
            throw new IllegalStateException("Книга уже занята");
        }

        borrowedBooks.add(book);
        book.setStatus(true);
    }
    public void returnBook(Book book){
        if (book == null) {
            throw new IllegalArgumentException("Книга не может быть null");
        }
        if (!borrowedBooks.contains(book)) {
            throw new IllegalArgumentException("Эта книга не у данного читателя");
        }

        borrowedBooks.remove(book);
        book.setStatus(false);
    }
    public void printInfo(){
        System.out.println("Reader ID: " + id +
                ". Name: " + name +
                ". Limit: " + maxBooks +
                ". On hands: " + borrowedBooks.size());
    }
}
