package test;

public class ExceptionHandlingExample {
	
	public static void divide(int x, int y)
	{
		System.out.println("The quotient = " + (x/y)); // + means concatenation of two different data types / when there is a string involved 
	}
	
	

	public static void main(String[] args) {
 
		
		try{
		
			divide(4, 0);
			
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.toString());
			//throw e;
		}
		
		finally{
			System.out.println("Finally block is executed....");
		}
		 
		
	}

}
