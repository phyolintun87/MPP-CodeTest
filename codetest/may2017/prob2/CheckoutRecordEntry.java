package codetest.may2017.prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	
	private LocalDate checkOutDate;
	private LocalDate dueDate;
	private LendingItem lendingItem;
	private ItemType lendingItemType;
		
	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}
	public LocalDate getdueDate() {
		return dueDate;
	}
		
	public LendingItem getLendingItem() {
		return lendingItem;
	}
	public ItemType getLendingItemType() {
		return lendingItemType;
	}
	
	public CheckoutRecordEntry(LendingItem item,LocalDate chDate,LocalDate dueDate,ItemType type) {
		this.lendingItem=item;
		this.checkOutDate=chDate;
		this.dueDate=dueDate;
		this.lendingItemType=type;
	}
}
