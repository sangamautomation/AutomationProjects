package test;

public class InhertTest {
	
	public static void main(String[] args){
		
		OverridingParent p = new OverridingParent();//Instantiating Parent class
		OverridingChild c = new OverridingChild();//Instantiating Child class
		
		p.setup();
		p.x = 12;
		p.add(13, 20);
		
		c.add(11, 23);
		
		
	}

}
