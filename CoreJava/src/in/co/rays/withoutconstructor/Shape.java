package in.co.rays.withoutconstructor;

public class Shape {
	private int length=0;
	private int borderWidth=0;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public void area() {
		System.out.println("Area of Shape");
	}
	

}
