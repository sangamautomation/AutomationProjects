package test;
public class Array
{
    public static void main(String[] args)
    {
      int a[]={5,10,2,1,5};
      int sum=0;
      
      for(int counter=0;counter<a.length;counter++)
      {
        sum=sum+a[counter];
      }
      
      System.out.println("The sum of total numbers is " +sum);
    }
}
