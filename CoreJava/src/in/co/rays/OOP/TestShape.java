package in.co.rays.OOP;

public class TestShape {
public static void main(String[] args) {
	Shape s= new Shape();
	s.setColor("red");
	s.setBorderWidth(10);
	
	Rectangle r = new Rectangle();
	r.setColor("blue");
	r.setBorderWidth(10);
	r.setLenght(20);
	r.setBreadth(30);
	r.area();
	
	Circle c = new Circle();
	c.setRadius(20);
	c.area ();
	
	Triangle t = new Triangle();
	t.setBase(20);
	t.setHeight(15);
	t.area();
}}
