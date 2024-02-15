package com.oop.inheritance;

public class TestShape {
	public static void main(String[] args) {
		Shape s1= new Shape();
		
		s1.setBorderWidth(100);
		s1.setColor("red");
		s1.area();
		
		
		Rectangle r1 = new Rectangle ();
		r1.setLength(10);
		r1.setWidth(25);
		r1.setBorderWidth(50);
		r1.area();
		
		Shape shape = new Rectangle();
		shape.area();
		
		Rectangle r = (Rectangle)shape;
		r.area();
		
		
		
		System.out.println(s1.getBorderWidth());
		System.out.println(s1.getColor());
		System.out.println(r1.getBorderWidth());
		System.out.println(r1.getLength());
		System.out.println(r1.getWidth());
	}

}
