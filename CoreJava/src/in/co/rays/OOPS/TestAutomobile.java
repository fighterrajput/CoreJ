package in.co.rays.OOPS;

public class TestAutomobile {
   public static void main(String[] args) {
	 Automobile a = new Automobile();
		a.setColor("Red");
		a.setMake("Landrover Defender");
		a.setSpeed(160);
		a.accelerator();
		a.changeGear();
		a.speedBreak();
		
		System.out.println(a.getColor());
		System.out.println(a.getmake());
		System.out.println(a.getSpeed());
		System.out.println(a.NO_OF_GEARS);
		
		System.out.println(" Driving Instructions below ");
		a.accelerator();
		a.changeGear();
		a.speedBreak();
		
}
	
}
