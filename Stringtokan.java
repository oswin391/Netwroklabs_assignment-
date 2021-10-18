package classAssignment3;
import java.util.*;
public class Stringtokan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("\nenter the numbes");
		String dig = scan.nextLine();
		StringTokenizer token = new StringTokenizer(dig);
		int digi =0, sum =0;
		//System.out.println("Enter numbers are");
		while(token.hasMoreTokens())
		{
			String s = token.nextToken();
			digi =Integer.parseInt(s);
			//System.out.print(digi+" ");
			sum = sum+digi;
		}
		System.out.println();
		System.out.println(sum);
		

	}

}
