package Tech;

public abstract class LibraryItem {
    private long id;          // лучше final, чтобы id не меняли
    private String title;
    private int year;
    private boolean isBorrowed;

    public LibraryItem(long id, String title, int year, boolean isBorrowed) {
        this.id = id;
        setTitle(title);            // важно: через сеттеры!
        setYear(year);
        this.isBorrowed = isBorrowed;
    }
    public LibraryItem(){}

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public boolean isBorrowed() {   // Java-style
        return isBorrowed;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title.trim();
    }

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();
        if (year < 1450 || year > currentYear) {
            throw new IllegalArgumentException("Year must be between 1450 and " + currentYear);
        }
        this.year = year;
    }

    // УБРАТЬ, чтобы статус не меняли напрямую:
    // public void setBorrowed(boolean isBorrowed) { this.isBorrowed = isBorrowed; }

    public abstract String getInfo();

    public void borrow() {
        if (isBorrowed) {
            throw new IllegalStateException("Item is already borrowed");
        }
        isBorrowed = true;
    }

    public void returnBack() {
        if (!isBorrowed) {
            throw new IllegalStateException("Item is not borrowed");
        }
        isBorrowed = false;
    }
}
