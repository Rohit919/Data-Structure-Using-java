package Lecture10;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr, sorted;
		arr = takeInput();
		quickSort(arr, 0, arr.length);
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

	public static void quickSort(int[] arr, int start, int end) {
		if (start >= end) {
			return ;
		}
		int pindex= partion(arr, start, end);
		quickSort(arr, start, pindex-1);
		quickSort(arr, pindex+1, end);
	}

	public static int partion(int[] arr, int start, int end) {
		int pindex=start;
		int pivot= arr[end];
		for(int i=start; i<=end-1; i++) {
			if(arr[i]<=pivot) {
				swap(arr,i,pindex);
				pindex++;
			}
		}
	}

	public static void display(int[] arr) {
		System.out.println("Mearge array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
