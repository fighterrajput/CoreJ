package in.co.rays.withoutconstructor;

public class Circle extends Shape {
	private int radius=0;
	public static final int PI= 3;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void area() {
		int cArea= PI*radius*radius;{
			System.out.println("Circle area ="+cArea);
		}
		

}}
