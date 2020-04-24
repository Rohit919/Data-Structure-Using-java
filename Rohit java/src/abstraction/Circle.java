package abstraction;

public class Circle extends Geomatary {
	public double r;

	public Circle() {
		r = 1.0;
	}

	public Circle(double r) {
		this.r = r;
	}

	public double area() {
		return PI * r * r;
	}

	public double circumference() {
		return 2 * PI * r;
	}
}
