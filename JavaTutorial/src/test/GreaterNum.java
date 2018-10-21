package test;

public class GreaterNum {
	public static void main(String args[])
	{
		int x[]={1, 4, 3, 9, 10};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
		if(x[i]>max)
		{
			max=x[i];
		}
       
   	
	}
        System.out.println(max);
	}
	
}
