package entities;

public class Rectangle {
	public double Width;
	public double Height;

	public double area() {

		return Width * Height;

	}

	public double perimeter() {

		return (2 * Width) + (2 * Height);

	}

	public double Diagonal() {
		
		return Math.sqrt((Width * Width) + (Height * Height) );
		
	}
	
}
