package datatype;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String args[]) {
		System.out.println("Enter the number in binary: - ");
		Scanner sc = new Scanner(System.in);
		int bin = sc.nextInt();
		int dec = 0;
		int twopowers = 1;
		while (bin != 0) {
			int rem = bin % 10;
			dec = dec + rem * twopowers;
			bin = bin / 10;
			twopowers = twopowers * 2;

		}
		System.out.println(dec);

	}

}
