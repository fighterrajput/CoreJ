package in.co.rays.OOP;

public class TestAccount {
 public static void main(String[] args) {
	Account a = new Account();
	a.setId(2);
	a.setName("Ankit");
	
	System.out.println(a.getId());
	System.out.println(a.getName());
}
}
