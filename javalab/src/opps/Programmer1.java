package opps;

public class Programmer1 extends Employee {
	int bonus = 10000;

	public static void main(String args[]) {
		Programmer1 p1 = new Programmer1();
		System.out.println("Programmer salary is" + p1.salary);
		System.out.println("Programmer bonus is" + p1.bonus);
	}
}