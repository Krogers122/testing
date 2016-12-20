package Polymorhpism;
// this is a subclass of Animals
public class Cats extends Animals {
	public String favToy = "Yarn";
	public void playWith () {
		System.out.println("Yeah " + favToy);
	}
	
	public void walkAround () { //this will overide the walkaround class
		System.out.println(this.getName() + " stalks around");
		
	}
	
	public String getToy() {
		return this.favToy;
	}
	
	public Cats() {
		
	}
	
	public Cats(String name, String favFood, String favToy) {
		super(name, favFood);
		this.favToy = favToy;
	}
}