package loops;
import java.util.Scanner;
public class primeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int input = in.nextInt();
		
		for(int i =2; i< input;i++)
		{
			while(input%i ==0)
			{
				System.out.println(i +" ");
				input = input/i;
			}
		}
		if(input>2) {
			System.out.println(input);
		}

	}

}
