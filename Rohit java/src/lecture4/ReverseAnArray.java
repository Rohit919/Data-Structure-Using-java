package lecture4;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr;
		arr=takeInput();
		reversearray(arr);
		display(arr);
		
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
	public static int[] reversearray(int[] arr){
		for (int i = 0; i < arr.length / 2; i++) {
		    int temp = arr[i];
		    arr[i] = arr[arr.length - 1 - i];
		    arr[arr.length - 1 - i] = temp;
		 }
		return arr;
	}
	public static void display(int[] arr) {
		System.out.println("Reverse array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
