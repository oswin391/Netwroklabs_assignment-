package loops;
import java.util.*;
public class Mulitable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int input = in.nextInt();
		
		for(int i = input; i<=10;i++)
		{
			for(int j =1 ;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
		}

	}

}
