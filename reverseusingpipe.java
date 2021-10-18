package classAssignment3;
import java.security.DrbgParameters.NextBytes;
import java.util.*;
public class reverseusingpipe {
	
	public String main(String s)
	{
		StringBuffer str = new StringBuffer(s);
		str.append('|');
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		str.append(sb);
		return str.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated 
		reverseusingpipe p = new reverseusingpipe();
		Scanner in = new Scanner(System.in);
		System.out.println("enter the words");
		String  s =in.next();
		System.out.println(p.main(s));

	}

}
