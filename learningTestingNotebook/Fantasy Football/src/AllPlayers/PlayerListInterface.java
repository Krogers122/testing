/*
 *  I think this should act as the interface between the player positions
 *  and the player manager class 
 */
package AllPlayers;

import java.util.ArrayList;

public class PlayerListInterface {
	protected String playerName;
	protected String playerPosition;
	protected String teamAssigned;
	
	protected 
	public Roster() {
		playerName = new ArrayList<>();
		
	}
	public Roster(String qbackName, String playerPosition, String teamAssigned) {
		this ();
		playerName = qbackName;
	}
	
}
