package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SumTriangle {

	public static void main(String[] args) {
		int[] arr;
		arr = takeInput();
		printTriangle(arr);
	}

	public static void printTriangle(int[] arr) {
		if (arr.length < 1)
			return;
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			int x = arr[i] + arr[i + 1];
			temp[i] = x;
		}
		printTriangle(temp);
		System.out.println(Arrays.toString(arr));
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

}
