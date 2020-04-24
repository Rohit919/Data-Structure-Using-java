package Lecture5;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		int rows, cols, size, count = 0;
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

		// Calculates the size of array
		size = rows * cols;

		// Count all zero element present in matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (a[i][j] == 0)
					count++;
			}
		}

		if (count > (size / 2))
			System.out.println("Given matrix is a sparse matrix");
		else
			System.out.println("Given matrix is not a sparse matrix");

	}

}
