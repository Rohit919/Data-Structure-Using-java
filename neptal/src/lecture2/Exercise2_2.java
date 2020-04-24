package lecture2;

// to call the method  print() of class Student first and then 
//call print() method of class School.
//This is the class named School
class School {
	// This is a method in class School
	public void print() {
		System.out.println("Hi! I class SCHOOL.");
	}
}

//This is the class named Student
class Student {
	// This is a method in class Student
	public void print() {
		System.out.println("Hi! I am class STUDENT");
	}
}

public class Exercise2_2 {
	public static void main(String[] args) {
		Student s = new Student();
		s.print();
		School s1 = new School();
		s1.print();
	}
}