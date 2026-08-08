import java.util.Scanner;
public class Primenumber 
{
    void prime_checler()
{
        Scanner scan = new Scanner(System.in);
        int isprime = 0;
        System.out.print("Enter a number : ");
        int t=  scan.nextInt();
        for(int i=2;i<t/2;t++)
{
            if(t%i==0)
{
                isprime=0;
                return;
            }
            else
{
                isprime=1;
            }
        }
        if(isprime!=0
){
            System.out.println("It is not prime");
        }
        else
{
            System.out.println("it is prime");
        }
        scan.close();
    }   
}
