package model;

import java.util.HashSet;

public abstract class VirtualDepartment {

	//Attibutes
	private String name;
	private HashSet<Employee> employeeList;
	private Manager Manager;


	//Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashSet<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(HashSet<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public Manager getManager() {
		return Manager;
	}
	public void setManager(Manager manager) {
		Manager = manager;
	}
	
}
