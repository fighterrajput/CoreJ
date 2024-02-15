package in.co.rays.OOP;

public class Rectangle extends Shape {
      private int length;
      private int breadth;
      
      public void setLenght( int length) {
    	  this.length = length;
      }
      public int getLength() {
    	  return length;
    	  
      }
      public void setBreadth( int breadth) {
    	  this.breadth = breadth;
      }
      public int getBreadth() {
    	  return breadth;
      }
      public void area() {
    	  int rarea = getLength()* getBreadth();
    	  System.out.println("Area of rectangle = "+ rarea);
      }
}
