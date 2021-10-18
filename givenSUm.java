package javaProject;
import java.util.Scanner;
public class givenSUm {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter  number");
		int i = in.nextInt();
		
		int sum = 0;
		 
        int n = 0;
		while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
 
        return sum;
	}

}
