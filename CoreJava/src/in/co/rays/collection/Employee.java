package in.co.rays.collection;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(int id , String name , int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	//@Override
	//public String toString() {
		//String str = id+" "+name+" "+salary;
		//return str;
	//}
	@Override
	public boolean equals(Object obj) {
		System.out.println("in eql");
		Employee e = (Employee)obj;
		boolean eq = this.id == e.id && this.name==e.name && this.salary== e.salary;
		return eq;
	}
	
	@Override
	public int hashCode() {
	System.out.println("in hashcode");
	String str = id+name+salary;
		return str.hashCode();
	}

}
