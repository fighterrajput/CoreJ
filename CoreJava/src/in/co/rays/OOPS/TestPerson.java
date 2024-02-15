package in.co.rays.OOPS;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Person p = new Person();
		Date d = new Date();
		
		p.setFirstName("Ankit");
		p.setLastName("Rajput");
		p.setDob(d);
		
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getDob());
		System.out.println(p.AVG_AGE);
	}
	
}
