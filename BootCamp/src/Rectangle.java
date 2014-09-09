/**
 * Created by vivekpatil on 8/18/14.
 */
public class Rectangle {

	private double length;
	private double breadth;


	Rectangle(double length, double breadth) throws Exception {
		if (length == 0 || breadth == 0)
			throw new Exception("Invalid Inputs");
		this.length = length;
		this.breadth = breadth;

	}

	public static Rectangle createSquare(double side) throws Exception {
		return new Rectangle(side, side);
	}

	public double calculateArea() {
		return length * breadth;
	}

	public double calculatePerimeter() {
		return 2 * (length + breadth);
	}
}
