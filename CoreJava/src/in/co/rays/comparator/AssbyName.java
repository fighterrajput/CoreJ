package in.co.rays.comparator;

import java.util.Comparator;

public class AssbyName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
	

}
