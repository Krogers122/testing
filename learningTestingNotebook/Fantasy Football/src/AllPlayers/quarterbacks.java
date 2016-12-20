package AllPlayers;

import java.util.ArrayList;

import NFLPlayer.playerList;

public class quarterbacks {
	private int passing;
	private int rushing;
	private int receiving;
	private int kicking;
	private int fieldGoals;
	private int kickReturns;
	private int punting;
	private int sacks;
	private int scoring;
	private int touchdowns;
	private int tackles;
	private int interceptions;
	private int totalYards;
	//private static ArrayList allQuarterbackNames;
	

	String [] quarterbacks = new String [200];

	playerList [] passingYards = new playerList [4];

	
	public static void main(String[] args) {
		
		ArrayList arrayListOne;
		
		arrayListOne = new ArrayList();
		//allQuarterbackNames = arrayListOne; attempting to get the list to Home Menu
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Allan, Brandon");
		names.add("Anderson, Derek");
		names.add("Barkley, Matt");
		names.add("Bercovici, Mike");
		names.add("Bethel-Thompson, McLeod");
		names.add("Bortles, Blake");
		names.add("Boykin, Trevone");
		names.add("Bradford, Sam");
		names.add("Brady, Tom");
		names.add("Bray, Tyler");
		names.add("Brees, Drew");
		names.add("Bridgewater, Teddy");
		names.add("Brissett, Jacoby");
		names.add("Callahan, Joe");
		names.add("Carr, Derek");
		names.add("Cassel, Matt");
		names.add("Clemens, Kellen");
		names.add("Coker, Jake");
		names.add("Cook, Conner");
		names.add("Cousins, Kirk");
		names.add("Cutler, Jay");
		names.add("Dalton, Andy");
		names.add("Daniel, Chase");
		names.add("Davis, Austin");
		names.add("Doughty, Brandon");
		names.add("Driskel, Jeff");
		names.add("Dysert, Zax");
		names.add("Fales, David");
		names.add("Fitzpatrick, Ryan");
		names.add("Flacco, Joe");
		names.add("Foles, Nick");
		names.add("Garbbert, Blaine");
		names.add("Garoppolo, Jimmy");
		names.add("Glennon, Mike");
		names.add("Goff, Jared");
		names.add("Gradkowski, Bruce");
		names.add("Grayson, Garret");
		names.add("Griffin III, Robert");
		names.add("Hackenberg, Christian");
		names.add("Heaps, Jake");
		names.add("Heinicke, Taylor");
		names.add("Henne, Chad");
		names.add("Hill, Shaun");
		names.add("Hogan, Kevin");
		names.add("Hoyer, Brian");
		names.add("Hundley, Brett");
		names.add("Johnson, Josh");
		names.add("Jones, Landry");
		names.add("Kaepernick, Colin");
		names.add("Keenum, Case");
		names.add("Kessler, Cody");
		names.add("Lewis, Thad");
		names.add("Licata, Joe");
		names.add("Luck, Andrew");
		names.add("Lynch, Paxton");
		names.add("Mallet, Ryan");
		names.add("Manning, Eli");
		names.add("Mannion, Sean");
		names.add("Manuel, EJ");
		names.add("Mariota, Marcus");
		names.add("McCarron, AJ");
		names.add("McCown, Josh");
		names.add("McCown, Luke");
		names.add("McCoy, Colt");
		names.add("McGloin, Matt");
		names.add("Mettenberger, Zach");
		names.add("Moore, Kellen");
		names.add("Morris, Stephen");
		names.add("Murray, Aaron");
		names.add("Nassib, Ryan");
		names.add("Newton, Cam");
		names.add("Orlovsky, Dan");
		names.add("Osweiler, Brock");
		names.add("Palmer, Carson");
		names.add("Petty, Bryce");
		names.add("Ponder, Christian");
		names.add("Prescott, Dak");
		names.add("Renfree, Sean");
		names.add("Renner, Bryn");
		names.add("Rivers, Philip");
		names.add("Rodgers, Aaron");
		names.add("Roethisberger, Ben");
		names.add("Romo, Tony");
		names.add("Rudock, Jake");
		names.add("Ryan, Matt");
		names.add("Sanchez, Mark");
		names.add("Savage, Tom");
		names.add("Schaub, Matt");
		names.add("Shaw, Connor");
		names.add("Showers, Jameill");
		names.add("Siemian, Trevor");
		names.add("Simms, Matt");
		names.add("Sims, Blake");		
		names.add("Smith, Alex");
		names.add("Smith, Geno");
		names.add("Sorensen, Brad");
		names.add("Stafford, Matthew");
		names.add("Stanton, Drew");
		names.add("Stave, Joel");
		names.add("Sudfeld, Nate");
		names.add("Tannehill, Ryan");
		names.add("Tanney, Alex");
		names.add("Taylor, Tyrod");
		names.add("Thomas, Logan");
		names.add("Thompson, Dylan");
		names.add("Tolzein, Scott");
		names.add("Trainor, Austin");
		names.add("Vaughan, Dustin");
		names.add("Webb, Joe");
		names.add("Weeden, Brandon");
		names.add("Wenning, Keith");
		names.add("Wentz, Carson");
		names.add("Whitehurst, Charlie");
		names.add("Williams, Marquis");
		names.add("Wilson, Russell");
		names.add("Winston, Jameis");
		names.add("Wittek, Max");
		names.add("Woodrum, Josh");

		
	for( int i = 0; i < names.size(); i++)
	{
		System.out.println(names.get(i));
	}
	//System.out.println(names);
	}

	public int getPassing() {
		return passing;
	}

	public int getRushing() {
		return rushing;
	}

	public int getReceiving() {
		return receiving;
	}

	public int getKicking() {
		return kicking;
	}

	public int getFieldGoals() {
		return fieldGoals;
		
	}

	public int getKickReturns() {
		return kickReturns;
	}

	public int getPunting() {
		return punting;
	}

	public int getSacks() {
		return sacks;
	}

	public int getScoring() {
		return scoring;
	}

	public int getTouchdowns() {
		return touchdowns;
	}

	public int getTackles() {
		return tackles;
	}

	public int getInterceptions() {
		return interceptions;
	}

	public int getTotalYards() {
		return totalYards;
	}

	public String[] getQuarterbacks() {
		return quarterbacks;
	}

	public playerList[] getPassingYards() {
		return passingYards;
	}
}
