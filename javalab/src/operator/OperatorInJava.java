package operator;

public class OperatorInJava {

	public static void main(String[] args) {
		System.out.println("********** Unary Operator ***********");
		int x = 10;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
		System.out.println(-x);
		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);
		int y = -5;
		System.out.println(-y);
		int a1 = 10;
		int b1 = -10;
		boolean c = true;
		boolean d = false;
		System.out.println(~a1);
		// -11 (minus of total positive value which starts from 0)
		System.out.println(~b1);
		// 9 (positive of total minus, positive starts from 0)
		System.out.println(!c); // false (opposite of boolean value)
		System.out.println(!d);// true

		System.out.println("********** Arithmetic Operator ***********");
		int m = 10;
		int n = 5;
		System.out.println(m + n);
		System.out.println(m - n);
		System.out.println(m * n);
		System.out.println(m / n);
		System.out.println(m % n);
		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);

		System.out.println("********** AND Operator ***********");
		int a2 = 10;
		int b2 = 5;
		int c2 = 20;
		System.out.println(a2 < b2 && a2 < c2);// Logical &&
		System.out.println(a2 < b2 & a2 < c2);// Bitwise &
		System.out.println(a2 < b2 && a2++ < c2);// false && true = false
		System.out.println(a);// 10 because second condition is
		// not checked
		System.out.println(a2 < b2 & a2++ < c2);// false && true = false
		System.out.println(a2);// 11 because second condition
		// is checked

		System.out.println("********** OR Operator ***********");
		System.out.println(a2 > b2 || a2 < c2);// true || true = true
		System.out.println(a2 > b2 | a2 < c2);// true | true = true
		// || vs |
		System.out.println(a2 > b2 || a2++ < c2);// true || true = true
		System.out.println(a2);// 10 because second condition is
		// not checked
		System.out.println(a2 > b2 | a2++ < c2);// true | true = true
		System.out.println(a2);// 11 because second condition
		// is checked

		System.out.println("********** bitwise exclusive OR Operator  ***********");
		System.out.println(a2 < b2 ^ a2 < c2);
		System.out.println(a2 > b2 ^ a2 < c2);// true | true = true
		System.out.println(a2 < b2 ^ a2++ < c2);// false && true = false
		System.out.println(a2);// 11 because second condition
		// is checked
		System.out.println(a2 > b2 ^ a2++ < c2);// true | true = true
		System.out.println(a2);// 11 because second condition
		// is checked

		System.out.println("********** Assignment Operator ***********");
		int a3 = 10;
		a3 += 3;
		System.out.println(a3);
		a3 -= 4;
		System.out.println(a3);
		a3 *= 2;
		System.out.println(a3);
		a3 /= 2;
		System.out.println(a3);
		short num1 = 10;
		short num2 = 10;
//		num1=num1+num2; Compile time error because 10+10=20 now int
		num1 = (short) (num1 + num2);// 20 which is int now converted to short
		System.out.println(num1);

		System.out.println("********** Ternary Operator ***********");
		int num3 = 2;
		int num4 = 5;
		int min = (num3 < num4) ? num3 : num4;
		System.out.println(min);

		System.out.println("********** Left Shift Operator  ***********");
		System.out.println(10 << 2);// 10*2^2=10*4=40
		System.out.println(10 << 3);// 10*2^3=10*8=80
		System.out.println(20 << 2);// 20*2^2=20*4=80
		System.out.println(15 << 4);// 15*2^4=15*16=240

		System.out.println("********** Right Shift Operator  ***********");
		System.out.println(10 >> 2);// 10/2^2=10/4=2
		System.out.println(20 >> 2);// 20/2^2=20/4=5
		System.out.println(20 >> 3);// 20/2^3=20/8=2

		// For positive number, >> and >>> works same
		System.out.println(20 >> 2);
		System.out.println(20 >>> 2);
		// For negative number, >>> changes parity bit (MSB) to 0
		System.out.println(-20 >> 2);
		System.out.println(-20 >>> 2);

	}

}
