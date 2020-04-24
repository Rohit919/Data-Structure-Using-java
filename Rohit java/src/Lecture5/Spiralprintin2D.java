package Lecture5;

import java.util.Scanner;

public class Spiralprintin2D {

	public static void main(String[] args) {
		int[][] arr;
		arr = takeInput();
		output(arr);
	}

	public static int[][] takeInput() {
		System.out.println("Enter the size of the an array M*N");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("Enter the element of the an array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}

	public static void output(int[][] arr) {
		int left = 0, top = 0, right = arr[top].length - 1, bottom = arr.length - 1;
		int count = arr[top].length - 1 * arr.length - 1;
		int dir = 1;
		while (right >= left && bottom >= top) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.println(arr[top][i]);
						count--;
					}
					dir = 2;
					left++;
				} else if (dir == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.println(arr[right][i]);
						count--;
					}
					dir = 3;
					top++;
				} else if (dir == 3) {
					for (int i = right; i >= left; i--) {
						System.out.println(arr[bottom][i]);
						count--;
					}
					dir = 4;
					right--;
				} else if (dir == 2) {
					for (int i = bottom; i <= top; i++) {
						System.out.println(arr[left][i]);
						count--;
					}
					dir = 1;
					bottom--;
				}
			}
		}
	}

}
