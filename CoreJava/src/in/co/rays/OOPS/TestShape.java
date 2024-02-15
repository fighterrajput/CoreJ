package in.co.rays.OOPS;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		s.setBorderWidth(100);
		s.setColor("yellow");
		
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
	}
}
