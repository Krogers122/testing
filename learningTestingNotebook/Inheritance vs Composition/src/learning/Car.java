package learning;

public class Car extends Vehicle {

		private int doors;
		private int engineCapacity;
		public Car(String name, int doors, int engineCapacity) {
			super(name);
			this.doors = doors;
			this.engineCapacity = engineCapacity;
		}
		
		//inheritance is simply stating that a car is a vehicle. therefore the car inherits the vehicle class.
}
