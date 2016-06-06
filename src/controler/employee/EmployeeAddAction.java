package controler.employee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JButton;

import model.Company;
import model.Department;
import model.Employee;
import model.Manager;
import model.Person;
import view.panel.employee.PanelEmployeeAdd;

public class EmployeeAddAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent evt) {
		Company company = Company.getInstance();
		
		JButton composant = (JButton) evt.getSource();
		PanelEmployeeAdd panel= (PanelEmployeeAdd) composant.getParent();
		
		Person.gender gender = (Person.gender ) panel.getCbbGender().getSelectedItem();
		String firstname = panel.getTxtFirstname().getText();
		String surname = panel.getTxtSurname().getText();
		String mail = panel.getTxtMail().getText();
		Department department = (Department) panel.getCbbDepartment().getSelectedItem();
		boolean manager = panel.getChckManager().isSelected();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PanelEmployeeAdd.DATEFORMAT);
		String inputBirthdate = panel.getFormattedTxtBirthdate().getText();
		LocalDate birthdate = null;
		try{
		birthdate = LocalDate.parse(inputBirthdate, formatter);
		}catch(DateTimeParseException e){
			panel.setInfo("Error : Incorect birthdate format",true);
			return;
		}
		
		formatter = DateTimeFormatter.ofPattern(PanelEmployeeAdd.TIMEFORMAT);
		String inputArivalTime = panel.getFormattedTextArivalTime().getText();
		String inputDepartureTime = panel.getFormattedTextDepartureTime().getText();
		LocalTime arrivalTime=null, departureTime=null;
		try{
		arrivalTime = LocalTime.parse(inputArivalTime, formatter);
		departureTime = LocalTime.parse(inputDepartureTime, formatter);
		}catch (DateTimeParseException e){
			panel.setInfo("Error : Incorect time format",true);
			return;
		}
		
		if (firstname.equals("") || surname.equals("") || mail.equals("") || department==null){
			panel.setInfo("Fill corectly every filed",true);
		}else{
			if (manager){
				Manager newManager = new Manager(firstname, surname, gender, mail, birthdate, department, arrivalTime, departureTime, 00000);
				company.addManager(newManager);
				panel.setInfo("Manager successfully added",false);
			}else{
				Employee newEmployee = new Employee(firstname, surname, gender, mail, birthdate, department, arrivalTime, departureTime, 00000);
				company.addEmployee(newEmployee);
				panel.setInfo("Employee successfully added",false);
			}		
		
		}
		System.out.println(company.getManagerList().toString());
		System.out.println(company.getEmployeeList().toString());
		
	}

}
