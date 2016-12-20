/*
 * This should be the execution class. It doesnt need to do anything 
 * other than going from one place to another
 * The home menu should utilize the interface method 
 * it should remain simple and only be treated as the interface
 */
package NFLPlayer;
import java.util.*;
import java.util.Scanner;
import AllPlayers.quarterbacks;
public class HomeMenu {
		
	public static void main(String[]args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Which player position do you want to access?");
			quarterbacks theQuarterback = new quarterbacks();
			
				String s1 = input.nextLine();
		System.out.print("Which player do you like");
		String s2 = input.nextLine();
		if (s1.contains(s2)) {
				System.out.println("s1" + theQuarterback.getFieldGoals()); // I need to be able to call the quarterback class and arrayListOne
		}
		
		else 
			System.out.println("s2" + theQuarterback);
				
	}	//end of main 
		//System.out.println("Hello");
	
	
}
	




/*method 1 creating an array with class home menu
public class playerList {
	public static void main(String[]args) {
		
		//Student anil = new Student();
		//Student shreesh = new Student ("Shreesh", 25);
		//Student anjali = new Student ();
		
		int [] playerCheifs = new int[20];
		
		HomeMenu [] players = new HomeMenu[3];
		
		players[0] = new HomeMenu("John", 24);
		players[1] = new HomeMenu ("shreesh", 25);
		players[2] = new HomeMenu ();
		
		//students[0] = anil;  //first way of defining an object
		//students[1] = shreesh;
		//students[2] = anjali;
		
		//anil.setNameAndAge("anil", 24);
		players[2].setNameAndAge("anjali", 21);
				
		//anil.introduce();
		players[0].introduce();
		players[1].introduce();
		players[2].introduce();
	}
}
*/

