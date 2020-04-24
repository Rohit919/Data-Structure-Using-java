package array;

import java.util.Scanner;

public class InsertAnElementInArray {
	public static void main(String[] args) {
		int[] arr1, arr2;
		arr1 = takeInput();
		arr2 = insertElement(arr1);
		display(arr2);

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

	public static int[] insertElement(int[] arr1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index number : - ");
		int n = sc.nextInt();
		System.out.println("Enter the element you want to insert: -  ");
		int element = sc.nextInt();
		int[] arr2 = new int[arr1.length + 1];
		for (int i = 0; i < n; i++) {
			arr2[i] = arr1[i];
		}
		arr2[n] = element;
		for (int i = n + 1; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		return arr2;
	}

	public static void display(int[] arr) {
		System.out.println("Merged Array is : - ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");

		}

	}

}
