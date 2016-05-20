package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Manager extends Employee {
	//Atributes
	private Department managedDepartment;

	//Constructors
	public Manager(){
		super();
		managedDepartment=null;
	}
	
	public Manager(Department managedDepartment) {
		super();
		this.managedDepartment = managedDepartment;
	}
		
	public Manager(String firstname, String surname,
			gender gender, String mailAddress,
			LocalDate birthdate, Department department, LocalTime arrivalTime,
			LocalTime departureTime, int cardNumber, Department managedDepartment) {
		super(firstname, surname, gender, mailAddress, birthdate, department,
				arrivalTime, departureTime, cardNumber);
		this.managedDepartment = managedDepartment;
	}

	//Methods
	public Department getManagedDepartment() {
		return managedDepartment;
	}
	
	public void setManagedDepartment(Department managedDepartment) {
		this.managedDepartment = managedDepartment;
	}
}
