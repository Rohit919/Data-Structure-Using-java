package conditionalOperator;

public class IfelseStatementInJava {

	public static void main(String[] args) {
		System.out.println("********** If-else Statement ***********");
		int age = 20;
		if (age > 18) {
			System.out.println("Age is greater than 18");
		}

		// It is a program of odd and even number.
		int number = 13;
		if (number % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
		// Using ternary Operator
		String output = (number % 2 == 0) ? "even number" : "odd number";
		System.out.println(output);

		// It is a program to check leap year.
		// A year is leap, if it is divisible by 4 and 400. But, not by 100.
		int year = 2020;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR");
		}

	}

}
