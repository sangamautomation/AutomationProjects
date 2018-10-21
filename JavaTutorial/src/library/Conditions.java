package library;

public class Conditions {

	// Returns minimum value out of 2 numbers
	
	public int min(int number1, int number2){
		int minimum;
		if(number1 < number2)
			minimum = number1;
		else
			minimum = number2;
		System.out.println("The minimum of "+number1+ " and "+number2 + " is "+ minimum);
		return minimum;
	}
	
	// Returns maximum value out of 2 numbers
	
		public int max(int number1, int number2){
			int minimum;
			if(number1 > number2)
				minimum = number1;
			else
				minimum = number2;
			System.out.println("The maximum of "+number1+ " and "+number2 + " is "+ minimum);
			return minimum;
		}
		
		
		// Returns minimum value out of 3 numbers
		
		public int min(int number1, int number2, int number3){
			int minimum;
			if((number1 < number2)  && (number1 < number3))
				minimum = number1;
			else if (number2 < number1 && number2 < number3)
				minimum = number2;
			else
				minimum = number3;
 			System.out.println("The minimum of "+number1+ ", "+number2 + " and "+number3 + " is "+ minimum);
			return minimum;
		}

		// Returns maximum value out of 3 numbers
		
		public int max(int number1, int number2, int number3){
			int maximum;
			if((number1 > number2)  && (number1 > number3))
				maximum = number1;
			else if (number2 > number1 && number2 > number3)
				maximum = number2;
			else
				maximum = number3;
 			System.out.println("The maximum of "+number1+ ", "+number2 + " and "+number3 + " is "+ maximum);
			return maximum;
		}
}
