public class BankAccount
  {
    
    private String accountNumber;
    private String ownerName;
    private double balance;
    public String getAccountNumber() 
    {
        return accountNumber;
    }
    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", ownerName=" + ownerName + ", balance=" + balance
                + "]";
    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getBalance() {
        return balance;
    }
    
    public BankAccount(String AN,String name)
    {
        accountNumber = AN;
        ownerName = name;
        balance =  0;
    }
    public BankAccount(String AN,String name,double t)
    {
        accountNumber = AN;
        ownerName = name;
        if(t>0)
        {
            balance = t;
        }
        else{
            balance = 0;
            System.out.println("Enter the valid balance number.");
        }
    }
    boolean deposit(double amount)
    {
        if(amount>0)
        {
            balance += amount;
            return true;
        }
        else{
            return false;
        }
    }
    boolean withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            return true;
        }
        else
        {
            return false;
        }
    }
    

}
