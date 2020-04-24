package aggregation;

public class Circle {
	//Operation op; // aggregation
	double pi = 3.14;

	double area(int radius) {
		Operation op = new Operation();
		int rsquare = op.square(radius);
		return pi * rsquare;
	}
	public static void main(String args[]) {
		Circle c = new Circle();
		double result = c.area(5);
		System.out.println("Area of the Circle is "+result);
	}

}
