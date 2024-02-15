package in.co.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector v = new Vector();

		v.add(100);
		v.add("one");
		v.add(true);
		v.add(false);

		Enumeration e = v.elements();
		

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			//we cannot use remove method in vector 
		}

	}

}
