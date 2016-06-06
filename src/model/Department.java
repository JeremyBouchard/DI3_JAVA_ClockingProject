package model;

import java.util.HashSet;

public class Department {

	//Attibutes
	private String name;
	private HashSet<Employee> employeeList = new HashSet<Employee>();
	private Manager manager=null;
	
	//Constructors
	public Department(){}
	public Department(String name){
		this.name=name;
	}


	//Methods
	public void addEmployee(Employee employee){
		employeeList.add(employee);
	}
	
	public void removeEmployee(Employee employee){
		employeeList.remove(employee);
	}
	
	public String toString(){
		return name;
	}
	
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
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
}
