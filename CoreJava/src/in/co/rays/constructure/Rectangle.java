package in.co.rays.constructure;

public class Rectangle extends Shape {
	int length=0;
	int width=0;
	
	public Rectangle () {
		System.out.println("Default");
	}
	public Rectangle(int length, int width) {
		super(20);
		this.length = length;
		this.width = width;
	}

}
