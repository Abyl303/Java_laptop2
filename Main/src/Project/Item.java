package Project;

public abstract class Item {
    private final long id;
    private String title;
    private boolean isAvailable;

    public Item(long id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean borrow() {
        if (!isAvailable) return false;
        isAvailable = false;
        return true;
    }

    public boolean returnItem() {
        if (isAvailable) return false;
        isAvailable = true;
        return true;
    }

    public abstract String getInfo();
}
