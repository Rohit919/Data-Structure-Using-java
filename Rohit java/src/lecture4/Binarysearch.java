package lecture4;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		int[] arr;
		arr=takeInput();
		insertionSort(arr);
		display(arr);
		System.out.println("Enter the element");
		Scanner s = new Scanner(System.in);
		int data=s.nextInt();
		System.out.println(binarySearch(arr, data));
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
	public static int binarySearch(int[] arr, int data) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == data) {
				return mid;
			} else if (arr[mid] < data) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;
	}
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				swap(arr, j, j - 1);
			}
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void display(int[] arr) {
		System.out.println("Sorted array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
