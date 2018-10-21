package test;

import library.*;

public class MyProgram
{
    
    public static void main(String args[]  ){
        Maths m = new Maths();
        m.add(2, 4);
        //or
        new Maths().add(2,4);//both have the same 
       
        m.subtract(5,1);//nonstatic
        m.divide(2.2,5);
        
               
       // Week w = new Week();
        //or 
        Week.dayOfTheWeek(1);//Calling method in a static way (static means only one object of class)
        
        Week w = new Week();//Calling method in a non-static way (multiple object of class can be created)
        String dayName= w.dayOfTheWeek("2");
        System.out.println("New day of the week is "+ dayName );
                
       
        
        Numbers e= new Numbers();
        //m.close();
        //e.numberDisplay();
        e.primeNumbers();
                
        
        //static methods can be called only in static class. 
        //nonstatic method calling---object name.instance data member(nonstatic data member) name ex: m.add(2,4);
        //static method calling------class name.static data member name ex: Week.dayOfTheWeek(1);

    }
    
    
}
