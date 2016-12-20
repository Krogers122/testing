package learning;

public class Main {

		public static void main(String[]args) {
		Dimensions dimensions = new Dimensions (20, 20, 5);	
		Case theCase = new Case ("2200", "Dell", "200", dimensions);
		
		
		Monitor theMonitor = new Monitor ("27 in Beast", "Acer", 27, new Resolution(2500, 1440));
		
		Motherboard theMotherboard = new Motherboard ("BJ-200", "Asus", 4, 6, "v2.44");
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		thePC.getMonitor().drawPixelAt(1500, 1200, "red");
		thePC.getMotherboad().loadProgram("Windows 1.0");
		thePC.getThecase().pressPowerButton();
		
		 }
}
