package loops;
import java.util.*; 
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> a = new LinkedList<String>();
		a.add("oswin");
		a.add("is");
		a.add("god's");
		a.add("friend");
		
		Iterator<String> it =  a.iterator();  
		while( it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
