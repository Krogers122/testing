/*
 * I believe this will be best treated as the Superclass
 * Everything will pass through this class because it holds the interaction between all the players
 */
package NFLPlayer;
import AllPlayers.quarterbacks;
import java.util.Scanner;
public class playerList {
	
	
	private String allPlayerList;
	public String quarterback;
	private String runningBack;
	private String wideReceiver;
	private String tightEnd;
	private String defensiveLineman;
	private String linebacker;
	private String kickoffKicker;
	private String kickReturner;
	private String punter;
	private String puntReturner;
	private String fieldGoalKicker;
	

	/*AllPlayers.quarterbacks (String QuarterBacks) {
		
	}
	*/
	
	static Scanner userinput = new Scanner(System.in);
		
	public playerList(String allPlayerList) {
		this.allPlayerList = allPlayerList;
		
		if HomeMenu = userinput; 
		{
			System.out.println("Quarterback");
			{
			else default
			}
		}
		
		 
	}
	public void displayPlayerList () {
		System.out.println("The player list is great ");
	}

	public String getAllPlayerList() {
		return allPlayerList;
	}

	public String getQuarterback() {
		return quarterback;
	}

	public String getRunningBack() {
		return runningBack;
	}

	public String getWideReceiver() {
		return wideReceiver;
	}

	public String getTightEnd() {
		return tightEnd;
	}

	public String getDefensiveLineman() {
		return defensiveLineman;
	}

	public String getLinebacker() {
		return linebacker;
	}

	public String getKickoffKicker() {
		return kickoffKicker;
	}

	public String getKickReturner() {
		return kickReturner;
	}

	public String getPunter() {
		return punter;
	}

	public String getPuntReturner() {
		return puntReturner;
	}

	public String getFieldGoalKicker() {
		return fieldGoalKicker;
	}
	

	
	public static void main(String[] args) {
		System.out.println("Here is the quarterback list" + quarterbacks);  
	}
	
	
		
}





