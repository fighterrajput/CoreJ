package in.co.rays.OOP;

public class Shape1 {
    private int borderwidth; //defining variable
    private String color; //defining variable
    
    public Shape1() {
    	System.out.println("default");
    }
  //putting the values in constructor
    public Shape1(String color, int borderwidth)  {
    	this.borderwidth = borderwidth;
    	this.color = color;
    	
    }
    //returning the values
    public String color() {
    	return color;
    }
    public int borderwidth() {
    	return borderwidth;
    	
    }
}
