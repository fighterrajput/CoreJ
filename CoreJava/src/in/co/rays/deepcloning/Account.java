package in.co.rays.deepcloning;

public class Account implements Cloneable {
	int balance = 0;

	public Account(int balance) {
		this.balance = balance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
