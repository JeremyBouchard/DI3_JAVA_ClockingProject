package view.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import view.GUI;
import view.panel.employee.PanelEmployeeDelete;
import view.panel.employee.PanelEmployeeUpdate;


public class MenuEmployee extends JMenu {

	
	public MenuEmployee() {
		setText("Employee/Manager");
		
		JMenuItem menuItemAdd = new JMenuItem("add");
		menuItemAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI.show(GUI.EMPLOYEEADDPANEL);
			}
		});
		add(menuItemAdd);
		
		JMenuItem menuItemDelete = new JMenuItem("Delete");
		menuItemDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI.show(GUI.EMPLOYEEDELETEPANEL);
				PanelEmployeeDelete.updateEmployeeList();
			}
		});
		add(menuItemDelete);
		
		JMenuItem menuItemUpdate = new JMenuItem("Update");
		menuItemUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI.show(GUI.EMPLOYEEUPDATEPANEL);
				PanelEmployeeUpdate.updateEmployeeList();
			}
		});
		add(menuItemUpdate);
	}

}
