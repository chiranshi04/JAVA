public class LinearSearchToolkit 
{
        static boolean contains(int[] values, int target)
  {
             if(values.length==0){
            System.err.println("Nothing inside the array passed.");
            return false;
        }
        else
             {

            for(int i=0;i<values.length;i++)
                {
                    if(values[i]==target)
                    {
                        return true;
                    }
                }
                return false;
            }
        }
        static int firstIndexOf(int[] values, int target)
        {
             if(values.length==0)
             {
            System.err.println("Nothing inside the array passed.");
            return 0;
        }
        else
             {

            for(int i=0;i<values.length;i++)
            {
                if(values[i]==target)
                {
                    return i;
                }
            }
            return 0;
        }
        }
        static int lastIndexOf(int[] values, int target)
  {
             if(values.length==0)
             {
            System.err.println("Nothing inside the array passed.");
            return 0;
        }
        else{

            int lst=0;
            for(int i=0;i<values.length;i++)
            {
                if(values[i]==target)
                {
                    lst=i;
                }
            }
            return lst;
        }
        }
        static int countOccurrences(int[] values, int target)
        {
             if(values.length==0)
             {
            System.err.println("Nothing inside the array passed.");
            return 0;
        }
        else{

            int count =0;
            for(int i=0;i<values.length;i++)
            {
                if(values[i]==target)
                {
                    count++;
                }
            }
            return count;
        }
    }

}
