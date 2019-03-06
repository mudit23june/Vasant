package com.capgemini;

public class Employee {

	int empNumber;
	String name;
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int empNumber, String name) {
		super();
		this.empNumber = empNumber;
		this.name = name;
	}
	public Employee() {
		super();
	}
	
}
