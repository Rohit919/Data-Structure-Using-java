package Lecture5;

import java.util.Scanner;

public class Identitymatrix {

	public static void main(String[] args) {
		int rows, cols;
		boolean flag = true;
		System.out.println("Enter the size of the an array M*N");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[][] a = new int[m][n];
		System.out.println("Enter the element of the an array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = s.nextInt();
			}
		}
		rows = a.length;
		cols = a[0].length;

		// Checks whether given matrix is a square matrix or not
		if (rows != cols) {
			System.out.println("Matrix should be a square matrix");
		} else {
			// Checks if diagonal elements are equal to 1 and rest of elements are 0
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (i == j && a[i][j] != 1) {
						flag = false;
						break;
					}
					if (i != j && a[i][j] != 0) {
						flag = false;
						break;
					}
				}
			}

			if (flag)
				System.out.println("Given matrix is an identity matrix");
			else
				System.out.println("Given matrix is not an identity matrix");
		}

	}

}
