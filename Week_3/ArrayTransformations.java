public class ArrayTransformations 
{
     static void reverseInPlace(int[] values)
  {
        int temp;
        for(int i=0;i<values.length/2;i++)
        
        {
            temp = values[i];
            values[i] = values[values.length-1-i];
            values[values.length-1-i] = temp;
        }
     }
      static int[] reversedCopy(int[] values)
  {
        int[] copied = new int[values.length];
        for(int i=0;i<values.length;i++)
        {
            copied[i] = values[values.length-1-i];
        }
        return copied;
      }
       static int removeValue(int[] values, int target)
       {
            for(int i=0;i<values.length;i++)
            {
                if(values[i]==target){
                    return i;
                }
            }
            return 0;
       }
       static int[] runningSum(int[] values)
  {
        int sum=0;
        for(int i=0;i<values.length;i++)
        {
            values[i] = values[i]+sum;
            sum+=values[i];
        }
        return values;
       }
}
