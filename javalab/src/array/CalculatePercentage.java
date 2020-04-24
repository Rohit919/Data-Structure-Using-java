package array;

import java.util.Scanner;

public class CalculatePercentage {

	public static void main(String[] args) {
		int total = 0;
		float percentage;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Subject: ");
		int subject = s.nextInt();
		int[] arr = new int[subject];
		System.out.println("Enter the marks of the students:");
		for (int i = 0; i < subject; i++) {
			int num = s.nextInt();
			arr[i] = num;
			total = total + num;
		}
		percentage = (total / subject);
		System.out.println("Total marks of the students = " + total);
		System.out.println("Percentage of the Students = " + percentage);

	}

}
