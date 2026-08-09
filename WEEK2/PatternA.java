class PatternA
{
   void pattern1()
  {
   for(int i=0;i<4;i++)  
   {
      for(int j=0;j<4;j++) 
      {
         System.out.print("*");
      }
      System.out.println();
   }  
}
   void pattern2() 
  {
      for(int i=0;i<4;i++)
      {
         for(int j=0;j<=i;j++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   }
   void pattern3(){
      for(int i=0;i<4;i++){
         for(int j=0;j<=i;j++){
            System.out.print(j+1);
         }
         System.out.println();
      }
   }
   void pattern4(){
      for(int i=4;i>0;i--)
      {
         for(int j=0;j<i;j++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   }
   void pattern5()
  {
      for(int i=0;i<4;i++)
      {
         for(int j=0;j<=i;j++)
         {
            System.out.print(i+1);
         }
         System.out.println();
      }
   }
   }
