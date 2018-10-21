package test;

import java.util.Scanner;

public class CompInt
{
  public static void main(String[] args)
  {
    double amount, rate, term, CI;
    Scanner s=new Scanner(System.in);
    System.out.println("Please enter the amount, rate and term");
    amount=s.nextInt();
    rate=s.nextInt();
    term=s.nextInt();
    CI=amount*Math.pow(1+rate/100,term);
    System.out.println("The compound interest is " +CI);
} 
}
