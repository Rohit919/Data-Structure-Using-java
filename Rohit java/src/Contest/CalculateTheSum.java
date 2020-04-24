package Contest;

import java.util.Scanner;

public class CalculateTheSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int num = s.nextInt();
			arr[i] = num;
		}
		int Q = s.nextInt();
		int[] arr1 = new int[Q]; 
		for (int i = 0; i < Q; i++) {
			int num = s.nextInt();
			arr1[i] = num;
		}
		int[] arr2= new int[n];
		int k=0;
		while (Q > 0) {
			for (int i = 0; i < n; i++) {
				if (i - arr1[k] < 0) {
					arr2[i] = arr[i - arr1[k] + n] + arr[i];
				} else {
					arr2[i] = arr[i] + arr[i - arr1[k]];
				}
			}
			for(int i=0;i<n;i++) {
				arr[i]=arr2[i];
			}
			k++;
			Q--;

		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr2[i];
		}
		int result = (int) (sum % (Math.pow(10, 9) + 7));
		System.out.println(result);
	}

}
