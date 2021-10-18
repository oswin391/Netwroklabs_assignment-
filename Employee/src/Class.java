
public class Class {
	private int number = 60;
	class Inner{
		int innernum = 20;
		void show(){
			System.out.println("Inner class"+innernum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class ob = new Class();
		System.out.println(ob.number);
		Class.Inner in = ob.new Inner();
		in.show();
	}

}
