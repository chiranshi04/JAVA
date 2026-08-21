public class MatrixOperations 
{
    static int[] rowSums(int[][] matrix)
  {
    int[] rsum = new int[matrix.length];
    int sum=0;
        for(int i=0;i<matrix.length ;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                sum+=matrix[i][j];
            }
            rsum[i] = sum;
            sum = 0;
        }
    
    return rsum;
}
    static int[] columnSums(int[][] matrix)
  {
        int[] csum = new int[matrix[0].length];
        int sum = 0;
        for(int i=0;i<csum.length;i++)
        {

            for(int j=0;j<matrix.length;j++)
            {
                sum += matrix[j][i];
            }
            csum[i] = sum;
            sum =0 ;
        }
        return csum;
    }
    static int[][] add(int[][] first, int[][] second)
  {
        int [][] two_arr = new int[first.length][first[0].length];
        for(int i=0;i<first.length;i++)
        {
            for(int j = 0;j<first[0].length;j++)
            {
                two_arr[i][j] = first[i][j] + second[i][j];
            }
        }
        return two_arr;
    }
    static int[][] transpose(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            int temp=0;
            for(int j=0;j<matrix[0].length;j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
    static void printMatrix(int[][] matrix)
  {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] multiply(int[][] first, int[][] second)
    {
        int [][] product = new int[first.length][second[0].length];
        for(int i=0;i<first.length;i++)
        {
            for(int k=0;k<second[i].length;k++)
            {
                int sum=0;
                for (int l = 0; l < first[0].length; l++) 
                {
                    sum+=(first[l][i]*second[i][l]);
                }
                product[i][k] = sum;
            }
        }
        return product;
    }
    static int[] columnstt(int arr[][])
    {
        int[] twist = new int[arr.length];
        for(int i=0;i<arr[0].length;i++)
        {
            int sum=0;
            for(int j=0;j<arr.length;j++)
            {
                sum+=arr[j][i];
            }
            twist[i] = sum;
        }
        return twist;
    }
    static int[] rowst(int arr[][])
    {
        int[] twist = new int[arr.length];
        for(int i=0;i<arr[0].length;i++)
        {
            int sum=0;
            for(int j=0;j<arr.length;j++)
            {
                sum+=arr[i][j];
            }
            twist[i] = sum;
        }
        return twist;
    }
}
