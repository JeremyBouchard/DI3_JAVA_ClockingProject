package employee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;

import model.Department;
import model.Employee;
import model.Person;
import view.panel.employee.PanelEmployeeAdd;

public class EmployeeAddAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent evt) {
		JButton composant = (JButton) evt.getSource();
		PanelEmployeeAdd panel= (PanelEmployeeAdd) composant.getParent();
		
		Person.gender gender = (Person.gender ) panel.getCbbGender().getSelectedItem();
		String firstname = panel.getTxtFirstname().getText();
		String surname = panel.getTxtSurname().getText();
		String mail = panel.getTxtMail().getText();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PanelEmployeeAdd.DATEFORMAT);
		String inputBirthdate = panel.getFormattedTxtBirthdate().getText();
		LocalDate birthdate = LocalDate.parse(inputBirthdate, formatter);
		
		Department department = (Department) panel.getCbbDepartment().getSelectedItem();
		
		formatter = DateTimeFormatter.ofPattern(PanelEmployeeAdd.TIMEFORMAT);
		String inputArivalTime = panel.getFormattedTextArivalTime().getText();
		LocalTime arrivalTime = LocalTime.parse(inputArivalTime, formatter);
		
		String inputDepartureTime = panel.getFormattedTextDepartureTime().getText();
		LocalTime departureTime = LocalTime.parse(inputDepartureTime, formatter);
		
		if (firstname.equals("") || surname.equals("") || mail.equals("")){
			panel.setError("Fill corectly every filed");
		}
		System.out.println(firstname+ surname+ gender+ mail+ birthdate+ department+ arrivalTime+ departureTime);
		Employee newEmployee = new Employee(firstname, surname, gender, mail, birthdate, department, arrivalTime, departureTime, 00000);
	}

}
