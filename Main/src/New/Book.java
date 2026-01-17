package New;

public class Book {
    private long id;
    private String title;
    private String author;
    private int year;
    private String genre;
    private static boolean status;

    public Book(long id, String title, String author, int year, String genre, boolean status){
        this.id=id;
        setTitle(title);
        setAuthor(author);
        setYear(year);
        setGenre(genre);
        this.status=status;
    }

    public long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public String getGenre(){
        return genre;
    }
    public static boolean getStatus(){
        return status;
    }

    public void setId(long id){
        this.id=id;
    }
    public void setTitle(String title){
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title не может быть пустым");
        }
        this.title = title;
    }
    public void setAuthor(String author){
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author не может быть пустым");
        }
        this.author = author;
    }
    public void setYear(int year){
        if (year<=1450) {
            throw new IllegalArgumentException("Год издания некорректный");
        }
        this.year =year;
    }
    public void setGenre(String genre){
        if (genre == null || genre.isEmpty()) {
            throw new IllegalArgumentException("Genre не может быть пустым");
        }
        this.genre = genre;
    }
    public void setStatus(boolean status){
        this.status=status;
    }
    public void printInfo(){
        System.out.println("ID:"+id+
                            ". Title: "+title+
                            ". Author: "+author+
                            ". Year: "+year+
                            ". Genre: "+genre+
                            ". Status: "+status);

    }

}
