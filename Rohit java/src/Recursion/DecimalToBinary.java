package Recursion;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter the Decimal Number: -");
		Scanner s = new Scanner(System.in);
		int decimal_number = s.nextInt();
		System.out.println("Binary Number is: -");
		System.out.println(find(decimal_number));
	}

	static int find(int decimal_number) {
		if (decimal_number == 0)
			return 0;
		else
			return (decimal_number % 2 + 10 * find(decimal_number / 2));
	}

}
