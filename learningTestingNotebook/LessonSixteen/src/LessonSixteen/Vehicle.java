/*
 * the interface works with the class.
 * everything defined in the interface must be created in what will implement the interface
 * additional fields can be added into the class 
 */
package LessonSixteen;

public class Vehicle extends Crashable implements Drivable, Cloneable{  //add extends Crashable to access the abstract class

	int numOfWheels = 2;
	
	double theSpeed = 0;

	int carStrength = 0;

		
	public int getWheel () { //the objects defined here must have the same access as defined in the interface
		return this.numOfWheels;
		}
	
	public void setWheels(int numWheels) {
		this.numOfWheels = numWheels;
	}
	
	public double getSpeed() {
		return this.theSpeed;
	}
	
	public void setSpeed(double speed) {
		this.theSpeed = speed;
	}
	
	public Vehicle (int wheels, double speed) {
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * copy the methods created in the crashable abstract class
	 * make sure you remove the abstract decleration so that it will execute
	 */
	public void setCarStrength(int carStrength) {
		this.carStrength  = carStrength; //you will also have to creat a field (carStrength)
	}
	
	public int getCarStrength(){
		return this.carStrength;
	}
	
	public String toString() {
		return "Num of Wheels : " + this.numOfWheels;
	}
	
	public Object clone () {
		Vehicle car;
		/*
		 * catch the excetion called the Clone not supported exception to check that there are no compiler errors
		 * the java machine does this automatically but I still have to do it. 
		 */
		try {
			car = (Vehicle) super.clone();
			}
		catch (CloneNotSupportedException e) {
			return null;
		}
		return car;
		
	}
}
