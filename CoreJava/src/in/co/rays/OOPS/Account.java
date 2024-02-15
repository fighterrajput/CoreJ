package in.co.rays.OOPS;

public class Account {

	private String name = null;
	private String accountType = null;
	private double balance = 0.0;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType() {
		return accountType;
		
	}
	public void setBalance(double balance ) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
		
	}
	public void deposite() {
		System.out.println("Your fees is not deposited");
	}
	public void withdrawal() {
		System.out.println("You have withdrawn 100rs");
	}
	public void fundTransfer() {
		System.out.println("5000 transferd to Dharm");
	}
	public void payBill() {
	System.out.println("Please pay your electricity bill");
}}