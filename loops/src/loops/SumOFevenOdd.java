package loops;
import java.util.Scanner;
public class SumOFevenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evensum =0,oddsum=0 ;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int input = in.nextInt();
		
		for(int i = 1 ;i <= input ; i++)
		{
			
			
				if(i%2 ==0)
				{
					evensum = evensum+i;
				}
				else
				{
					oddsum =oddsum+i;
				}
			
			
		}
		
		System.out.println(evensum);
		System.out.println(oddsum);

	}

}
