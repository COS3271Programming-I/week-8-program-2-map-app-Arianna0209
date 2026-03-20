package week8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MapAPP {

	// This program makes a map of user names and passwords, as well as a map of user names and
	// corresponding messages. It then lets the user enter a user name and password to log in,
	// then they can receive their message.
	
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		// Tell the user what the program does:
		System.out.println("This program allows you to enter a user name and password, and if "
				+ "they are correct, you will receive a message.");
		
		// Create and fill the login map:
		Map<String, String> login = new HashMap<>();
		login.put("bmsmith", "PASSWORD");
		login.put("raanderson", "i<3kittens");
		login.put("jwhanson", "03202008");
		login.put("msgraham", "smores!");
		login.put("hgsanders", "Sanders9893");
		login.put("sywashington", "myFAVORITEcolorISpurple");
		
		// Create and fill the message map:
		Map<String, String> message = new HashMap<>();
		message.put("bmsmith", "Welcome Brenda, your computer has been unlocked.");
		message.put("raanderson", "There are new kittens for sale near you, Rose!");
		message.put("jwhanson", "You have a new email, Joe");
		message.put("msgraham", "Your order of 2 chocolate bars, 1 box of graham crackers, "
				+ "and 10 bags of marshmallows has been delivered, Mary.");
		message.put("hgsanders", "Happy birthday, Harry!");
		message.put("sywashington", "Your Windows theme color has been changed to purple, Sydney.");
		
		// Ask the user to login:
		System.out.println("\nPlease login to your computer.");
		System.out.print("Username: ");
		String username = userinput.nextLine();
		System.out.print("Password: ");
		String password = userinput.nextLine();
		
		// Search to see if the user's login information is in the maps. If so, print a message, otherwise
		// print an error message and end the program:
		if (login.get(username) == null || !(login.get(username).equals(password))) {
			System.out.println("\nYour username or password were incorrect.");
			System.out.println("\nProgram ended.");
		}
		else {
			System.out.println("\n" + message.get(username));
			System.out.println("\nProgram ended.");
		}
	}

}
