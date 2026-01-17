package Tech;

public class Magazine extends LibraryItem {
    private int issueNumber;
    private String month;

    public Magazine(long id, String title, int year, boolean isBorrowed, int issueNumber,String month)
    {
        super(id, title, year, isBorrowed);
        setIssueNumber(issueNumber);
        setMonth(month);

    }

    public int getIssueNumber(){
        return issueNumber;
    }
    public String getMonth(){
        return month;
    }

    public void setIssueNumber(int issueNumber){
        if (issueNumber <= 0) {
            throw new IllegalArgumentException("Issue number must be greater than 0");
        }
        this.issueNumber = issueNumber;
    }
    public void setMonth(String month){
        if (month == null || month.trim().isEmpty()) {
            throw new IllegalArgumentException("Month cannot be empty");
        }
        this.month = month.trim();
    }
    @Override
    public String getInfo() {
        return "Magazine | ID: " + getId() +
                ", Title: " + getTitle() +
                ", Year: " + getYear() +
                ", Issue: " + issueNumber +
                ", Month: " + month +
                ", Borrowed: " + isBorrowed();
    }
}
