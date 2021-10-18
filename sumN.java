package javaProject;
import java.util.Scanner;
public class sumN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the frist n number");
		int input = in.nextInt();
		
		for(int i = 1 ;i<= input; i++)
		{
		    sum +=i;
			System.out.println(sum);
			
		}
		
		

	}

}
