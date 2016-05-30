package model;

import java.time.LocalDate;

public abstract class Person {
	
	public enum gender{
		Male,
		Female;
	}
	
	//Attributes
	private String firstname;
	private String surname;
	private gender gender;
	private String mailAdress;
	private LocalDate birthdate;

	//Methods
	public String getFirstname() {
		return firstname;
	}
	public gender getGender() {
		return gender;
	}
	public void setGender(gender gender) {
		this.gender = gender;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMailAdress() {
		return mailAdress;
	}
	public void setMailAdress(String mailAdress) {
		this.mailAdress = mailAdress;
	}
}
