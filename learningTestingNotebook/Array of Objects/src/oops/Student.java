package oops;

public class Student {

		private String name;
		private int age;
		
		Student() {
			name = "noname";
			age = 1;
			
		}	
 
		Student(String name, int age) {
			this.name = name;
			this.age = age;
	}
	void setNameAndAge(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void introduce() {
		System.out.println("hi i'm" + name + "and my age is" + age);
	}
}