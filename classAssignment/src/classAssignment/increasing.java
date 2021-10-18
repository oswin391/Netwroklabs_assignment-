package classAssignment;
import java.util.*;
public class increasing {
	private int num,s;
	boolean flag = false;
	public void calculateSum(double n)
	{
		s = num%10;
		num = num/10;
		while(num>0)
		{
		if(s<=num%10)
		{
			flag = true;
			break;
		}
		s = num%10;
		num = num/10;
		}
		if(flag) {
			System.out.println("Digits are not in increasing order.");
		}
		else
		{
			System.out.println("Digits are in increasing order.");
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increasing in = new increasing();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		double n = s.nextDouble();
		in.calculateSum(n);
		

	}

}
