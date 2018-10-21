package test;

import java.util.Scanner;
public class Aver
{
   public static void main(String[] args)
   {
     int total=0, temp, counter=0;
     float average;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter five numbers:");
     
     while(counter<5)
     { 
      temp=s.nextInt();
      total=total+temp;
      counter++;
     
    }
    average=total/5;
    System.out.println("The average is " +average);
}
}

