package Recursion;

import java.util.Scanner;

public class LastIndex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr;
		arr = takeInput();
		System.out.println("Enter the element for searching: -  ");
		int data = s.nextInt();
		int si = 0;
		System.out.println(lastIndex(arr, si, data));

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
	public static int lastIndex(int[] arr, int i, int data) {

		if (i == arr.length) {
			return -1;
		}
		int index = lastIndex(arr, i + 1, data);
		if (index != -1) {
			return index;
		} else {
			if (arr[i] == data) {
				return i;
			} else {
				return -1;
			}
		}
	}
}
