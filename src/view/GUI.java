package view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import view.menu.*;
import view.panel.employee.*;
import view.panel.department.*;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Component;

public class GUI extends JFrame{
	public static JPanel cardPanel = new JPanel(new CardLayout());
	final public static String EMPLOYEEADDPANEL = "EMPLOYEEADD";
	final public static String EMPLOYEEDELETEPANEL = "EMPLOYEEDELETE";
	final public static String EMPLOYEEUPDATEPANEL = "EMPLOYEEUPDATE";
	final public static String DEPARTMENTADDPANEL = "DEPARTMENTADD";
	final public static String DEPARTMENTDELETEPANEL = "DEPARTMENTDELETE";
	final public static String DEPARTMENTUPDATEPANEL = "DEPARTMENTUPDATE";

	public GUI() {

		setVisible(true);
		setTitle("Company Managment");
		setContentPane(cardPanel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuEmployee = new MenuEmployee();
		JMenu menuDepartment = new MenuDepartment();
		menuBar.add(menuEmployee);
		menuBar.add(menuDepartment);

		JPanel panelEmployeeAdd = new PanelEmployeeAdd();
		JPanel panelEmployeeDelete = new PanelEmployeeDelete();
		JPanel panelEmployeeUpdate = new PanelEmployeeUpdate();
		
		cardPanel.add(panelEmployeeAdd, EMPLOYEEADDPANEL);
		cardPanel.add(panelEmployeeDelete, EMPLOYEEDELETEPANEL);
		cardPanel.add(panelEmployeeUpdate, EMPLOYEEUPDATEPANEL);
		
		JPanel panelDepartmentAdd = new PanelDepartmentAdd();
		JPanel panelDepartmentDelete = new PanelDepartmentDelete();
		JPanel panelDepartmentUpdate = new PanelDepartmentUpdate();
		
		cardPanel.add(panelDepartmentAdd, DEPARTMENTADDPANEL);
		cardPanel.add(panelDepartmentDelete, DEPARTMENTDELETEPANEL);
		cardPanel.add(panelDepartmentUpdate, DEPARTMENTUPDATEPANEL);
		
		setVisible(true);
	}
	
	public static void show(String panelName){
		CardLayout cl = (CardLayout)(cardPanel.getLayout());
		cl.show(cardPanel,panelName);
	}

}



