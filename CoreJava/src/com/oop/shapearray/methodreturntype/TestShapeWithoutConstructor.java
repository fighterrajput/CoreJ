package com.oop.shapearray.methodreturntype;

public class TestShapeWithoutConstructor {
	public static void main(String[] args) {
		Shape [] shape = new Shape [3];
		
		shape[0]= Shape.getShape(1);
		shape[1]= Shape.getShape(2);
		shape[2]= Shape.getShape(3);
		
		Rectangle r = (Rectangle)shape[0];
		r.setLength(10);
		r.setWidth(20);
		
		Circle c = (Circle)shape[1];
		c.setRadius(10);
				
		Triangle t = (Triangle)shape[2];
		t.setBase(15);
		t.setHeight(17);
		
		for (int i = 0; i < shape.length; i++) {
			
			shape[i].area();
			
		}
		
	

}
}