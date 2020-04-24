package abstraction;

abstract class Bike {
	Bike() {
		System.out.println("Bike is Created.....");
	}

	abstract void run();

	void ChangeGear() {
		System.out.println("Gear Changed .....");
	}
}

class Honda extends Bike{
	void run() {
		System.out.println("Running Safely.....");
	}
}