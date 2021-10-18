package javaProject;
import java.util.Scanner;
public class Large2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the a number");
		int a = in.nextInt();
		
		System.out.println("enter the b number");
		int b = in.nextInt();
		int number = 0;
		
		if(a>b) {
			number = a;
		} 
		else  {
			number = b;
		}
		
		
		System.out.print("the greater number is" +number);

	}

}
