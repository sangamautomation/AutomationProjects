package library;

public class Arithmetic {
	
	 double c;
	
	//Non-Static Reusable Functions Definitions
	public void addNumbers (double a, double b){
		c = a+b;
		System.out.println("Addition of "+a+" and "+b+" = "+ c);		
	}
	
	public void subtractNumbers (int a, int b){
		c = a-b;
		System.out.println("Difference between "+a+" and "+b+" = "+ c);		
	}

	public  void multiplyNumbers (int a, int b){
		c = a*b;
		System.out.println("Product of "+a+" and "+b+" = "+ c);		
	}

	public  void divideNumbers (double a, double b){
		c = a/b;
		System.out.println("Division between "+a+" and "+b+" = "+ c);		
	}
	
	//Static function
	
	public static int moduloOfNumbers (int a, int b){
		System.out.println("Remainder of two numbers when they are divided in that order = "+a%b);

		return a%b;
	}
	 

}
