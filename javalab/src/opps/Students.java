package opps;

public class Students {
	// defining fields
	int id;
	String name;

	public static void main(String[] args) {
		// Creating an object or instance
		Students s1 = new Students();
		System.out.println("Default value");
		System.out.println(s1.id);
		System.out.println(s1.name);
		//Initializing objects
		s1.id = 01;
		s1.name = "Rohit";
		System.out.println("After initialization");
		System.out.println(s1.id);
		System.out.println(s1.name);

	}
}
