import java.util.Scanner;
public class Numberreversl
  {
 
    int rev(int number)
    {
    int reverse_number=0;
    while(number!=0)
    {
        if(reverse_number>10)
        {

            reverse_number += number%10;
            reverse_number = reverse_number*10;
            number=number/10;
        }
        else
        {
            reverse_number += number%10;
            number=number/10;
        }
    }
    return reverse_number;
 }

void  number()
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int t=scan.nextInt();
    int f = rev(t);
    System.out.println("The reversed number is : "+f);
    scan.close();
 }
}
