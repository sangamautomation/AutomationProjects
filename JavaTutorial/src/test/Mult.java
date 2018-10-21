package test;

import library.*;
public class Mult
{
    
    public static void main(String args[])
    {
        //MultiTable m= new MultiTable();
        //m.MT(2);(Prints 2 table as 2*1=2, 2*2=4......
        //m.MT1(5,10); //(prints multiplication table 1 2 3 4 5 6 7 8 9 10
                                                  //2 4 6 8..........                        
                                                  // .
        
                                                  // 5 10 15...........50
        
        int x, y;                                          
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
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