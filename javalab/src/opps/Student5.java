//Java program to overload constructors
package opps;

public class Student5 {
	int id;
	String name;
	int age;

	// Creating one argument constructor
	Student5(int i) {
		id = i;
	}

	// Creating two argument constructor
	Student5(int i, String n) {
		id = i;
		name = n;
	}

	// Creating three argument constructor
	Student5(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	void display() {
		System.out.println(id+"  "+name+"  "+age);
	}
}
