package view.panel.employee;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

import controler.employee.ActionEmployeeDelete;

import java.util.*;

import model.Company;
import model.Employee;

import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class PanelEmployeeDelete extends JPanel {
	private JList employeeList;
	private static DefaultListModel listModel= new DefaultListModel();
	
	public PanelEmployeeDelete() {
		setBorder(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{170, 0};
		gridBagLayout.rowHeights = new int[]{16, 174, 25, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblInstruction = new JLabel("Select the employee to delete");
		GridBagConstraints gbc_lblInstruction = new GridBagConstraints();
		gbc_lblInstruction.insets = new Insets(0, 0, 5, 0);
		gbc_lblInstruction.gridx = 0;
		gbc_lblInstruction.gridy = 0;
		add(lblInstruction, gbc_lblInstruction);
		
		JButton btnNSubmit = new JButton("Submit");
		btnNSubmit.addActionListener(new ActionEmployeeDelete());
		GridBagConstraints gbc_btnNSubmit = new GridBagConstraints();
		gbc_btnNSubmit.anchor = GridBagConstraints.EAST;
		gbc_btnNSubmit.gridx = 0;
		gbc_btnNSubmit.gridy = 2;
		add(btnNSubmit, gbc_btnNSubmit);
			
		employeeList = new JList(listModel);
		employeeList.setVisibleRowCount(5);
		employeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_employyeList = new GridBagConstraints();
		gbc_employyeList.fill = GridBagConstraints.BOTH;
		gbc_employyeList.insets = new Insets(5, 15, 5, 15);
		gbc_employyeList.gridx = 0;
		gbc_employyeList.gridy = 1;
		add(employeeList, gbc_employyeList);
		
	}
	
	public static void updateEmployeeList(){
		Company company=Company.getInstance();
		Iterator<Employee> iterator= company.getEmployeeList().iterator();
		listModel.clear();
		while (iterator.hasNext()){
			listModel.addElement(iterator.next());
		}
	}

	public JList getEmployeeList() {
		return employeeList;
	}
	public DefaultListModel getListModel() {
		return listModel;
	}

}
