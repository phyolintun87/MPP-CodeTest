package codetest.march2017.prob2;

public class SavingsAccount extends Account {

	private String accId;
	private double interestRate;
	private double balance;	
	 
	public SavingsAccount(String accId, double interestRate, double StartBalance) {
		super();
		this.accId = accId;
		this.interestRate = interestRate;
		this.balance = StartBalance;
	}

	String getAccountID() {
		// TODO Auto-generated method stub
		return accId;
	}

	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	double computeUpdateBalance() {
		// TODO Auto-generated method stub
		return balance+(interestRate*balance);
	}

}
