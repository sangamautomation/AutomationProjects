/**
 * 
 */
package test;

/**
 *Test case name: Overriding Example
 *Updated on: 10/13/2018
 *Suite: Regression
 *
 */
public class OverridingParent {
	
	int x;
	int y;
	public void setup(){
		x = 10;
		y=20;
		System.out.println("x="+x);
		}
	
	int add(int x, int y){
		
		System.out.println("The sum = "+(x+y));
		return x+y;
	
	}
	

}
