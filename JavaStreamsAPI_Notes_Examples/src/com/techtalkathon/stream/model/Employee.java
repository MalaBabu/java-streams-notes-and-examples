package com.techtalkathon.stream.model;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int departmentId;
	private String employeeName;
	private String employeeId;
	private double salary;

	
	
	
	
	public Employee(int departmentId, String employeeName, String employeeId, double salary) {
		super();
		this.departmentId = departmentId;
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [departmentId=" + departmentId + ", employeeName=" + employeeName + ", employeeId="
				+ employeeId + ", salary=" + salary + "]";
	}

}
