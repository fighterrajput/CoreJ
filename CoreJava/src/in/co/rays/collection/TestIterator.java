package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(500);
		list.add("pqr");
		list.add("Ankit");
		list.add(true);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(list);

	}

}
