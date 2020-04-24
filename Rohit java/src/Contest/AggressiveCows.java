package Contest;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int C = s.nextInt();
		int[] arr = new int[N];
		//System.out.println("Enter the element of the an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(binarySearch(C,arr));
	}

	public static int binarySearch(int cows, int[] positions) {
		int start = 0, end = positions[positions.length - 1] - positions[0];
		while (start <= end) {
			int middle = (start + end) / 2;
			if (validMinDistance(middle, cows, positions))
				start = middle + 1;
			else
				end = middle - 1;
		}
		return end;
	}

	static boolean validMinDistance(int distance, int cows, int[] positions) {
		int cowPlaced = 1;
		int lastPosition = positions[0];
		for (int i = 1; i < positions.length; i++) {
			if (positions[i] - lastPosition >= distance) {
				cowPlaced++;
				if (cowPlaced == cows) {
					return true;
				}
				lastPosition = positions[i];
			}
		}
		return false;
	}

}
