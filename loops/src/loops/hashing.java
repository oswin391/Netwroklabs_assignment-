package loops;
import java.util.*;  
public class hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("oswin");
		set.add("vijju");
		set.add("rego");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
