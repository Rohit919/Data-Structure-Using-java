package lecture1;

import java.util.Scanner;

public class Exercise1_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double radius = s.nextDouble();
		double perimeter;
		double area;
		area = Math.PI*radius*radius;
		perimeter=2*Math.PI*radius;
		System.out.println(perimeter);
		System.out.println(area);
	}
}