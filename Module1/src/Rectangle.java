
public class Rectangle {
	private double width;
	private double length;
	public double area;
	public double perim;
	
	public Rectangle() {
		width = 10;
		length = 10;
		area = this.length * this.width;
		perim = 2* (this.length + this.width);
	}
	public Rectangle(double custlength, double custwidth) {
		this.width = custwidth;
		this.length = custlength;
		area = this.length * this.width;
		perim = 2* (this.length + this.width);
	}
	
	
}
