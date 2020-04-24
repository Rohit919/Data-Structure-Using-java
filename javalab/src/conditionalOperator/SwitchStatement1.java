package conditionalOperator;

public class SwitchStatement1 {

	public static void main(String[] args) {
		// It is program to printing month name for the given number.
		int month = 7;
		String monthString = "";
		switch (month) {
		case 1:
			monthString = "1 - January";
			break;
		case 2:
			monthString = "2 - February";
			break;
		case 3:
			monthString = "3 - March";
			break;
		case 4:
			monthString = "4 - April";
			break;
		case 5:
			monthString = "5 - May";
			break;
		case 6:
			monthString = "6 - June";

			break;
		case 7:
			monthString = "7 - July";
			break;
		case 8:
			monthString = "8 - August";
			break;
		case 9:
			monthString = "9 - September";
			break;
		case 10:
			monthString = "10 - October";
			break;
		case 11:
			monthString = "11 - November";
			break;
		case 12:
			monthString = "12 - December";
			break;
		default:
			System.out.println("Invalid Month!");
		}
		System.out.println(monthString);

		//It is program to check Vowel and Consonant.
		char ch = 'O';
		switch (ch) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;

		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		case 'A':
			System.out.println("Vowel");
			break;
		case 'E':
			System.out.println("Vowel");
			break;
		case 'I':
			System.out.println("Vowel");
			break;
		case 'O':
			System.out.println("Vowel");
			break;
		case 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}

	}

}
