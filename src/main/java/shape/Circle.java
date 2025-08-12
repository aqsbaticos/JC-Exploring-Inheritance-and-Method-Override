package shape;

public class Circle extends Shape {

	private double radius = 5.0;

	public double area() {
		return Math.PI * radius * radius;
	}
}
