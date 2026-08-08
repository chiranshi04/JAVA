import java.util.Scanner;
public class LeapYear 
{
    boolean isleapYear(int year)
{
        if(year%400==0 && year%100!=0 && year %4==0 )
{
            return true;
        }
        else{
            return false;
        }
    }
    void yearmacher()
{

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year :");
        int year =scan.nextInt();
        System.out.println("Leap year : "+isleapYear(year));
        scan.close();
    }
}
