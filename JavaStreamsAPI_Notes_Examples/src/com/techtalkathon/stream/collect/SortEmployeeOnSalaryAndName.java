package com.techtalkathon.stream.collect;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.techtalkathon.stream.model.Employee;

public class SortEmployeeOnSalaryAndName {
	public static void main(String[] args) {
		List<Employee> employeeList = getEmployeeList();
		
		List<Employee> descendingOrderList = employeeList.stream().sorted(
				
				Comparator.comparing(Employee::getSalary).reversed()
				.thenComparing(Employee::getEmployeeName)
				
				).toList();
		
		System.out.println(descendingOrderList);
		
		/* Console:
		 *
		 * [Employee [departmentId=1, employeeName=Surendra, employeeId=1002, salary=150000.0], Employee [departmentId=4, employeeName=Allu, employeeId=1001, salary=100000.0], Employee [departmentId=5, employeeName=Bablu, employeeId=1001, salary=100000.0], Employee [departmentId=1, employeeName=Babu, employeeId=1001, salary=100000.0], Employee [departmentId=2, employeeName=Suri, employeeId=1004, salary=92000.0], Employee [departmentId=2, employeeName=Suresh, employeeId=1003, salary=90000.0], Employee [departmentId=3, employeeName=Kusalu, employeeId=1005, salary=35000.0]]

		 */
		
		List<Employee> ascendingOrderList = employeeList.stream().sorted(
				
				Comparator.comparing(Employee::getSalary)
				.thenComparing(Employee::getEmployeeName)
				
				).toList();
		
		System.out.println(ascendingOrderList);
		
		double average = employeeList.stream()
				.mapToDouble(Employee::getSalary)
				.average()
				.orElse(0);

		System.out.println(average);
		
		/* Console:
		 * 
		 * [Employee [departmentId=3, employeeName=Kusalu, employeeId=1005, salary=35000.0], Employee [departmentId=2, employeeName=Suresh, employeeId=1003, salary=90000.0], Employee [departmentId=2, employeeName=Suri, employeeId=1004, salary=92000.0], Employee [departmentId=4, employeeName=Allu, employeeId=1001, salary=100000.0], Employee [departmentId=5, employeeName=Bablu, employeeId=1001, salary=100000.0], Employee [departmentId=1, employeeName=Babu, employeeId=1001, salary=100000.0], Employee [departmentId=1, employeeName=Surendra, employeeId=1002, salary=150000.0]]

		 */
	}
	
	
	public static List<Employee> getEmployeeList() {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Babu", "1001", 100000));
		empList.add(new Employee(1, "Surendra", "1002", 150000));
		empList.add(new Employee(2, "Suresh", "1003", 90000));
		empList.add(new Employee(2, "Suri", "1004", 92000));
		empList.add(new Employee(3, "Kusalu", "1005", 35000));
		empList.add(new Employee(5, "Bablu", "1001", 100000));
		empList.add(new Employee(4, "Allu", "1001", 100000));

		return empList;

	}

}
