package javaProject;

import java.util.Scanner;

public class MonthsDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the month number");
		int input = in.nextInt();
		
		if(input == 1|| input == 3|| input == 5|| input == 7|| input ==8 ||input ==10 ||input ==12  )
		{
			System.out.println("the days in a month is 31");
		}
		
		else if(input == 4|| input == 6|| input == 9|| input == 11)
		{
			System.out.println("the days in a month is 30");
		}
		
		else if(input == 2)
		{
			System.out.println("the days in a month is 28");
		}
		
		else
		{
			System.out.println("the number should be between 1 to 12");
		}

	}

}
