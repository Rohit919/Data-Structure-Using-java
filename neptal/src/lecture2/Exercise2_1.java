package lecture2;
//to call the method  print() in class Student following the concept of inner class.

// This is the outer class named School
class School {
	// This is the inner class named Student
	class Student {
		// This is a method in inner class Student
		public void print() {
			System.out.println("Hi! I am inner class STUDENT of outer class SCHOOL.");
		}
	}
}

public class Exercise2_1 {
	public static void main(String[] args) {
		School s1 = new School();
		School.Student s = s1.new Student();
		s.print();
	}
}