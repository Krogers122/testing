package Interface;
/*
 * interfaces are modifiers to objects 
 */
public interface Drivable { 
		
	double PI = 3.14; // you can add fields inside of interfaces but they must be final: cannot change
	
	public abstract int getWheel (); 
	/*this is by default an abstract class so writing public abstract is not needed
	 *  public abstract int getWheel (); == int getWheel ();
	 */
	
	void setWheels(int numWheels);
	
	double getSpeed();
	
	void setSpeed(double speed);
}

