package lecture4;

import java.util.Scanner;

public class PrimeNumbersBetweenTwoIntegers {

	public static void main(String[] args) {
		System.out.println("Enter the low value");
		Scanner s = new Scanner(System.in);
		int low=s.nextInt();
		System.out.println("Enter the high value");
		int high=s.nextInt();
        while (low < high) {
            if(checkPrimeNumber(low))
                System.out.print(low + " ");

            ++low;
        }
    }

    public static boolean checkPrimeNumber(int num) {
        boolean flag = true;

        for(int i = 2; i <= num/2; ++i) {

            if(num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;

	}

}
