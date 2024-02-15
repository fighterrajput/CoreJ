package in.co.rays.OOPS;

import java.util.Date;

public class Person {

	private String firstName = null;
	private String lastName = null;
	private Date dob = null;
	public static final int AVG_AGE = 18;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	
	}
	public String getFirstName() {
		return firstName;
		
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
	  return lastName;
	}
	public void setDob(Date dob) {
		this.dob = dob;
		
	}
	public Date getDob() {
		return dob;
	}
}
