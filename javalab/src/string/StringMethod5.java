package string;

public class StringMethod5 {

	public static void main(String[] args) {

		String s1 = "boy";
		String s2 = "box";
		String s3 = "boy";
		String s4 = "Boy";
		int num1 = s1.compareToIgnoreCase(s2);
		int num2 = s1.compareToIgnoreCase(s3);
		int num3 = s1.compareToIgnoreCase(s4);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}