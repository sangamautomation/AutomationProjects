package library;

public class Conditional {

	//Maximum & Minimum of 2 numbers

	public static void maxMinOfNumber(int a, int b){

		if(a>b){
			System.out.println("The max number is "+ a);
			System.out.println("The min number is "+ b);
		}
		else if (a == b){
			System.out.println("Both numbers are equal");
		}

		else{
			System.out.println("The max number is "+ b);
			System.out.println("The min number is "+ a);
		}
		System.out.println("=================================\n");
	}



	public static void maxMinNumbers(long a, long b){

		if(a>b){
			System.out.println("The max number is "+ a);
			System.out.println("The min number is "+ b);
		}
		else{
			System.out.println("The max number is "+ b);
			System.out.println("The min number is "+ a);

		}

		System.out.println("=================================\n");

	}

	//Overloading
	public static void maxMinNumbers(double a, double b){

		if(a>b){
			System.out.println("The max number is "+ a);
			System.out.println("The min number is "+ b);
		}
		else{
			System.out.println("The max number is "+ b);
			System.out.println("The min number is "+ a);

		}

		System.out.println("=================================\n");

	}

	//Function to display the name of the week if the number of the week is passed
	public void weekDays(int a){

		switch (a) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("MOnday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("PLease enter any number from 1 to 7 only!");
			break;
		}


	}

	public void nestedIfs(int a, int b){

		if(a>b){
			System.out.println(" a is greater than b ");
			if(a>=b)
				System.out.println("a is greater than or equala to b");

		}
	}
	
	//For Loop Example
	public void displayNumbers(int maxNumberToDisplayFrom1){
		
		for (int i =1; i<=maxNumberToDisplayFrom1 ; i++)
			System.out.println(i);
		
/*		while (maxNumberToDisplayFrom1> 1000) {
		//Execute this code	
		}
		
		do {
			//Execute this code	
		} while (maxNumberToDisplayFrom1> 1000);
*/		
	}
	
	
}
