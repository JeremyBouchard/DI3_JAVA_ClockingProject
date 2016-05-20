package model;

import java.util.Arrays;
import java.util.HashSet;


public class Company {

	//Atributes
	private String name;
	private HashSet<Person> personList;
	private HashSet<VirtualDepartment> virtualDepartmentList;
	private Boss boss;

	//Constructors
	public Company(){}
	public Company(String name, Boss boss){
		this.name=name;
		this.boss=boss;
	}

	public Company(String name, HashSet<Person> personList, HashSet<VirtualDepartment> virtualDepartmentList, Boss boss){
		this.name=name;
		this.boss=boss;
		this.personList=personList;
		this.virtualDepartmentList=virtualDepartmentList;
	}

	public Company(String name, Person[] arrayPersonList, VirtualDepartment[] arrayVirtualDepartmentList, Boss boss ){
		this.name=name;
		this.boss=boss;
		
		HashSet<Person> personList = new HashSet<Person>(Arrays.asList(arrayPersonList));
		this.personList=personList;

		HashSet<VirtualDepartment> virtualDepartmentList = new HashSet<VirtualDepartment>(Arrays.asList(arrayVirtualDepartmentList));
		this.virtualDepartmentList=virtualDepartmentList;
	}

	//Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashSet<Person> getPersonList() {
		return personList;
	}
	public void setPersonList(HashSet<Person> personList) {
		this.personList = personList;
	}
	public HashSet<VirtualDepartment> getVirtualDepartmentList() {
		return virtualDepartmentList;
	}
	public void setVirtualDepartmentList(HashSet<VirtualDepartment> virtualDepartmentList) {
		this.virtualDepartmentList = virtualDepartmentList;
	}
	public Boss getBoss() {
		return boss;
	}
	public void setBoss(Boss boss) {
		this.boss = boss;
	}

}
