/*
 * creating an abstract class
 * this should be done when you dont want it implemented by every class
 */
package Interface;

public abstract class Crashable { //ensure you define this as an abstract class

	boolean carDrivable = true;
	
	public void youCrashed(){
	this.carDrivable = false;
	}
	public abstract void setCarStrength(int carStrength);
	
	public abstract int getCarStrength();
	
}
