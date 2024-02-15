package in.co.rays.comparator;

import java.util.Comparator;

public class DecById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getId()-o1.getId();
	}
	

}
