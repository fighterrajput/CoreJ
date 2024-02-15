package in.co.rays.constructure;

public class Shape {
	private int borderWidth=0;
	private String color=null;
	private String depth = null;
	
	public Shape() {
		System.out.println("default constructure");
	}
    public Shape(int borderWidth) {
    	this();
    	this.borderWidth = borderWidth;
  
    	
    }
    public Shape(int borderWidth, String color) {
    	this.borderWidth = borderWidth;
    	this.color = color;
    	
    }
    
    
    
    
    
    public void setBorderWidth(int borderWidth) {
    	this.borderWidth = borderWidth;
    }
    public int getBorderWidth() {
    	return borderWidth;
    }
    public void setColor(String color) {
    	this.color = color;
    }
    public String getColor() {
    	return color;
    }
}
