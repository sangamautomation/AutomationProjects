
package test;

import java.util.Scanner;

public class Rough
{
   public static void main(String[] args)
   {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your name here:");
    String temp=s.nextLine();
    Rough2 r=new Rough2();
    r.setName("Madhu");
    r.print();
    
    //System.out.println("the name you have entered is " +temp);
    }
}
