package model;
import java.time.LocalDate;
import java.time.LocalTime;

public class Employee extends Person {
	//Atributes
	private static int instanceCount = 0;

	private int id;
	private LocalTime arrivalTime;
	private LocalTime departureTime;
	private int overtimeWork;
	private int cardNumber;
	private Department department;

	//Constructors
	public Employee(){
		setId();
	}

	/*public Employee(String firstname, String surname){
		setFirstname(firstname);
		setSurname(surname);
		setId();
	}

	public Employee(String firstname, String surname, String mailAddress){
		setFirstname(firstname);
		setSurname(surname);
		setMailAdress(mailAddress);
		setId();
	}

	public Employee(String firstname, String surname, LocalTime arrivalTime,  LocalTime departureTime){
		setFirstname(firstname);
		setSurname(surname);
		this.arrivalTime=arrivalTime;
		this.departureTime=departureTime;
		setId();
	}

	public Employee(String firstname, String surname, String mailAddress, LocalTime arrivalTime,  LocalTime departureTime){
		setFirstname(firstname);
		setSurname(surname);
		setMailAdress(mailAddress);
		this.arrivalTime=arrivalTime;
		this.departureTime=departureTime;
		setId();
	}*/
	public Employee(String firstname, String surname, gender gender, 
			String mailAddress, LocalDate birthdate, Department department, 
			LocalTime arrivalTime,LocalTime departureTime, int cardNumber){
		setFirstname(firstname);
		setSurname(surname);
		setGender(gender);
		setMailAdress(mailAddress);
		setBirthdate(birthdate);
		this.arrivalTime=arrivalTime;
		this.departureTime=departureTime;
		this.department=department;
		this.cardNumber=cardNumber;
		setId();
	}
	
	
	

	//Methods
	public final void setId(){
		id= instanceCount;
		instanceCount++;
	}

	public int getId() {
		return id;
	}
	public LocalTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	public int getExtraHours() {
		return overtimeWork;
	}
	public void setExtraHours(int overtimeWork) {
		this.overtimeWork = overtimeWork;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartement(Department department) {
		this.department = department;
	}

}
