package game;

import java.util.Scanner;

import fixtures.Broom;
import fixtures.Door;
import fixtures.LazyBoy;
import fixtures.Room;
import fixtures.TrashCan;


public class Main {
	
	public static void main(String[] args) {
		Room currentRoom;
		Scanner scanner = new Scanner(System.in);
		
		String startingRoom = "Welcome to: What are you doing here? "
				+ "\r\n"
				+ "\r\n"
				+ "Just inside the front door of an unknown house. "
				+ "Why are you here... who Knows\r\n"
				+ "Your looking down a long hallway that leads to the center of it.\r\n"
				+ "Possible commands to get around are in all Caps."
				+ "\r\n"
				+ "\r\n"
				+ "NORTH: The Living Room\r\n"
				+ "SOUTH: The Kitchen\r\n"
				+ "EAST: The Bedroom\r\n"
				+ "WEST: The Dining Room \r\n";
		System.out.println(startingRoom);
		String play = scanner.nextLine();
	
		String[] commands = {"north","south", "east", "west", "kitchen", "bedroom", "living", "dining"};
		
		Room[] exits = new Room[5];
		exits[0] = new Room("The Kitchen",
				" a dirty kitchen",
				"SOUTH, The most unkept room in the house. No one seems to care enough to WASH the DISHES.\r\n"
				+ "To the right (EAST) is a laundry full of dirty LAUNDRY as well. Wow, these people \r\n"
				+ "are slobs. There's a BROOM but it doesnt get used.", "behind you NORTH, a dark room "
				+ "with big flat screent TV", "WEST, a medium size room with lots of light light", "EAST,"
				+ " through two sets of sliding glass doors, across an outside patio in between youll find the bedroom.", "Dishes", "Broom") ;  
		exits[1] = new Room("The Living Room",
				" behind you, North, a dark room with big flat screent TV",
				"This is a big room. Three couches wrap three walls of the room, and a LAZYBOY\r\n"
				+ "also available to sit in; I would'nt recommend it though.Looks like people smoked quite \r\n"
				+ "a bit in this room. over here in this corner there's a pasck of CIGGERETTES,and the walls have a yellow glow to them.","SOUTH, "
				+ "the most unkept room in the house. No one seems to care enough to WASH the DISHES", "WEST..a medium size room with lots of light.",
				"EAST , through two sets of sliding glass doors, across an outside patio in between youll find the bedroom", "LazyBoy", "ciggerettes"); 
		exits[2] = new Room("The Dining Room",
				" WEST..a medium size room with lots of light light", "A medium size room here. "
				+ "There is quite a lot of light in here; it also has no curtains. I wonder why?,\r\n"
				+ "It looks like someone used to read the paper in this room. I say used to because all these \r\n"
				+ "NEWSPAPERS are seriously old. Why are they still here with a TRASHCANS so close by.\r\n",
				"EAST through two sets of sliding glass doors, across an outside patio in between youll find the bedroom","behind you, "
				+ "NORTH, a dark room with big flat screent TV", "SOUTH, The most unkept room in the house.","Newspaper", "Trashcan");  
		exits[3] = new Room("The Bed Room",
				" East , through two sets of sliding glass DOORS, across an outside patio in between youll find the bedroom.",
				"Another big room.. There is a huge bed on the far end; no, of course it's not made.\r\n"
				+ "COVERS are on the Floor, along with clothes and who know what else. Curtains are ripped\r\n"
				+ "and need a serious washing. Let me get out of here","NORTH, a dark room with big flat screent TV", 
				"SOUTH, The most unkept room in the house.", "WEST..a medium size room with lots of light","Doors", "Covers");
		
		exits[4] = exits[0];
		currentRoom = exits[4];
		
			String printRoom;
			Boolean printIt = true;
			
//		while (scanner.next() != null) {
			if(play.toLowerCase().contains("south") || play.toLowerCase().contains("kitchen")) {
				currentRoom = exits[0];
			} else if (play.toLowerCase().contains("north") || play.toLowerCase().contains("living")) {
				currentRoom = exits[1];
			}else if (play.toLowerCase().contains("west") || play.toLowerCase().contains("dining")) {
				currentRoom = exits[2];
			}else if (play.toLowerCase().contains("east") || play.toLowerCase().contains("bed")) {
				currentRoom = exits[3];
			}else if (play.toLowerCase().contains("broom")) {
				Broom redBroom = new Broom("The Broom", "The never used brrom", "Thanks for sweeping the floor");
					redBroom.broomSweep();
					printIt = false;
			}else if (play.toLowerCase().contains("lazyboy")) {
				LazyBoy lazyChair = new LazyBoy("The LazyBoy", "Dirty", "Maybe you should not have sat here.");
				lazyChair.lazy();
				printIt = false;
			}else if (play.toLowerCase().contains("trashcan")) {
				TrashCan TrashCan = new TrashCan("The TrashCan", "For Trash", "Thanks");
				TrashCan.trash();
				printIt = false;
			}else if (play.toLowerCase().contains("doors")) {
				Door door = new Door("The Doors", "Open", "You're in");
				door.open();
				printIt = false;		
			}else {
				System.out.println("Hmmm? Possible commands to get around are in all Caps. Try again.");
					printIt = false;
			}
			
			
			if (printIt) {
				System.out.println(currentRoom.name + ""
						+ "\r\n"
						+ "\r\n"
						+ currentRoom.longDescription
						+ "\r\n"
						+ "\r\n"
						+ "Exits:"
						+ "\r\n"
						+ currentRoom.adjacent1 + "\r\n"
						+ currentRoom.adjacent2 + "\r\n"
						+ currentRoom.adjacent3 + "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Items:"
						+ "\r\n"
						+ currentRoom.item1 + "\r\n"
						+ currentRoom.item2
						
					);
				scanner.close();
			}
		}	
				
		}
				
//	}
	
