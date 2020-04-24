package array;

import java.util.Scanner;

public class MultiplicationOfTwoMatrix {

	public static void main(String[] args) {
		System.out.println("Enter the size of the row of 1st array");
		Scanner s = new Scanner(System.in);
		int m1 = s.nextInt();
		System.out.println("Enter the size of the column of 1st array");
		int n1 = s.nextInt();
		int[][] arr1 = new int[m1][n1];
		System.out.println("Enter the element of the 1st array");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter the size of the row of 2nd array");
		int m2 = s.nextInt();
		System.out.println("Enter the size of the column of 2nd array");
		int n2 = s.nextInt();
		int[][] arr2 = new int[m2][n2];
		System.out.println("Enter the element of the 2nd array");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = s.nextInt();
			}
		}
		if (arr1[0].length == arr2.length) {
			int[][] arr3 = new int[arr1.length][arr2[0].length];
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2[0].length; j++) {
					arr3[i][j] = 0;
					for (int k = 0; k < arr2.length; k++) {
						arr3[i][j] += arr1[i][k] * arr2[k][j];
					}
				}
			}
			System.out.println("Multiplication of  matrix is: -");
			for (int i = 0; i < arr3.length; i++) {
				for (int j = 0; j < arr3[0].length; j++) {
					System.out.print(arr3[i][j] + " ");
				}
				System.out.println();
			}
		}else {
			System.out.println("Multiplication is not possible");
		}
	}

}
