package Project;

public class Magazine extends Item{
    private int issueNumber;

    public Magazine(long id,String title,int issueNumber){
        super(id, title);
        this.issueNumber=issueNumber;
    }

    public int getIssueNumber(){
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber){
        this.issueNumber=issueNumber;
    }

    @Override
    public String getInfo() {
        return "ID: "+getId()+". Title: "+getTitle()+". Issuenumber: "+issueNumber;
    }
}
