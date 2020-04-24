package Lecture5;

import java.util.Scanner;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		int[][] arr1, arr2, arr3;
		arr1 = takeInput();
		arr2 = takeInput();
		if(arr1.length==arr2.length&&arr1[0].length==arr2[0].length) {
			arr3 = additionofarray(arr1,arr2);
			output(arr3);
		}
		else {
			System.out.println("Addition not possible bcz size of both matrix are not equal. ");
		}
	}
	public static int[][] takeInput() {
		System.out.println("Enter the size of the an array M*N");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("Enter the element of the an array");
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++){
			arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}
	public static int[][] additionofarray(int[][]arr1, int[][]arr2){
		int[][]arr3 = new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				arr3[i][j] = arr2[i][j] +arr1[i][j];
			}	
		}
		return arr3;
	}
	public static void output(int[][]arr) {
		System.out.println("Addition of two matrices is: -");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
