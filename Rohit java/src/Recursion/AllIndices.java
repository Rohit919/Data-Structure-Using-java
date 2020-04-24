package Recursion;

import java.util.Scanner;

public class AllIndices {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr, arr1;
		arr = takeInput();
		System.out.println("Enter the element for searching: -  ");
		int data = s.nextInt();
		int si = 0, count = 0;
		arr1 = allIndices(arr, si, data, count);
		display(arr1);

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

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] allIndices(int[] arr, int i, int data, int count) {

		if (i == arr.length) {
			int[] br = new int[count];
			return br;
		}
		int[] indices = null;
		if (arr[i] == data) {
			indices = allIndices(arr, i + 1, data, count + 1);
		} else {
			indices = allIndices(arr, i + 1, data, count);
		}

		if (arr[i] == data) {
			indices[count] = i;
		}
		return indices;
	}

}
