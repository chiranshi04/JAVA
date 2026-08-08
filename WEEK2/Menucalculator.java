import java.util.Scanner;
public class Menucalculator {
    void Calculator(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int n1 = scan.nextInt();
        System.out.println("Enter number 1 ");
        int n2 = scan.nextInt();
        System.out.println("Enter your choice :\n\t1.Add\n\t2.Subtract\n\t3.Multiply\n\t4.Divide\n\t5.Exit");
        int t = scan.nextInt();
        switch (t) {
            case 1:
                System.out.println("Sum is: "+(n1+n2));
                break;
            case 2:
                System.out.println("Subtraction is: "+(n1-n2));
                break;
            case 3:
                System.out.println("Prouct is: "+(n1*n2));
                break;
            case 4:
                if(n2==0){
                    System.out.println("Denominator cannot be zero");
                    break;
                }
                else{
                    System.out.println("Divison is : "+(n1/n2));
                    break;
                }
            case 5:
                System.out.println("Bye bye ");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
        scan.close();
    }
}
