package controler.department;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Company;
import model.Department;
import view.panel.department.PanelDepartmentAdd;
import view.panel.employee.PanelEmployeeAdd;

public class ActionDepartmentAdd implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent evt) {
		Company company = Company.getInstance();

		JButton composant = (JButton) evt.getSource();
		PanelDepartmentAdd panel= (PanelDepartmentAdd) composant.getParent();
		
		String name = panel.getTextName().getText();
		
		Department newDepartment= new Department(name);
		company.addDepartment(newDepartment);
		
	}

}
