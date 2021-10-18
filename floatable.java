package inheritance;

public interface floatable {
	int duaratiion= 20;
	public void canfly();
	
	public default void warcar()
	{
		System.out.println("car can go in water");
	}
	
}

