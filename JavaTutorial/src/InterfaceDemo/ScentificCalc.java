package InterfaceDemo;

public class ScentificCalc implements MainCalc{

	int x1 = 22;
	@Override
	public void add() {
		System.out.println("This is sci calc - add");		
	}

	@Override
	public void sub() {
		System.out.println("This is sci calc - sub");		
		
	}
	public void mul() {
		System.out.println("This is sci calc - mul");		
		
	}
	
	public static void main(String[] args){
		ScentificCalc cal = new ScentificCalc(); // can access all methods
		MainCalc cal2 = new ScentificCalc(); // can access onlly interface (WebDriver example) methods
	//	MainCalc cal3 = new MainCalc();//Cannot create instantiate interface
	//	ScentificCalc cal4 = new MainCalc();//Cannot create instantiate interface & child cannot hold parent
		
		cal.add();
		cal.sub();
		cal.mul();
		
		
		cal2.add();
		cal2.sub();
	//	cal2.mul();//cannot access implementing class method
		
		
	//	WebDriver driver = new FirefoxDriver();//Selenium usage example
		
	//	cal.x = 111;//final field value cannot be changed
		
		System.out.println(cal2.x);
	}

}
