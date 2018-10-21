package library;

public class ChildClass extends ParentClass {
	
	
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
		
		
		ChildClass obj = new ChildClass(); // Access all methods
		ParentClass obj2 = new ChildClass(); //Access only Parent class (Selenium ex)
	//	ChildClass obj3 = new ParentClass(); //Illegal as child cannot hold parent
		ParentClass obj4 = new ParentClass(); // Access only Parent class methods

		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		
		obj2.add();
		obj4.sub();
		
	//	WebDriver driver = new ChromeDriver();

 
	}

}
