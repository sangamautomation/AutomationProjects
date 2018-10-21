package library;


/**
 * Write a description of class simpleInterest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class simpleInterest
{
    // instance variables - replace the example below with your own
    public float si()
    {
        // initialise instance variables
       int p=1000,r=8,t=2;
       float value;     
       value=(p*r*t)/100;
       System.out.println("The rate of interest is " +value);
       return value;
    }

    }
