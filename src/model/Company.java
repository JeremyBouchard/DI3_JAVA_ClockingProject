package model;

import java.util.Arrays;
import java.util.HashSet;

import view.panel.employee.PanelEmployeeDelete;


public class Company {//Singleton patern

	private static Company instance = new Company();
	
	//Atributes
	private String name;
	private HashSet<Employee> EmployeeList = new HashSet<Employee>();
	private HashSet<Manager> ManagerList = new HashSet<Manager>();
	private HashSet<Department> departmentList = new HashSet<Department>();
	private Boss boss = new Boss();

	//Constructors
	private Company(){}

	//Methods
	public static Company getInstance(){
		return instance;
	}
	
	public void addEmployee(Employee employee){
		EmployeeList.add(employee);
		Department department= employee.getDepartment();
		department.addEmployee(employee);
	}
	
	public void removeEmployee (Employee employee){
		EmployeeList.remove(employee);
		Department department= employee.getDepartment();
		department.removeEmployee(employee);
	}
	
	public void addManager(Manager manager){
		ManagerList.add(manager);
		ManagerDepartment.getInstance().addManager(manager);
		Department department= manager.getDepartment();
		department.setManager(manager);
	}
	
	public void addDepartment (Department department){
		departmentList.add(department);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashSet<Employee> getEmployeeList() {
		return EmployeeList;
	}

	public void setEmployeeList(HashSet<Employee> employeeList) {
		EmployeeList = employeeList;
	}

	public HashSet<Manager> getManagerList() {
		return ManagerList;
	}
	
	public void setManagerList(HashSet<Manager> managerList) {
		ManagerList = managerList;
	}
	
	public HashSet<Department> getDepartmentList() {
		return departmentList;
	}
	
	public void setDepartmentList(HashSet<Department> virtualDepartmentList) {
		this.departmentList = virtualDepartmentList;
	}
	
	public Boss getBoss() {
		return boss;
	}
	
	public void setBoss(Boss boss) {
		this.boss = boss;
	}

}
