package in.co.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {
	public static void main(String[] args) {
		Vector v = new Vector();

		v.add(100);
		v.add(true);
		v.add("Ankit");

		Enumeration e = v.elements();

		v.add("Dharmveer");

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
