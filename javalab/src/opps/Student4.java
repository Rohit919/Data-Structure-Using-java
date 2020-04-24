//Program to demonstrate the use of the parameterized Constructor
package opps;

public class Student4 {
	int id;
	String name;

	Student4(int i, String s) {
		id = i;
		name = s;
	}

	void display() {
		System.out.println(id + "  " + name);
	}

}
