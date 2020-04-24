package Contest;

import java.util.Scanner;

public class TrappingRainWater {

	public static void main(String[] args) {
		System.out.println("Enter The Number Of Test Cases : ");
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while (T > 0) {
			int[] arr;
			arr = takeInput();
			int Water = RainWater(arr);
			System.out.println("Maximum water that can be accumulated is " + Water);
			T--;
		}
	}

	public static int RainWater(int[] arr) {
		int n = arr.length;
		// left[i] contains height of tallest bar to the
		// left of i'th bar including itself
		int left[] = new int[n];

		// Right [i] contains height of tallest bar to
		// the right of ith bar including itself
		int right[] = new int[n];
		int water = 0;
		left[0] = arr[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}
		for (int i = 0; i < n; i++) {
			water += Math.min(left[i], right[i]) - arr[i];
		}
		return water;
	}

	public static int[] takeInput() {
		System.out.println("Enter the size of the an array");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the element of the an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

}
