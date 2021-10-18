package casting;

public class Animaltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani = new cat();
		ani.eat();
		ani.walk();
		dog dog = (dog) new Animal();
		dog.sound();
		
		/*cat cat = (cat) ani;
		cat.sound();
		dog dog = (casting.dog) new Animal();
		dog.sound();
		dog.eat();
		*/

	}

}
