package Recursion;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		System.out.println("Enter the Binary Number: -");
		Scanner s = new Scanner(System.in);
		int Binary_Number = s.nextInt();
		System.out.println("Decimal Number is: -");
		System.out.println(find(Binary_Number));
	}

	static int find(int Binary_Number) {
		if (Binary_Number == 0)
			return 0;
		else
			return (Binary_Number % 10 + 2 * find(Binary_Number / 10));
	}

}
