package in.co.rays.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {

		Employee e1 = new Employee(2345, "Dharm", 700000);
		Employee e2 = new Employee(2346, "Nandini", 70000);
		Employee e3 = new Employee(2347, "Ankit", 500000);
		Employee e4 = new Employee(2348, "Sawan", 10000);
		Employee e5 = new Employee(2349, "Sunil", 700);

		List list = new ArrayList();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		// Collections.sort(list, new AssById());
		// Collections.sort(list, new AssbyName());
		Collections.sort(list, new DecById());

		
		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
