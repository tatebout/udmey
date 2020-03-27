package entities;

public class Rectangle {
	public static double width;
	public static double height;

	public static double area() {
		return width * height;
	}

	public static double perimeter() {
		return (width + height) + 2;
	}

	public static double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
