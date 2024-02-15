package com.oop.abstractclass;

public class TestCars {
	public static void main(String[] args) {
		
		Defender d = new Defender();
		Thar t = new Defender();
		
		t.lowSpeed();
		t.highSpeed();
		t.playMusic();
		
		d.drive();
		d.lowSpeed();
		d.highSpeed();
		
		Car.playMusic();
		
	}

}
