package test;

import library.*;
public class Swap
{
    // instance variables - replace the example below with your own
    //public static void main(String []args)
    {
      // Swapping s= new Swapping();
      // s.num(3,4);
      // initialise instance variables
     
    }
    
    public static void main(String args[])
    {
     int x,y, a,b,c;
     x=Integer.parseInt(args[0]);
     y=Integer.parseInt(args[1]);
     System.out.println("The initial values of x and y are: "+x+" and "+y+"");
     
     c=Integer.parseInt(args[0]);
     a=Integer.parseInt(args[1]);
     b=c;
     System.out.println("The new values of x and y are: "+a+" and "+b+"");
     
    }
}   
