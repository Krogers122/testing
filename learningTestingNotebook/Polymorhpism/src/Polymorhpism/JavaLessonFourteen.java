/*
 * All the information posted allows the JavaLessonFourteen class to communicate with the 
 * Animal class (superclass) and the Cats class (subclass). The ability to do this is known
 * as polymorphism. 
 * Polymorphism can pull information from one superclass.
 *     ||       can pull information from a subclass as long as the superclass is defined the same way.
 *     ||       cannot pull information only defined in the subclass
 *     the superclass can be bypassed using the: System.out.println (((Cats)randAnimal).favToy);
 */
package Polymorhpism;

public class JavaLessonFourteen {

	public static void main(String[] args) {
		
		Animals genericAnimal = new Animals ();
		
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);
		
		Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");
		
		System.out.println();
		
		System.out.println(morris.getName());
		System.out.println(morris.favFood);
		System.out.println(morris.favToy);
		
		Animals tabby = new Cats("Tabby", "Salmon", "Ball");
		
		acceptAnimal(tabby);
		
	}

	public static void acceptAnimal (Animals randAnimal) {
		System.out.println();
		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);
		System.out.println();
		
		randAnimal.walkAround();
		
		
		//next method will bypass the superclass and allow only the subclass to be read by the java interpreter.
		Cats tempCat = (Cats) randAnimal;
		System.out.println(tempCat.favToy);
		System.out.println (((Cats)randAnimal).favToy);
		/*
		 * temperary can also be written this way
		 * System.out.println (((Cats)randAnimal).favToy);
		 */
		if (randAnimal instanceof Cats) {
			System.out.println(randAnimal.getName () + " is a Cat");
		}
	}
}