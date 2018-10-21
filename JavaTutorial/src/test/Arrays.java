package test;

public class Arrays {
	public static void main(String args[])
	{
		String name[]={"abc","def","zyz"};
		System.out.println("the length of array is " +name.length);
		System.out.println("the value in second array is " +name[1]);
		
		int x[][] =new int[2][3];
		x[0][0] = 2;
		
		int y[] = {2,3,4,5,6};
		
		int z[][] = {{1,2},{3,4}};
		
		for (int i = 0; i < z.length; i++) {
			for (int k = 0; k < z.length; k++) {
				System.out.print(z[i][k]);
				System.out.print(" ");

			}
			System.out.println();
		}
		
		System.out.println("exit loop");
	}

}
