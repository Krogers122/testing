package Polymorhpism;

public class Animals {
	private String name = "Animal"; //private means only the Animal class has access to this
	public String favFood = "Food"; // the world has access to it
	
	
	protected final void changeName(String newName) {/*A superclass is expected to create subcasses and those subclasses 
					*will have access through the superclass. When you add the "final"
					*statement it means that no subclass can change the superclass.
					*/
		this.name = newName;
	}
	protected final String getName() {
		return this.name;
		
	}
	public void eatStuff() {
		System.out.println("Yum " + favFood);
	}
	
	public void walkAround () {
		System.out.println(this.name + " walks around");
	}
	
	public Animals() {
		// TODO Auto-generated constructor stub
	}
	
	public Animals (String name, String favFood) { //constructor for the animals class
		this.changeName(name);
		this.favFood = favFood;
	}
	
}