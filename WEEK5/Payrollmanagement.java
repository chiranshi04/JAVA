interface Payable
{
    double calculatePayment();
}
abstract class Employee implements Payable
{
    private String id;
    private String name;
    Employee(String name)
    {
        this.id = "01";
        this.name= name;
    }
    Employee()
    {
        id="XXXX";
        name = "Unknown";
    }
    String getName()
    {
        return  name;
    }

}
class SalariedEmployee extends Employee
{
    private double salary;
    SalariedEmployee(String name,double salary)
    {
        super(name);
        this.salary = salary;
    }
    @Override 
    public double calculatePayment()
    {
        return salary;
    }
    double getSalary()
    {
        return salary;
    }
}
class HourlyEmployee extends Employee
{
    private double salaryPerHr;
    private double working_hrs;
    HourlyEmployee(String name,double salaryPerHr,double working_hrs)
    {
        super(name);
        this.salaryPerHr= salaryPerHr;
        this.working_hrs = working_hrs;
    }
    @Override 
    public double calculatePayment()
    {
        return (salaryPerHr*working_hrs);
    }
}
class Invoice implements Payable
{
    private String item;
    private int qunt;
    private double price;

    Invoice(String item,int qunt,double price)
    {
        this.item = item;
        this.qunt = qunt;
        this.price = price;
    }
    @Override 
    public double calculatePayment()
    {
        return price*qunt;
    }
    @Override 
    public String toString()
    {
        return  "Item : " + item +
               "\nQuantity : " + qunt +
               "\nPayment : " + calculatePayment();
    }
}
