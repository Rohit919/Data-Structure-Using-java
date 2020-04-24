package lecture1;

import java.util.Scanner;

public class Exercise1_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double mark_avg;
		int result;
		int i;
		int s;
		// define size of array
		s = input.nextInt();
		// The array is defined "arr" and inserted marks into it.
		int[] arr = new int[s];

		for (i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		int max = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int sum = 0;
		for (i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		mark_avg = sum / s;
		result=max;
		System.out.println(result);
		System.out.println(mark_avg);
	}

}
