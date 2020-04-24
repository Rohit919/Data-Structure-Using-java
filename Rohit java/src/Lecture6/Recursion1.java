package Lecture6;

public class Recursion1 {

	public static void main(String[] args) {
		int[] arr = { 3, 8, 5, 8, 8, 4 };
		int i = 0, data = 8;
		System.out.println(firstindex(arr, i, data));
		System.out.println(allindices(arr, i, data));
	}

	public static int[] allindices(int[] arr, int i, int data) {

		return null;
	}

	public static int firstindex(int[] arr, int i, int data) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == data) {
			return i;
		} else {
			int ans = firstindex(arr, i + 1, data);
			return ans;
		}
	}

}
