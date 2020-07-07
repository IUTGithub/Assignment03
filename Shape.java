
abstract class Shape {
	public double xCoor;
	public double yCoor;
	public Shape(double xCoordinate, double yCoordinate) {
		this.xCoor = xCoordinate;
		this.yCoor = yCoordinate;
		
	}
	
	public abstract double getArea();
}
