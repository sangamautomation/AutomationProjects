package library;


/**
 * Write a description of class Examples here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numbers
{
    // instance variables - replace the example below with your own
    public void numberDisplay()
    {      
      int n,times=100;
      
      System.out.print("Displaying numbers 1 through 100: \n");
      for(n=1;n<=times;n++)
      {
          
          System.out.print(n+",");
        
    }  
  
} 

  public void primeNumbers()
  {
      int x=1, n=10;
      while(x<n)
      {
          if (x%n==0)
          {
          System.out.println("prime numbers are "+x);
          x++;
        }
          else if(x%n!=0)
          {
          System.out.println("Not divisible");
          x++;
        }
   
        }
}  
}
