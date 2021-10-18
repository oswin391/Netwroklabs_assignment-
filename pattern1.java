package classAssignment2;

public class pattern1 {
	
 void show(int n)
 {
	 for(int i = n-1; i>0;i--)
	 {
		 for(int j=0; j<=i;j++)
		 {
			 System.out.print(j);
		 }
		 System.out.println();
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1 ne = new pattern1();
		ne.show(5);

	}

}
