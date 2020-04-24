package Lecture5;

import java.util.Scanner;

public class TransposeOfTheMatrix {

	public static void main(String[] args) {
		int[][] arr1, arr2;
		arr1 = takeInput();
		arr2 = transposeofarray(arr1);
		output(arr2);	
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
	public static int[][] transposeofarray(int[][]arr1){
		int[][]arr2 = new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				arr2[j][i] = arr1[i][j];
			}	
		}
		return arr2;
	}
	public static void output(int[][]arr) {
		System.out.println("Transpose of  matrix is: -");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
