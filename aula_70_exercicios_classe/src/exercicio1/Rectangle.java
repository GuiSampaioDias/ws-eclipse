package exercicio1;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return (width + height) * 2;
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	public String toString() {
		return "Area = " + 
				String.format("%.2f", area()) + 
				"\nPerimeter = " +  
				String.format("%.2f", perimeter()) + 
				"\nDIAGONAL = " + 
				String.format("%.2f",diagonal());
	}
}
// String.format("%.2f", width * height);