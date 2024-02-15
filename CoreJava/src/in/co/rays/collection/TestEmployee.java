package in.co.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Ankit", 1000);
		Employee e2 = new Employee(2,"Dharm", 20000);
		
		List list = new ArrayList();
		
		list.add(1);
		list.add("Ankit");
		list.add(e1);
		list.add(e2);
		
		System.out.println("list =>"+list);
		
		
		
		
		
	}

}
