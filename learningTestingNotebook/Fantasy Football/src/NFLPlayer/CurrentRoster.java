package NFLPlayer;

public class CurrentRoster {
	private String currentTeamList;
	private String favoritePlayer;
	private int totalDraftScore;
	
	public CurrentRoster(String currentTeamList, String favoritePlayer, int totalDraftScore) {
		this.currentTeamList = currentTeamList;
		this.favoritePlayer = favoritePlayer;
		this.totalDraftScore = totalDraftScore;
	}

	public String getCurrentTeamList() {
		return currentTeamList;
	}

	public String getFavoritePlayer() {
		return favoritePlayer;
	}

	public int getTotalDraftScore() {
		return totalDraftScore;
	}
	
	
}
