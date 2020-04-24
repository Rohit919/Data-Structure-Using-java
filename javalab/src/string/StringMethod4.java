package string;

public class StringMethod4 {

	public static void main(String[] args) {

		String s1 = "boy";
		String s2 = "box";
		String s3 = "boy";
		String s4 = "Boy";
		int num1 = s1.compareTo(s2);
		int num2 = s1.compareTo(s3);
		int num3 = s1.compareTo(s4);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		char ch = 'b';
		int num4 = ch;
		char ch1 = 'B';
		int num5 = ch1;
		System.out.println(num4);
		System.out.println(num5);

	}

}