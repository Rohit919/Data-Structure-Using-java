package Week3;

import java.util.Scanner;

class Shape {
	double length, breadth;

	Shape(double l, double b) { // Constructor to initialize a Shape object
		length = l;
		breadth = b;
	}

	Shape(double len) { // Constructor to initialize another Shape object
		length = breadth = len;
	}

	double calculate() { // To calculate the area of a shape object
		return length * breadth;
	}
}

public class Test1 extends Shape {
	double hight;

	Test1(double l, double b, double h) {
		super(l, b);
		hight = h;
	}
	Test1(double l, double h) {
		super(l);
		hight = h;
	}
	double calculate() { 
		return super.calculate()*hight ;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);// Create an object to read input
		double l = sc.nextDouble(); // Read length
		double b = sc.nextDouble(); // Read breadth
		double h = sc.nextDouble(); // Read height
		Test1 myshape1 = new Test1(l, h);
		Test1 myshape2 = new Test1(l, b, h);
		double volume1;
		double volume2;
		volume1 = myshape1.calculate();
		volume2 = myshape2.calculate();
		System.out.println(volume1);
		System.out.println(volume2);
	}
}
