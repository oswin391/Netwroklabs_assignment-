package loops;
import java.util.*;
public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int num = in.nextInt();
		int fato = 1;
		for(int i = num;i>=1;i--)
		{
			fato = fato*i;
		}
		System.out.println(fato);

	}

}
