public class BookLoanDriver  
{
    public static void main(String[] args) throws Exception
  {
        BookLoan loan = new BookLoan("CH");
        
        System.out.println(loan.borrowbook());
        System.out.println(loan.borrowbook());
        System.out.println(loan.returnBook());
        System.out.println(loan.isAvailable());
        
    }
}
 
