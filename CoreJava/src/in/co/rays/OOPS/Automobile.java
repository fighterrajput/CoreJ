package in.co.rays.OOPS;

public class Automobile {
  private String color = null;
  private int speed = 0;
  private String make = null;
  
  public static final int NO_OF_GEARS = 6;
  
  public void setColor(String color) {
	  this.color = color;
	  
  }
  public String getColor() {
	  return color;
  }
  public void setSpeed(int speed) {
	  this.speed = speed;
  }
  public int getSpeed() {
	  return speed;
	  
  }
  public void setMake(String make) {
	  this.make = make;
  }
  public String getmake() {
	  return make;
  }
  public void speedBreak() {
	  System.out.println("Dont press the breaks too frequently");
  }
  public void changeGear () {
	  System.out.println("Please change gear");
  }
  public void accelerator() {
	  System.out.println("dont move your legs from accelerator");
  }
  
  
  
  
}
