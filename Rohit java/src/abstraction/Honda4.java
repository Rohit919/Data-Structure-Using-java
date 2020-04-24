package abstraction;

abstract class Bike1 {
	abstract void run();
}

public class Honda4 extends Bike1 {
	void run() {
		System.out.println("Running Safely......");
	}

	public static void main(String args[]) {
		Bike1 obj = new Honda4();
		obj.run();
	}
}
