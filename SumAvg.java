package javaProject;
import java.util.Scanner;
public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=0,s=0;
		   
	        System.out.println("Input the 5 numbers : ");  
	        
		
			for (i=0;i<5;i++)
			{
				Scanner in = new Scanner(System.in);
		        n = in.nextInt();
	  		s +=n;
		}
		 int avg=s/5;
		System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);

	}

}
