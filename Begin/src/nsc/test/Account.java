package nsc.test;

public class Account {
	private String account ;
	private int balance ;
	private double interestRate ;
	
	public Account() {}
	
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}
	

	public double calculateInterest() {
		return this.balance * this.interestRate/100;
	}
	
	public void deposit(int money) {
		
		this.balance += money;
		
	}
	
	public void wirhdraw(int money) {
		
		this.balance -= money;
		
	}
	

}
