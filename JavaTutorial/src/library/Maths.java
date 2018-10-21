package library;


public class Maths
{
    // instance variables - replace the example below with your own
    
    public int add(int x, int y)
    {
        
        int z;
        z=x+y;
        System.out.println("The sum of "+x+" and "+y +" is "+z);
        return z;
    }
    
    public int subtract(int b, int a)
    {
        
        int c;
        c=b-a;
        System.out.println("The difference of "+b+" and "+a +" is "+c);
        return c;
    }
    
    public double divide(double m, double n)
    {
        double p;
        p=m/n;
        System.out.println("The result of dividing "+ m +" and "+ n +" is "+ p);
        return p;
    }
}
