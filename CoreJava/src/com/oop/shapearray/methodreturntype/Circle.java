package com.oop.shapearray.methodreturntype;

public class Circle extends Shape {
	private int radius=0;
	
	public Circle() {
		
	}
 public Circle(int radius) {
	 this.radius = radius;
	 
 }
 
 public void setRadius(int radius) {
	 this.radius = radius;
	 
 }
  public int getRadius() {
	  return radius;
	  
  }
  public void area() {
		int cArea=radius*radius*3;{
			System.out.println("Area of Cir="+cArea);
}
  }
}
