package oops;

public class Tutorials {

		public static void main(String[]args) {
			
			//Student anil = new Student();
			//Student shreesh = new Student ("Shreesh", 25);
			//Student anjali = new Student ();
			
			int [] marks = new int[10];
			
			Student [] students = new Student[3];
			
			students[0] = new Student("anil", 24);
			students[1] = new Student ("shreesh", 25);
			students[2] = new Student ();
			
			/*students[0] = anil;  //first way of defining an object
			students[1] = shreesh;
			students[2] = anjali;
			*/
			//anil.setNameAndAge("anil", 24);
			students[2].setNameAndAge("anjali", 21);
					
			//anil.introduce();
			students[0].introduce();
			students[1].introduce();
			students[2].introduce();
		}
}
