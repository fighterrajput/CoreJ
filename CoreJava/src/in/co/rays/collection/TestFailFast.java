package in.co.rays.collection;

import java.util.Iterator;
import java.util.Vector;

public class TestFailFast {
	public static void main(String[] args) {
		Vector v = new Vector();

		v.add(100);
		v.add("one");
		v.add(true);
		v.add(false);
		
		Iterator it = v.iterator();
		
		v.add("Nandini");

		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	

}
