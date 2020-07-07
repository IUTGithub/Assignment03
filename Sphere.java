public class Sphere extends Circle {
	private double zCoor;
	private double area;
	private static int numSpheres;
	public Sphere(double xCoordinate, double yCoordinate, double zCoordinate, double cRadius) {
		super(xCoordinate, yCoordinate, cRadius);
		radius = cRadius;
		this.zCoor = zCoordinate;
		numSpheres++;
	}
	
	public Sphere() {
		super(0, 0, 1);
		this.zCoor = 0;
		numSpheres++;
	}
	
	public static int getNumSpheres() {
		return numSpheres;
	}
	
	@Override
	public double getArea() {
		area =  (double) (4 * Math.PI * this.radius * this.radius * this.radius)/3;
		return area;
	}
	
	public String toString() {
		double tempArea = this.getArea();
		return String.format("Sphere with (%.2f, %.2f, %.2f) with r=%.2f Area=%.2f", this.xCoor, this.yCoor, this.zCoor, this.radius, tempArea);
	}
}
