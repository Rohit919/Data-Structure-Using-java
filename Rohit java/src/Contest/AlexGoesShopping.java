package Contest;

import java.util.Scanner;

public class AlexGoesShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter the number of items: - ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		//System.out.println("Enter the price of items: -");
		for (int i = 0; i < n; i++) {
			int price = s.nextInt();
			arr[i] = price;
		}
		int N = s.nextInt();
		while (N > 0) {
			//System.out.println("Enter unit of money: -");
			int money = s.nextInt();
			//System.out.println("Enter the kind of items: -");
			int items = s.nextInt();
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (money % arr[i] == 0) {
					count++;
				}
			}
			if (count == items) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			N--;
		}

	}

}
