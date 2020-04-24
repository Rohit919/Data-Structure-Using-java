package datatype;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String args[]) {
		System.out.println("Enter the number in binary: - ");
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		int bin = 0;
		int tenpowers = 1;
		while (dec != 0) {
			int rem = dec % 2;
			bin = bin + rem * tenpowers;
			dec = dec / 2;
			tenpowers = tenpowers * 10;

		}
		System.out.println(bin);
	}

}
