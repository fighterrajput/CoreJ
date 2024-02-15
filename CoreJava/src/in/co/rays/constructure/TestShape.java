package in.co.rays.constructure;

public class TestShape {
	public static void main(String[] args) {
		Shape s1 = new Shape(100, "red");

		Rectangle r = new Rectangle(20, 30);

		// System.out.println(s1.getBorderWidth());
		// System.out.println(s1.getColor());

		Shape s2 = new Shape(50, "Yellow");

		System.out.println(r.getBorderWidth());
//	 System.out.println(s2.getColor());

	}
}
