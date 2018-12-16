package codetest.may2017.prob2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		//List<String> phoneNums = new ArrayList<>();
		//implement
	 
		return Stream.of(members).filter(e->e.getCheckoutRecord().getCheckoutEntryList().stream().filter(x->x.getLendingItem().equals(item)).findAny().isPresent()).map(e->e.getPhone()).sorted().collect(Collectors.toList()) ;
	}
}
