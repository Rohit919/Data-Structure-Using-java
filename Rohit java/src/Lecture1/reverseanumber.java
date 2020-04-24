package Lecture1;
import java.util.Scanner;

public class reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0, rem, num;
		System.out.println("Enter the number ");
		Scanner s = new Scanner(System.in);
		int b=s.nextInt();
		while(b!=0) {
			rem=b%10;
			rev=rev*10+rem;
			b=b/10;
		}
		System.out.println(rev);

	}

}
