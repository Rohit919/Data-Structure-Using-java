package opps;

public class Student2 {
	int id;
	String name;

//initialize object through method
	void insert(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + "   " + name);
	}
}
