package Tech;

public class Book extends LibraryItem {

    private String author;
    private int pages;
    private String genre;

    public Book(long id, String title, int year, boolean isBorrowed,
                String author, int pages, String genre) {
        super(id, title, year, isBorrowed);
        setAuthor(author);
        setPages(pages);
        setGenre(genre);
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be empty");
        }
        this.author = author.trim();
    }

    public void setPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Pages must be greater than 0");
        }
        this.pages = pages;
    }

    public void setGenre(String genre) {
        if (genre == null || genre.trim().isEmpty()) {
            throw new IllegalArgumentException("Genre cannot be empty");
        }
        this.genre = genre.trim();
    }

    @Override
    public String getInfo() {
        return "Book | ID: " + getId() +
                ", Title: " + getTitle() +
                ", Author: " + author +
                ", Year: " + getYear() +
                ", Pages: " + pages +
                ", Genre: " + genre +
                ", Borrowed: " + isBorrowed();
    }
}
