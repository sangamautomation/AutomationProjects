/**
 * Desciption: Testing out new class
 */
package test;

import library.Poly;

/**
 * @author sangam
 */
public class NewClass
{
	public static void main(String args[])
	{
		Poly p=new Poly();
		int x = p.add(8, 4);
		
		int y = x+5;
		
		System.out.println(y);
		
		p.add(12, 10, 15);
		Poly.add(14.5, 12);
		
	}
}
	
