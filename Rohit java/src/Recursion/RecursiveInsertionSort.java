package Recursion;

import java.util.Scanner;

public class RecursiveInsertionSort {

	public static void main(String[] args) {
		int[] arr;
		arr = takeInput();
		insertionSortRecursive(arr, arr.length);
		display(arr);
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

	static void insertionSortRecursive(int arr[], int n) {
		if (n <= 1)
			return;
		insertionSortRecursive(arr, n - 1);
		int last = arr[n - 1];
		int j = n - 2;
		while (j >= 0 && arr[j] > last) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = last;
	}

	public static void display(int[] arr) {
		System.out.println("Sorted array is: -");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
