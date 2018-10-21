package library;


public class MultiTable
{
    // instance variables - replace the example below with your own
    public void MT(int n)
    {
      for(int i=1;i<=10;i++)
       {
         System.out.println(n +"*"+i+"="+n*i);
          
       }
    }
    
    public void MT1(int x, int y)
    {
       for(int i=1;i<=x;i++)
       {
          for (int j=1;j<=y;j++)
            { 
              System.out.print(" "+i*j);
            }
        System.out.println();    
       }
    } 
 }
