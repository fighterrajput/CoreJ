package in.co.rays.withconstructure;

public class Triangle extends Shape {
	private int base = 0;
	private int height = 0;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void area() {
		int tArea = base * height * (1 / 2);
		System.out.println("Area of Rec=" + tArea);
	}
}
