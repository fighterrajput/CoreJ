package com.oop.inheritance;

public class TestSmartphone {

	public static void main(String[] args) {

		Smartphone s = new Smartphone();
		s.setCamera(100);
		s.setProcesesor("Any");
		s.setRam(6);
		s.setRom(128);

		Ap a = (Ap) s;
		a.setCost(150000);
		a.setModel("15 pro max");

		System.out.println("price =" + a.getCost());
		System.out.println("Camera=" + a.getCamera());
		System.out.println(a.getModel());
		System.out.println(a.getProcesesor());
		System.out.println(a.getRam());
		System.out.println(a.getRom());
		System.out.println();
	}
}
