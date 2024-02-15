package in.co.rays.shallowcloning;

public class Account implements Cloneable {
	int balance = 0;
	
	public Account() {
		
	}
	public Account(int balance) {
		this.balance = balance;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
