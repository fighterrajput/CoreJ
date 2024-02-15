package in.co.rays.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Dharm", 300000);
		Employee e2 = new Employee(3, "Ankit", 200000);
		Employee e3 = new Employee(2, "Ram", 3000000);
		Employee e4 = new Employee(5, "Sunil", 3000);

		List list = new ArrayList();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		Collections.sort(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
