package Rohit;

import java.util.Scanner;

public class areaandcircumferenceofcircle {

	public static void main(String[] args) {
		float Area, Circumference;
		System.out.println("Enter the radius");
		Scanner s = new Scanner(System.in);
		int R=s.nextInt();
		Area = (float) (3.14*R*R);
		Circumference = (float) (2*3.14*R);
		System.out.println("Area of circle is\t"+Area);
		System.out.println("Circumference of circle is\t"+Circumference);
	}
}
