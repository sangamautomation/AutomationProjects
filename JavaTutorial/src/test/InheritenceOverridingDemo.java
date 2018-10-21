package test;

import library.ParentClass;

public class InheritenceOverridingDemo extends ParentClass {
	
	static int x  = 11;
	  public void mul(){
		  System.out.println("Child class - mul");
		  
		 
	  }
	  
	  
	  public void div(){
		  System.out.println("Child class - div");
		  
		 
	  }
	  
	  
	  // Overriding 
	  public void add(){
		  
		  System.out.println("dddd");
	  }
	  
	  
	public static void main(String[] args) {
		
		InheritenceOverridingDemo obj = new InheritenceOverridingDemo();
		
		System.out.println(obj.x);

		obj.add();
		obj.sub();
		obj.mul();
		obj.div();

 
	}

}
