package Project;

public class Book extends Item{
    private String author;
    private int pages;

    public Book(long id,String title,String author,int pages){
        super(id, title);
        this.author=author;
        this.pages=pages;
    }

    public String getAuthor(){
        return author;
    }
    public int getPages(){
        return pages;
    }

    public void setAuthor(String author) {
        this.author=author;
    }
    public void setPages(int pages){
        if (pages <= 0) {
            throw new IllegalArgumentException("Pages must be positive");
        }
        this.pages = pages;
    }

    @Override
    public String getInfo() {
        return "ID: "+getId()+". Title: "+getTitle()+". Available: "+isAvailable()+". Author: "+author+". Pages: "+pages;
    }
}
