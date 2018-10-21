package test;

public class Array1 {
	public static void main(String args[])
	{
		//String names[][]=new String[2][2];
		String names[][]={{"Madhu","Siri"},{"Sangam","Ya"}};
		for(int i=0;i<names.length;i++)
		{
			for(int j=0;j<names.length;j++)
			{	
				System.out.print(names[i][j]);
				System.out.print(" ");
			}
			System.out.println();		  

		}
		  
	}
}
