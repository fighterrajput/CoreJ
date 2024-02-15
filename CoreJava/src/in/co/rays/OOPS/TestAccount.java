package in.co.rays.OOPS;

public class TestAccount {
 public static void main(String[] args) {
	
	 Account a = new Account();
	 a.setAccountType("Saving");
	 a.setBalance(5000);
	 a.setName("Ankit");
	 
	 System.out.println(a.getAccountType());
	 System.out.println(a.getBalance());
	 System.out.println(a.getName());
	 a.deposite();
	 a.fundTransfer();
	 a.payBill();
}
	

}
