package fixtures;

public class Room extends Fixture {
	public String adjacent1;
	public String adjacent2;
	public String adjacent3;
	public String item1;
	public String item2;

	
	public Room(String name, String shortDescription, String longDescription, String adjacent1, String adjacent2, 
			String adjacent3, String item1, String item2) {
		
		super(name, shortDescription, longDescription);
		this.adjacent1 =  adjacent1;
		this.adjacent2 =  adjacent2;
		this.adjacent3 =  adjacent3;
		this.item1 =  item1;
		this.item2 =  item2;
	}
	
	public void sweepFloor() {
		System.out.println("Thanks for sweeping the floor. Which way you want to go now?");
	}
	

}

