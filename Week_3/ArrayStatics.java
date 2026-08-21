public class ArrayStatics
{
    static int sum(int[] values)
  {
          if(values.length==0)
          {
            System.err.println("Nothing inside the array passed.");
            return 0;
        }
        else{

            int i=0;
            for(int j=0;j<values.length;j++)
            {
                i+=values[j];
            }
            return i;
        }
    }
    static double average(int[] values)
  {
          if(values.length==0)
          {
            System.err.println("Nothing inside the array passed.");
            return 0;
        }
        else{

            double avg = sum(values)/((double)values.length);
            return avg;
        }
    }
    static int minimum(int[] values)
  {
    if(values.length==0){
            System.err.println("Nothing inside the array passed.");
            return 0;
        }
        else{
            
            int i = Integer.MAX_VALUE;
            for(int j=0;j<values.length;j++){
                if(i>values[j]){
                    i=values[j];
                }
            }
            return i;
        }
    }
    static int maximum(int[] values)
  {
        if(values.length==0){
            System.err.println("Nothing inside the array passed.");
            return 0;
        }
        else
        {

            int i = Integer.MIN_VALUE;
            for(int j=0;j<values.length;j++){
                if(values[j]>i){
                    i= values[j];
                }
            }
            return i;
        }
    }
     static int countEven(int[] values)
  {  
        if(values.length==0){
            System.err.println("Nothing inside the array passed.");
            return 0;
        }
        else{

            int count = 0;
            for(int i=0; i<values.length ; i++)
            {
                if(values[i]%2==0){
                    count++;
                }
            }
            return count;
        }
     }
    static void printSignCounts(int[] values)
  {
          if(values.length==0){
            System.err.println("Nothing inside the array passed.");
        }
        else
          {

            int positive = 0;
            int negative = 0;
            int zero = 0;
            for(int i=0;i<values.length;i++)
            {
                if(values[i]==0){
                    zero++;
            }
            else if(values[i]>0)
            {
                positive++;
            }
            else{
                negative++;
            }
        }
        System.out.println("The positive numbers in the array are : "+positive);
        System.out.println("The negative numbers in the array are : "+negative);
        System.out.println("The zero in the array are : "+zero);
    }
    }
    
}
