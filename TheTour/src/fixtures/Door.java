package fixtures;

public class Door extends Fixture {

	public Door(String name, String shortDescription, String longDesription) {
		super(name, shortDescription, longDesription);
		
	}

	
	public void open() {
		
		System.out.println("You've open the doors; you're in!");
	}
}
