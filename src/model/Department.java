package model;

import java.util.HashSet;

public class Department extends VirtualDepartment{

	//Constructors
	public Department(){}
	public Department(String name, HashSet<Employee> employeeList, Manager manager){
		setName(name);
		setEmployeeList(employeeList);
		setManager(manager);
	}
}
