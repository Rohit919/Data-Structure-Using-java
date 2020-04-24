package Recursion;

import java.util.Scanner;

public class RecursiveMaxAndMin {

	public static void main(String[] args) {
		int[] arr;
		arr = takeInput();
		int max = recursiveMax(arr, arr.length);
		System.out.println("Maximum element: " + max);
		int min = recursiveMin(arr, arr.length);
		System.out.println("Minimum element: " + min);
	}

	static int recursiveMax(int[] arr, int length) {
		if (length == 1)
			return arr[0];
		return max(recursiveMax(arr, length - 1), arr[length - 1]);
	}

	private static int max(int n1, int n2) {
		if (n1 >= n2) {
			return n1;
		} else {
			return n2;
		}
	}

	static int recursiveMin(int[] arr, int length) {
		if (length == 1)
			return arr[0];
		return min(recursiveMin(arr, length - 1), arr[length - 1]);
	}

	private static int min(int n1, int n2) {
		if (n1 <= n2) {
			return n1;
		} else {
			return n2;
		}
	}

	public static int[] takeInput() {
		System.out.println("Enter the size of the array");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the element of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
}
