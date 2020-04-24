package lecture4;
import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		int[] arr;
		arr=takeInput();
		System.out.println("Enter the element");
		Scanner s = new Scanner(System.in);
		int data=s.nextInt();
		System.out.println(linearSearch(arr, data));
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
	public static int linearSearch(int[] arr, int data) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
		}

		return -1;

	}

}
