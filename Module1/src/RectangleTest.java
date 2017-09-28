import java.util.Scanner;

public class RectangleTest {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		Rectangle NoArgs = new Rectangle();
		/*
		System.out.println("Input desired length: ");
		double length = input.nextDouble();
		System.out.println("Input desired width: ");
		double width = input.nextDouble();
		*/
		Rectangle CustRect = new Rectangle(10, 5);
		System.out.println("The Area of Rectangle 1 is: " + NoArgs.area);
		System.out.println("The perimeter of Rectangle 1 is: " + NoArgs.perim);
		System.out.println("The Area of Rectangle 2 is: " + CustRect.area);
		System.out.println("The perimeter of Rectangle 2 is: " + CustRect.perim);
	}
}
