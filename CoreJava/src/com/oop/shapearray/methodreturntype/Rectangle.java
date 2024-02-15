package com.oop.shapearray.methodreturntype;

public class Rectangle  extends Shape {
	private int length=0;
	private int width=0;
	
	public Rectangle() {
	}
	
	public Rectangle (int length,int width) {
		this.length = length;
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void area() {
		int rArea=length*width;{
			System.out.println("Area of Rec="+rArea);
		}
		
	}

}
