package com.oop.shapearray.methodreturntype;

public class Triangle extends Shape {
	private int height=0;
	private int base=0;
	
	public Triangle() {
		
	}
	public Triangle(int height, int base) {
		this.height=height;
		this.base=base;
		
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public void area() {
		int tArea=height*base;{
			System.out.println("Area of Tri="+tArea);

}
	}
}
