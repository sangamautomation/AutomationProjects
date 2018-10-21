package test;

public class OverloadingExample {

	public static void show(){
		System.out.println("Show this!");
	}
	
	public static void show (String name){
		System.out.println("Show "+name+ "!");
	}

	public static void addNumbers(int a, int b){
		System.out.println(a+b);
	}
/*	public void addNumbers(int a, int b, int c)
	public int addNumbers(int a, int b, int c, int d)
	private double addNumbers (int a, double b)
	private void addNumber(int a, int b) // Not overloaded
*/	
	
	private static String addNumbers(String x, String y){
	return x+" "+y;
	}
	
	public static void main(String[] args) {

show();	
show("John");
addNumbers(2,3);
/*addNumbers(2,3,4);
int sum = addNumbers(1,2,3,4);
double sumOfNumbers = addNumbers(2, 3.4);*/
String concatenatedString = addNumbers("john", "doe");
System.out.println("concatenated string = "+"Welcome "+concatenatedString+"!");

	}

}
