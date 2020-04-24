package Recursion;

import java.util.Scanner;

public class BinaryToGrey {

	public static void main(String[] args) {
		System.out.println("Enter the binary number: -");
		Scanner s = new Scanner(System.in);
		int binary_number = s.nextInt();
		int result = binary_to_gray(binary_number, 0);
		System.out.print(result);
	}

	public static int binary_to_gray(int n, int i) {
		int a, b;
		int result = 0;
		if (n != 0) {
			// Taking last digit
			a = n % 10;
			n = n / 10;
			// Taking second last digit
			b = n % 10;
			if ((a & ~b) == 1 || (~a & b) == 1) {
				result = (int) (result + Math.pow(10, i));
			}
			return binary_to_gray(n, ++i) + result;
		}
		return 0;
	}

}
