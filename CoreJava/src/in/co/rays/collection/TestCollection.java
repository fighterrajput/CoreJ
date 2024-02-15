package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestCollection {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		List l = new ArrayList();
		Collection c1=new ArrayList();
		
		c1.add(20);
		c1.add("Dharm");
		c1.add(5);
		
		Collection c2 = new ArrayList();
		c2.add(20);
		c2.add("ankit");
		c2.add(100.05);
		
		System.out.println(c1.addAll(c2));
		System.out.println(c1);
		
		System.out.println(c1.remove(100.05));
		System.out.println(c1);
		
		System.out.println(c1.contains(100));
		System.out.println(c1.containsAll(c1));
		System.out.println(c1);
		
		System.out.println(c1.isEmpty());
		System.out.println(c1.remove(20));
		System.out.println(c1);
		
		System.out.println(c1.removeAll(c2));
		System.out.println(c1);
		
		System.out.println(c1.retainAll(c1));
		System.out.println(c1);
		
		System.out.println(c1.size());
		
		
		
		
	
		
	}

}
