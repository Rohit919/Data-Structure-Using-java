package Contest;

import java.util.Scanner;

public class MaxSumPathOfTwoArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t > 0) {
			int[] arr1, arr2;
			int m = s.nextInt();
			int n = s.nextInt();
			arr1 = new int[m];
			for (int i = 0; i < m; i++) {
				int num1 = s.nextInt();
				arr1[i] = num1;
			}
			arr2 = new int[n];
			for (int j = 0; j < n; j++) {
				int num2 = s.nextInt();
				arr2[j] = num2;
			}
			System.out.println(maxPathSum(arr1, arr2, m, n));
			t--;
		}
	}

	static int max(int x, int y) {
		return (x > y) ? x : y;
	}

	static int maxPathSum(int ar1[], int ar2[], int m, int n) {
		int i = 0, j = 0;
		int result = 0, sum1 = 0, sum2 = 0;
		while (i < m && j < n) {
			if (ar1[i] < ar2[j])
				sum1 += ar1[i++];
			else if (ar1[i] > ar2[j])
				sum2 += ar2[j++];
			else {
				result += max(sum1, sum2);
				sum1 = 0;
				sum2 = 0;
				while (i < m && j < n && ar1[i] == ar2[j]) {
					result = result + ar1[i++];
					j++;
				}
			}
		}
		while (i < m)
			sum1 += ar1[i++];
		while (j < n)
			sum2 += ar2[j++];
		result += max(sum1, sum2);
		return result;
	}

}
