package test;

// Print the numbers from 1 to n where n is passed as an argument
public class Example2
{

    

    public static void main(String []args)
    {
        // initialise instance variables
            // System.out.println("Argument passing "+ args[0]);
           //     System.out.println("Argument passing "+ args[1]);
            //    System.out.println("Argument passing length "+ args.length);
            //  j=String.valueOf(args[0]);
            int j;
            j=Integer.parseInt(args[0]);
            System.out.println("Numbers from 1 through "+ j + "are: "); 
        for(int i=1;i<=j;i++)
        {
             
        System.out.print(i +", ");
        
   
    }
    }

    
}
