package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int x=10;
		int y=0;
		try
		{
		int z=x/y;
		System.out.println(z);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//throw e;
			
		}
		
		finally{
			System.out.println("Performed exception handling");

		}

	}

}
