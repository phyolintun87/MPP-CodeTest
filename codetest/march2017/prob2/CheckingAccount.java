package codetest.march2017.prob2;

public class CheckingAccount extends Account {

	private String accId;
	private double monthlyFee;
	private double balance;
	
	public CheckingAccount(String accId, double fee, double StartBalance) {
		 
		this.accId = accId;
		this.monthlyFee = fee;
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
		return balance-monthlyFee;
	}

}
