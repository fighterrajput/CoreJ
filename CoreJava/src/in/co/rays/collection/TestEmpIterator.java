package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmpIterator {
	public static void main(String[] args) {

		Employee e1 = new Employee(2, "ijk", 2000);
		Employee e2 = new Employee(3, "ijk", 2000);

		List<Employee> list = new ArrayList<Employee>();

		list.add(e1);
		list.add(e2);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Employee emp = (Employee) it.next();

			System.out.println("ID ="+emp.getId());
			System.out.println("Name ="+emp.getName());
			System.out.println("Salary ="+emp.getSalary());
		}

	}

}
