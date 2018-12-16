package codetest.april2017.prob2;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class Admin {
	
	List<Department> departments=new ArrayList<Department>();
	
	public Admin(Department[] depts) {
		
		 if(departments.size()==3 || depts.length+departments.size()>3)
			 throw new InvalidParameterException();
		
		 Stream.of(depts).forEach(x->{ if(!departments.contains(x))departments.add(x);});
	}
	//implement
	public String format(String name,String msg) {
		return String.format("%s: %s %s", name,msg,System.lineSeparator());
	}
	
	public String hourlyCompanyMessage() {
		return departments.stream().map(x->format(x.getName(),x.nextMessage())).collect(Collectors.joining(""));
	}
	
}
