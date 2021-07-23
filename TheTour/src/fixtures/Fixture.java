package fixtures;


public abstract class Fixture extends Object{
	public String name;
	public String shortDescription;
	public String longDescription;
	
	public Fixture(String name, String shortDescription, String longDesription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDesription;
	}

}

