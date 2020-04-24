package Recursion;

import java.util.Scanner;

public class RecursiveBubbleSort {

	public static void main(String[] args) {
		int[] arr;
		arr = takeInput();
		bubbleSort(arr,arr.length);
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

	public static void bubbleSort(int[] arr, int n) {
		if (n == 1)
			return;
		for (int i = 0; i < n - 1; i++)
			if (arr[i] > arr[i + 1]) {
				swap(arr, i, i + 1);
			}
		bubbleSort(arr, n - 1);
	}

	public static void display(int[] arr) {
		System.out.println("Sorted array is: -");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
