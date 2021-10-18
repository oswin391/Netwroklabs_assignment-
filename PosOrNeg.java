package javaProject;
import java.util.*;
public class PosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int input = in.nextInt();
		
		if(input > 0 )
		{
		System.out.println("Number is positive");	
		}
		
		else if (input < 0)
		{
			System.out.println("Number is negative");	
		}
		

	}

}
