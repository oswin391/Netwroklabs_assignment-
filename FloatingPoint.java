package javaProject;
import java.util.*;
public class FloatingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("inter the number:");
		double input =  in.nextDouble();
		
		if( input > 0) 
		{
		   if(input < 1)
		   {
			   System.out.println("the number is small");
			 
		   }
		   else if(input > 1000000)
		   {
			   System.out.println("the number is larger");
		   }
		   else 
		   {
			   System.out.println("the number is positive");
		   }
		}
		else if(input < 0 )
		{
			if(input < 1)
			   {
				   System.out.println("the number is small");
				 
			   }
			   else if(input > 1000000)
			   {
				   System.out.println("the number is larger");
			   }
			   else 
			   {
				   System.out.println("the number is negative ");
			   }
		}

	
	}
}
