package view.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import view.GUI;

public class MenuDepartment extends JMenu {
	public MenuDepartment(){
		setText("Department");
		
		JMenuItem menuItemAdd = new JMenuItem("Add");
		menuItemAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI.show(GUI.DEPARTMENTADDPANEL);
			}
		});
		add(menuItemAdd);
		
		JMenuItem menuItemDelete = new JMenuItem("Delete");
		menuItemDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI.show(GUI.DEPARTMENTDELETEPANEL);
			}
		});
		add(menuItemDelete);
		
		JMenuItem menuItemUpdate = new JMenuItem("Update");
		menuItemUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI.show(GUI.DEPARTMENTUPDATEPANEL);
			}
		});
		add(menuItemUpdate);
	
	}

}
