/*
 * Learn everything about methods
 */
package LessonSixteen;

//import org.omg.CORBA.Object;
//public class Vehicle extends Crashable implements Drivable
public class JavaLessonSixteen {

		public static void main(String[] args) {
			
			Object superCar = new Vehicle();
			
			System.out.println(((Vehicle)superCar).getSpeed());
			
			Vehicle superTruck = new Vehicle();
			
			System.out.println(superCar.equals(superTruck)); //find out if the two objects equal each other
			
			System.out.println(superCar.hashCode()); //this will show the objects identification code

			System.out.println(superCar.getClass()); //this will show the class assigned to the object
			
			System.out.println(superCar.getClass().getName()); //this will return just the class name
			
			if(superCar.getClass()== superTruck.getClass()){ //this will find out if both objects are of the same class type
				System.out.println("The same");
			}

			System.out.println();
			System.out.println(superCar.getClass().getSuperclass()); //this will show what the superclass is for the objects subclass
			
			System.out.println(superCar.toString()); /*this will communicate with the class Vehicle to find out whatever is
													* defined as a toString. You have to go into the class and actually define
													* what you want the toString to be though. 
													*/
														
			
			int randNum = 100;
			System.out.println(Integer.toString(randNum));

			/*
			 * This is everything about clones 
			 * Anything that is created after a clone does not affect the original.
			 * 	if you add something or take something away from the clone it wont change the original
			 * But you have to co to the class and at the statment Cloneable to allow the class to be cloneable.
			 */
			 
			superTruck.setWheels(6);
			
			Vehicle superTruck2 = (Vehicle)superTruck.clone();
			
			System.out.println(superTruck.getWheel());
			System.out.println(superTruck2.getWheel());
			
			System.out.println(superTruck.hashCode());
			System.out.println(superTruck2.hashCode());
		}
}
