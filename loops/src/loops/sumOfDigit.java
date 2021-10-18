package loops;
import java.util.*;
public class sumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int dig,sum = 0;
           Scanner in = new Scanner(System.in);
           System.out.println("enter the number");
           int input = in.nextInt();
           
           while(input >0)
           {
        	   dig = input%10;
        	   sum = sum+dig;
        	   input = input/10;
           }
           
           System.out.println(sum);
	}

}
