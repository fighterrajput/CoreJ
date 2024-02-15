package in.co.rays.OOP;

public class RecShape1 extends Shape1 {
 private int length;
 private int breadth;
 
 public RecShape1(int length, int breadth) {
	 this.length = length;
	 this.breadth = breadth;
	 
 }
 public int length() {
	 return length;
	 
 }
 public int breadth() {
	 return breadth;
	 
 }
 public void area() {
	 int r1area = length* breadth;
	 System.out.println(r1area);
 }
}
