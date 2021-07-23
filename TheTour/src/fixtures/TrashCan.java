package fixtures;

public class TrashCan extends Fixture {

	public TrashCan(String name, String shortDescription, String longDesription) {
		super(name, shortDescription, longDesription);
	}

	
	public void trash() {
		
		System.out.println("Thanks for throwing the newspaper in the trash!");
	}
}
