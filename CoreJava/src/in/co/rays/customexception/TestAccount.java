package in.co.rays.customexception;

public class TestAccount {
	public static void main(String[] args) throws InsufficientBalance {
		Account a = new Account();
		a.setBalance(15000);
		System.out.println("**before**");
		a.deposite(7000);
		try {
			a.withdrawl(20001);
			
		} catch (InsufficientBalance e) {
			System.out.println(e);
			
		}
		
		
		a.getBalance();
		System.out.println("**After**");
		
	}

}
