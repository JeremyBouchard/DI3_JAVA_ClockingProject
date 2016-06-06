package controler.employee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.Company;
import model.Employee;
import view.panel.employee.PanelEmployeeAdd;
import view.panel.employee.PanelEmployeeUpdate;

public class ActionEmployeeUpdate implements ActionListener, ListSelectionListener {

	@Override
	public void valueChanged(ListSelectionEvent evt) {
		JList source =(JList) evt.getSource();
		PanelEmployeeUpdate panel= (PanelEmployeeUpdate) source.getParent();

		Employee employee = (Employee) panel.getEmployeeList().getSelectedValue();
		if (employee != null){
			panel.getTextFirstname().setText(employee.getFirstname());
			panel.getTextSurname().setText(employee.getSurname());
			panel.getFormattedTextBirthdate().setText(employee.getBirthdate().toString());
			panel.getTextMail().setText(employee.getMailAdress());
			panel.getComboGender().setSelectedItem(employee.getGender());
			panel.getComboDepartment().setSelectedItem(employee.getDepartment());
			panel.getFormattedTextArivalTime().setText(employee.getArrivalTime().toString());
			panel.getFormattedTextDepartureTime().setText(employee.getDepartureTime().toString());
			
		}else{
			panel.getTextFirstname().setText("");
			panel.getTextSurname().setText("");
			panel.getFormattedTextBirthdate().setText("");
			panel.getTextMail().setText("");
			panel.getComboGender().setSelectedItem("");
			panel.getComboDepartment().setSelectedItem("");
		}
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		Company company = Company.getInstance();
		
		JButton composant = (JButton) evt.getSource();
		PanelEmployeeUpdate panel= (PanelEmployeeUpdate) composant.getParent();
		
		Employee employee = (Employee) panel.getEmployeeList().getSelectedValue();

		employee.setFirstname(panel.getTextFirstname().getText());
		employee.setSurname(panel.getTextSurname().getText());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PanelEmployeeAdd.DATEFORMAT);
		String inputBirthdate = panel.getFormattedTextBirthdate().getText();
		LocalDate birthdate = null;
		try{
		birthdate = LocalDate.parse(inputBirthdate, formatter);
		}catch(DateTimeParseException e){
			panel.setInfo("Error : Incorect birthdate format",true);
			return;
		}
		employee.setBirthdate(birthdate);
		
	}

}
