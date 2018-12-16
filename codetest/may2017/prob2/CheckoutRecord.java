package codetest.may2017.prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	 
	private List<CheckoutRecordEntry> coutEntry=new ArrayList<CheckoutRecordEntry>();
	
	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return coutEntry;
	}
	
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		coutEntry.add(entry);
	}
}
