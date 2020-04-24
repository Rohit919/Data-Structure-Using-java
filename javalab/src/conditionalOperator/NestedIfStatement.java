package conditionalOperator;

public class NestedIfStatement {
	public static void main(String[] args) {
		// It is program to check the eligible to donate blood.
		int age = 20;
		int weight = 80;
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			}
		}

		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}

	}
}