package lecture1;

// check whether the number is an Armstrong number or not.
import java.util.Scanner;

public class Exercise1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int count = 0;
		int sum = 0;
		int num = n;
		while (n != 0) {
			n /= 10;
			count++;
		}
		n=num;
		while (n != 0) {
			int rem = n % 10;
			sum += (int) Math.pow(rem, count);
			n /= 10;
		}
		if (num == sum) {
			result = 1;
			System.out.println(result);
		} else {
			System.out.println(result);
		}
	}
}