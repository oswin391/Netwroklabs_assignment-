package classAssignment;
import java.util.*;

public class FristNnumBer {
	private int s = 0;
	public int calculateSum(int n) 
	{
		for(int i=0;i<=n;i++)
		{
			if(i%3==0||i%5==0)
			{
				s+=i;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FristNnumBer in = new FristNnumBer();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		System.out.println(in.calculateSum(n));

	}

}
