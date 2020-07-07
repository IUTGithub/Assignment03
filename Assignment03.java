// CS112 Exam#01
// Name: Kenny Fok
import java.util.Scanner;
import java.io.File;

public class Assignment03 {
			
	public static void main(String[] args) throws Exception {
		File		inFile = new File("inputEx01_01.txt");
		Scanner		input = new Scanner(inFile);
		int	numCircles = input.nextInt();
		int	numSpheres = input.nextInt();
		
		Shape[]		shapeList = new Shape[numCircles+numSpheres];
		int i = 0;
		for ( ; i < numCircles ; i++ ) {
			double x, y, radius;
			
			x = input.nextDouble();
			y = input.nextDouble();
			radius = input.nextDouble();
			
			shapeList[i] = new Circle(x, y, radius);
		}
		for ( ; i < numCircles + numSpheres ; i++ ) {
			double x, y, z, radius;
			
			x = input.nextDouble();
			y = input.nextDouble();
			z = input.nextDouble();
			radius = input.nextDouble();
			
			shapeList[i] = new Sphere(x, y, z, radius);
		}

		printStatus(shapeList);
		
	}

	
	public static void printStatus(Shape[] shapeList) {
		for (int x = 0; x < shapeList.length; x++) {
			System.out.printf("%s\n", shapeList[x].toString());
		}
	}
}
