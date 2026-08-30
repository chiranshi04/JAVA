public class BookLoan 
{
    private String title;
    private String author;
    private String bookcode;
    private boolean loaned_status;
    public BookLoan(String title, String author, String bookcode, boolean loaned_status) 
  {
        this.title = title;
        this.author = author;
        this.bookcode = bookcode;
        this.loaned_status = loaned_status;
    }
    public BookLoan(String title)
  {
        this.title = title;
    }
    public BookLoan(String title, String author)
  {
        this.title = title;
        this.author = author;
    }
    public BookLoan(String title, String author, String bookcode)
  {
        this.title = title;
        this.author = author;
        this.bookcode = bookcode;
    }
    public boolean borrowbook()
    {
        if(loaned_status==true)
        {
            return false;
        }
        else
        {
            loaned_status=true;
            return true;
        }
    
    }
    public boolean returnBook()
    {
        loaned_status=0;
        return true;
    }    
    public boolean isAvailable()
    {
        if(loaned_status!=true)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getBookcode() {
        return bookcode;
    }
    public boolean isLoaned_status() {
        return loaned_status;   
    }
    @Override
    public String toString() {
        return "BookLoan [title=" + title + ", author=" + author + ", bookcode=" + bookcode + ", loaned_status="
                + loaned_status + ", isAvailable=" + isAvailable() + "]";
    }
}
