package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Manager extends Employee {
	
	//Constructors
	public Manager(){
		super();

	}
	
	public Manager(String firstname, String surname,
			gender gender, String mailAddress,
			LocalDate birthdate, Department department, LocalTime arrivalTime,
			LocalTime departureTime, int cardNumber) {
		super(firstname, surname, gender, mailAddress, birthdate, department,
				arrivalTime, departureTime, cardNumber);
	}
	
	public String toString(){
		return getFirstname()+" "+getSurname()+" (Manager) "+getId();
	}

}
