package Lecture10;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr, sorted;
		arr = takeInput();
		sorted = meargeSort(arr, 0, arr.length);
		display(sorted);

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

	public static int[] meargeSort(int[] arr, int start, int end) {
		if (start == end) {
			int[] br = new int[1];
			br[0] = arr[start];
			return br;
		}
		int mid = (start + end) / 2;
		int[] one = meargeSort(one, 0, mid);
		int[] two = meargeSort(two, mid + 1, end);
		int[] sorted = mearge(one, two);
		return sorted;
	}

	public static void merge(int[] one, int[] two) {
		int i=0, j=0, k=0;
		int[] ans = new int[one.length+two.length];
		

	}

	public static void display(int[] arr) {
		System.out.println("Mearge array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
