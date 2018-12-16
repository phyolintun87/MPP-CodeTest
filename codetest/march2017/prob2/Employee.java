package codetest.march2017.prob2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class Employee {
	
	private String name;	
	
	List<Account> accounts=new ArrayList<Account>();

	public Employee(String name) {
		
		this.name = name;
	}
	
	public void addAccount(Account acc) {
		accounts.add(acc);
	}
	
	public String getName() {
		return name;
	}


	public double computeUpdatedBalanceSum() {
		//implement 
		return accounts.stream().mapToDouble(x->x.computeUpdateBalance()).sum();
	}
}
