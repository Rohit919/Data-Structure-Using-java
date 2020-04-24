package StringQuestion;

import java.util.Arrays;

public class KlengthString {

	public static void main(String[] args) {
		String str = "rohit";
		int k = 5;
		System.out.println(findPermutation(str, k));

	}

	static int findPermutation(String str, int k) {
		boolean[] has = new boolean[26];
		Arrays.fill(has, false);
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (!has[str.charAt(i) - 'a']) {
				cnt++;
				// Update the appearance of the current character
				has[str.charAt(i) - 'a'] = true;
			}
		}

		int ans = 1;
		// Since P(n, r) = n! / (n - r)!
		for (int i = 2; i <= cnt; i++)
			ans *= i;

		for (int i = cnt - k; i > 1; i--)
			ans /= i;
		// Return the answer
		return ans;
	}

}
