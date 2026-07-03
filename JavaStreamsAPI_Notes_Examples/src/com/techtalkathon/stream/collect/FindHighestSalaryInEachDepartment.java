package com.techtalkathon.stream.collect;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.techtalkathon.stream.model.Employee;

public class FindHighestSalaryInEachDepartment {

	public static void main(String[] args) {

		List<Employee> employeeList = getEmployeeList();

		Map<Integer, Optional<Employee>> collect = employeeList.stream().collect(Collectors
				.groupingBy(Employee::getDepartmentId, 
						Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

		System.out.println(collect); // returns the Optional
		
		//Console
		//{1=Optional[Employee [departmentId=1, employeeName=Surendra, employeeId=1002, salary=150000.0]], 2=Optional[Employee [departmentId=2, employeeName=Suri, employeeId=1004, salary=92000.0]], 3=Optional[Employee [departmentId=3, employeeName=Kusalu, employeeId=1005, salary=35000.0]]}


		Map<Integer, Employee> collect1 = employeeList.stream().collect(Collectors
				.groupingBy(Employee::getDepartmentId, 
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));

		System.out.println(collect1); // Employee Object . Here CollectingAndThen used to transform our output

		//Console:
        //{1=Employee [departmentId=1, employeeName=Surendra, employeeId=1002, salary=150000.0], 2=Employee [departmentId=2, employeeName=Suri, employeeId=1004, salary=92000.0], 3=Employee [departmentId=3, employeeName=Kusalu, employeeId=1005, salary=35000.0]}

	}

	public static List<Employee> getEmployeeList() {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Babu", "1001", 100000));
		empList.add(new Employee(1, "Surendra", "1002", 150000));
		empList.add(new Employee(2, "Suresh", "1003", 90000));
		empList.add(new Employee(2, "Suri", "1004", 92000));
		empList.add(new Employee(3, "Kusalu", "1005", 35000));
		return empList;

	}

}
