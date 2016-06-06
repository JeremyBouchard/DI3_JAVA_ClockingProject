package model;

import java.util.HashSet;

public class ManagerDepartment {
	
	private static ManagerDepartment instance = new ManagerDepartment();
	
	private HashSet<Manager> ManagerList = new HashSet<Manager>();
	
	private ManagerDepartment(){}
	
	public static ManagerDepartment getInstance(){
		return instance;
	}
	
	public void addManager(Manager manager){
		ManagerList.add(manager);
	}
	
}
