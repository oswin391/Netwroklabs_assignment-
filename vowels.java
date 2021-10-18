package javaProject;
import java.util.Scanner;
public class vowels {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the charecter");
		String input = in.nextLine();
		
		if(input =="a"|| input == "e" || input == "i" || input == "o"|| input == "u" || input =="A"|| input == "E" || input == "I" || input == "O"|| input == "U")
		{
			System.out.println("they are vowels");
		}
		else
		{
			System.out.println("they are Consonant");
		}
	}

}
