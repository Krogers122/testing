package NFLPlayer;
//this class needs to add and remove players
public class PlayerManager {
		private String name;
		private String position;
		private String team;
		private int draftScore;
		private int age;
		private int jerseyNumber;
		
		PlayerManager() {
			name = "no name";
			position = "no position";
			team = "no team";
		}
		public PlayerManager(String name, String position, String team, int draftScore, int age, int jerseyNumber) {
			this.name = name;
			this.position = position;
			this.team = team;
			this.draftScore = draftScore;
			this.age = age;
			this.jerseyNumber = jerseyNumber;
		}
			public void loadProgram(String programName) {
				System.out.println("Program " + programName + "is now loading..."); 
			}
		public String getName() {
			return name;
		}

		public String getPosition() {
			return position;
		}

		public String getTeam() {
			return team;
		}

		public int getDraftScore() {
			return draftScore;
		}

		public int getAge() {
			return age;
		}

		public int getJerseyNumber() {
			return jerseyNumber;
		}
		
		
}
/*method 1 of creating an array with class playerlist
 * public class HomeMenu {
	//public static void main(String[] args) {
		//System.out.println("This is the Home Menu");
		//static Scanner userInput = new Scanner(System.in);
		private String name;
		private int age;
		
		HomeMenu() {
			name = "noname";
			age = 1;
			
		}	
 
		HomeMenu(String name, int age) {
			this.name = name;
			this.age = age;
	}
	void setNameAndAge(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void introduce() {
		System.out.println("hi i'm " + name + "and my age is " + age);
	}
}	
*/