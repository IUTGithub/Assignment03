
public class Circle extends Shape {
	protected double radius;
	protected double area;
	private static int numCircles;
	
	public Circle(double xCoordinate, double yCoordinate, double cRadius) {
		super(xCoordinate, yCoordinate);
		this.radius = cRadius;
	}
	
	public Circle() {
		super(0, 0);
		numCircles++;
		this.radius = 1;
	}
	
	public static int getNumSpheres() {
		return numCircles;
	}

	@Override
	public double getArea() {
		area = Math.PI * this.radius * this.radius;
		return area;
	}
	
	@Override
	public String toString() {
		double tempArea = this.getArea();
		return String.format("Circle with (%.2f, %.2f) with r=%.2f Area=%.2f", this.xCoor, this.yCoor, this.radius, tempArea);
	}

}
