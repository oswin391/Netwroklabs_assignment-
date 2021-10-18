package javaProject;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter the year");
		int input = in.nextInt();
		
		if(input % 400 == 0)
		{
			System.out.println("the year is a leap year");
		}
		else if(input % 100 == 0)
		{
			System.out.println("this not a leap year");
		}
		else if(input % 4 == 0)
		{
			System.out.println("this is a leap year");
		}
		else 
		{
			System.out.println("this not a leap year");
		}
	}

}
