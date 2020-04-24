package array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: - ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the element for search");
		int data = sc.nextInt();
		System.out.println(binarySearch(arr1, data));

	}

	public static int binarySearch(int[] arr, int data) {
		int l = 0;
		int h = arr.length - 1;
		while (l <= h) {
			int mid = (l + h) / 2;
			if (arr[mid] == data) {
				return mid;
			} else if (arr[mid] > data) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

}
