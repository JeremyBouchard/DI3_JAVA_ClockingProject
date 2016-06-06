package controler.employee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JList;

import model.Company;
import model.Employee;
import view.panel.employee.PanelEmployeeDelete;

public class ActionEmployeeDelete implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent evt) {
		Company company = Company.getInstance();
		
		JButton composant = (JButton) evt.getSource();
		PanelEmployeeDelete panel= (PanelEmployeeDelete) composant.getParent();
		
		Employee employee = (Employee) panel.getEmployeeList().getSelectedValue();
		
		company.removeEmployee(employee);
		panel.getListModel().removeElement(employee);
	}

}
