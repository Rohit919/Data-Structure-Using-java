package sorting;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr;
		arr = takeInput();
		bubbleSort(arr);
		display(arr);
	}

	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: - ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}

		}

	}

	public static void display(int[] arr) {
		System.out.println("Sorted Array is : - ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");

		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
