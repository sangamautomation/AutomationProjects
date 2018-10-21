package test;

import library.Mathematics;

public class ParameterPassing {

	public static void main(String[] args) {
		Mathematics obj1=new Mathematics();
		int y= obj1.add(12, 14);
		System.out.println("The sum is " +y);
		
//		int x= Maths.add(15, 28);
		//System.out.println("The sum of two numbers is " +x);
	}

	
}
