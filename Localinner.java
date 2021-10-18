
public class Localinner {
	private int number = 47;
	void show()
	{
     class local{
			void display()
			{
				System.out.println(number);
			}
		}
		local in = new local();
		in.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Localinner os = new Localinner();
	os.show();
	

	}

}

