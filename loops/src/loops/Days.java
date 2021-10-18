package loops;


import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number:");
		int day = in.nextInt();
		
		System.out.println(Weekday(day));
	}

	private static String Weekday(int day) {
		// TODO Auto-generated method stub
		String dayName = "";
		switch(day)
		{
		case 1: dayName = "monday";
		break;
		case 2: dayName = "tuesday";
		break;
		case 3: dayName = "wednesday";
		break;
		case 4: dayName = "thursday";
		break;
		case 5: dayName = "friday";
		break;
		case 6: dayName = "saturday";
		break;
		case 7: dayName = "sunday";
		break;
		default:dayName = "invalid day";
		}
		return dayName ;
	}

}
