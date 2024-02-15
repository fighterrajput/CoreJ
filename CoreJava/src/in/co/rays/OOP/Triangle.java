package in.co.rays.OOP;

public class Triangle {
 private int height;
 private int base;
 double half = 0.5;
 
 public void setHeight(int height) {
	 this.height = height;
	 
 }
 public int getHeight() {
	 return height;
 }
 public void setBase(int base) {
	 this.base = base;
 }
 public int getBase() {
	 return base;
	 
 }
  public void area() {
  double tarea= half *getHeight()*getBase();
  System.out.println("Area of triangle = "+tarea);
}}
