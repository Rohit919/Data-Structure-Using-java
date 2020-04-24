package string;

public class StringMethod19 {
	public static void main(String[] args) {

		String s1 = "A";
		String s2 = "A";
		String s3 = "a";
		String s4 = new String("A");
		String s5 = new String("A");
		boolean b1 = (s1 == s2);
		boolean b2 = (s5 == s4);
		boolean b3 = (s1 == s3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}
}