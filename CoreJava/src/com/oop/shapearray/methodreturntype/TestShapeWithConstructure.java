package com.oop.shapearray.methodreturntype;

public class TestShapeWithConstructure {
	public static void main(String[] args) {
		Shape [] shape = new Shape[3];
		
		shape[0]= new Rectangle(10,20);
		shape [1]= new Circle(10);
		shape [2]= new Triangle(20, 50);
		
		for (int i = 0; i < shape.length; i++) {
			shape[i].area();
		}
		
		
		
	}

}
