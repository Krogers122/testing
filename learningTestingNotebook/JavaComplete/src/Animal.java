//Single line comment
/*multiple
 * line
 * comments
 */
import java.util.Scanner;
import java.nio.charset.MalformedInputException;
import java.util.*;

public class Animal {

	public static final double FAVNUMBER = 1.6180;
	/*private means it can only be accessed by other classes
	int range -2^31 to 2^31 -1
	long -2^63 to 2^63 -1
	char are assigned int's that represent utf-16 code
	number w/ a decimal place and a 64 bit number
	float is a 32 bit number
	protected means that this code can only be accessed by other code in 
		the package
	Scanner means it allows input and System.in allows the user to input 
		information
	Super calls whatever the superclass for the object to be called.
	++ adds one
	quick ref: Type "sysout" and then hit space for println
	*/
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberOfAnimals = 0;
	
	static Scanner userinput = new Scanner(System.in);

	public Animal() {
		numberOfAnimals++;
		
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " + sumOfNumbers);
		
		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 = " + diffOfNumbers);
		
		int multOfNumbers = 5 * 1;
		System.out.println("5 * 1 = " + multOfNumbers);
		
		int divOfNumbers = 5 / 1;
		System.out.println("5 / 1 = " + divOfNumbers);
		
		int modOfNumbers = 5 % 3;
		System.out.println("5 % 3 = " + modOfNumbers);
		//mod % returns the remainder of the division
		
		//public static void main(String[] args) { allows the program
		//to search for the "main" and execute
	}
		public static void main(String[] args) {
			
			//this is the constructor
			Animal theAnimal = new Animal();
		}
	
	
	
}
