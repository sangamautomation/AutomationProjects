package test;

public class AscendingArray {
	public static void main(String args[])
	{
		int x[]={4, 8, 10, 2};
		int temp;
		for(int i=0;i<x.length;i++)
		{
		 for(int j=i+1;j<x.length;j++)
		 {
			if(x[i]>x[j])
			{
			 temp=x[i];
			 x[i]=x[j];
			 x[j]=temp;
			}
		 }
	System.out.print(" " +x[i]);
		}
		

}
}

