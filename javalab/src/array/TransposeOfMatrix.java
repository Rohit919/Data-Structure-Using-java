package array;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		System.out.println("Enter the size of the row of an array ");
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		System.out.println("Enter the size of the column of an array ");
		int n = s.nextInt();
		int[][] arr1 = new int[m][n];
		System.out.println("Enter the element of the an array");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = s.nextInt();
			}
		}
		int[][] arr2 = new int[arr1.length][arr1[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				arr2[j][i] = arr1[i][j];
			}
		}
		System.out.println("Transpose of  matrix is: -");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
