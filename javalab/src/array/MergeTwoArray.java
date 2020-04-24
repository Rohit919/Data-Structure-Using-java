package array;

import java.util.*;

public class MergeTwoArray {
	public static void main(String[] args) {
		int[] arr1, arr2, arr3;
		arr1 = takeInput();
		arr2 = takeInput();
		arr3 = mergeTwoArray(arr1, arr2);
		display(arr3);
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

	public static int[] mergeTwoArray(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		int count = 0;

		for (int i = 0; i < arr1.length; i++) {
			arr3[count++] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[count++] = arr2[i];
		}
		return arr3;
	}

	public static void display(int[] arr) {
		System.out.println("Merged Array is : - ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");

		}

	}

}
