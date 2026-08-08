import java.util.Scanner;
public class Gcd{
    int repetition(int t1,int t2){
        if(t2!=0){
            repetition(t2, t1%t2);
        }
        else{
             return t2;
        }
        return 0;
        
    }

    void greteae(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int first = scan.nextInt();
        System.out.println("Enter the number : ");
        int second = scan.nextInt();
        repetition(first,second);
        scan.close();
    }
}
