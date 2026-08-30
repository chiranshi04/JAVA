public class BankAccountDriver
{
    public static void main(String[] args) throws Exception 
{
        BankAccount first = new BankAccount("85555HEE", null);
        // BankAccount second = new BankAccount("8596dhjdn", null);
        first.deposit(85);
        first.deposit(-96);
        first.deposit(0);
        System.out.println(first.withdraw(800000));

    }
}
