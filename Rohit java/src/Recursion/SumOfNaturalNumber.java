package Recursion;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number: -");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(recurSum(n));

	}

	public static int recurSum(int n) {
		if (n <= 1)
			return n;
		return n + recurSum(n - 1);
	}

}
