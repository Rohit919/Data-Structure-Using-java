package Lecture10;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortArray {

	public static void main(String[] args) {
		int[] arr1, arr2, arr3;
		arr1 = takeInput();
		arr2 = takeInput();
		arr3 = meargearray(arr1, arr2);
		Arrays.sort(arr3);
		display(arr3);

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

	public static int[] meargearray(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		int count = 0, i = 0, j = 0;
		while (i+j < arr1.length +arr2.length) {
			if (arr1[i] <= arr2[j]) {
				arr3[count] = arr1[i];
				i++;
			} else {
				arr3[count] = arr2[j];
				j++;
			}
			count++;
		}
		return arr3;

	}

	public static void display(int[] arr) {
		System.out.println("Mearge array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
