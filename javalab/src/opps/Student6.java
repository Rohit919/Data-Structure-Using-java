package opps;

//Java program to copy the object from one object another object.
public class Student6 {
	int id;
	String name;

	Student6(int i, String n) {
		id = i;
		name = n;
	}

	// Constructor to initialize another object
	Student6(Student6 s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println(id + "  " + name);
	}

	public static void main(String[] args) {
		Student6 s1 = new Student6(64, "Rohit");
		Student6 s2 = new Student6(s1);
		s1.display();
		s2.display();
	}

}
