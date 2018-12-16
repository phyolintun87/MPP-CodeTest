package codetest.april2017.prob1;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.*;;

public class EmployeeAdmin {

	// returns a list of social security numbers, sorted in ascending order,
	// that belong to an Employee in the input table but that are not on the
	// socSecNums input list
	public static List<String> prepareSsnReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//implement
		
		return table.entrySet().stream().filter(x->!socSecNums.contains(x.getValue().getSsn())).map(x->x.getValue().getSsn()).sorted().collect(Collectors.toList());
				
	}			
		//return a list of Employees whose social security number is on the input list socSecNums
				//and whose salary is >80000; the return list does not need to be sorted  
	public static List<Employee> prepareEmpReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//implement
		
		return table.entrySet().stream().filter(x->x.getValue().getSalary()>80000).filter(x->socSecNums.contains(x.getValue().getSsn())).map(x->x.getValue()).collect(Collectors.toList());
	}
}