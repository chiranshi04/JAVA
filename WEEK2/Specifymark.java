import java.util.Scanner;
class GradingSystem
{
    String marks_return(int t)
{
        if (t > 80 && t < 100) 
{
         return "Distinction category";
      } else if (t > 70 && t < 79)
{
         return "Merit Category";
      }
else 
{
         rWeturn t > 50 && t < 69 ? "Pass category" : "Fail category";
      }
    }
}
public class Specifymark
{
    public  void printmarks()
{
        Scanner scan = new Scanner(System.in);
        GradingSystem gs  = new GradingSystem();
        System.out.print("Enter your marks : ");
        int t = scan.nextInt();

        if(t<0)
{
            System.out.println("Marks cannot be negative");
        }
        else if(t>100)
{
            System.out.println("Marks cannot be greater then 100");
        }
        else
{
            System.out.println("You have scored : "+gs.marks_return(t));
        }
        scan.close();
    }
}
