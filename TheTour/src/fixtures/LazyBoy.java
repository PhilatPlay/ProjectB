package fixtures;

public class LazyBoy extends Fixture {

	public LazyBoy(String name, String shortDescription, String longDesription) {
		super(name, shortDescription, longDesription);
		
	}

	
	public void lazy() {
		
		System.out.println("You've sat in the lazyboy , but you've gotten diiry!");
	}
}
