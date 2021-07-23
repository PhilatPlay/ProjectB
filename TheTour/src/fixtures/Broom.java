package fixtures;

public class Broom extends Fixture {

	public Broom(String name, String shortDescription, String longDesription) {
		super(name, shortDescription, longDesription);
	}

	
	public void broomSweep() {
		
		System.out.println("Thank you for sweeping the floor; it needed it!");
	}
}
