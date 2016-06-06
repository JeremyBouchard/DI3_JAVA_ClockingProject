package view.panel.employee;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Iterator;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;

import model.Company;
import model.Employee;
import model.Manager;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import controler.employee.ActionEmployeeUpdate;
import model.Person.gender;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class PanelEmployeeUpdate extends JPanel {
	private JTextField textFirstname;
	private JTextField textSurname;
	private JTextField textMail;
	private JFormattedTextField formattedTextBirthdate;
	private JList employeeList;
	private JComboBox comboGender;
	private JComboBox comboDepartment;
	
	private static DefaultListModel listModel= new DefaultListModel();
	private JCheckBox chckManager;
	private JLabel lblInfo;
	private JTextField textDepartureTime;
	private JFormattedTextField formattedTextArivalTime;
	private JFormattedTextField formattedTextDepartureTime;
	
	public PanelEmployeeUpdate() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[] {0, 0, 0, 30, 30, 30, 0, 30, 0, 0, 30, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblInfoList = new JLabel("Select employee");
		GridBagConstraints gbc_lblInfoList = new GridBagConstraints();
		gbc_lblInfoList.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfoList.gridx = 0;
		gbc_lblInfoList.gridy = 0;
		add(lblInfoList, gbc_lblInfoList);
		
		JLabel lblInfoPersonal = new JLabel("Personal details :");
		GridBagConstraints gbc_lblInfoPersonal = new GridBagConstraints();
		gbc_lblInfoPersonal.anchor = GridBagConstraints.WEST;
		gbc_lblInfoPersonal.gridwidth = 2;
		gbc_lblInfoPersonal.insets = new Insets(0, 0, 5, 0);
		gbc_lblInfoPersonal.gridx = 1;
		gbc_lblInfoPersonal.gridy = 0;
		add(lblInfoPersonal, gbc_lblInfoPersonal);
		
		employeeList = new JList(listModel);
		employeeList.addListSelectionListener(new ActionEmployeeUpdate());
		employeeList.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		GridBagConstraints gbc_employeeList = new GridBagConstraints();
		gbc_employeeList.gridheight = 10;
		gbc_employeeList.insets = new Insets(0, 0, 5, 5);
		gbc_employeeList.fill = GridBagConstraints.BOTH;
		gbc_employeeList.gridx = 0;
		gbc_employeeList.gridy = 1;
		add(employeeList, gbc_employeeList);
		
		JLabel lblGender = new JLabel("Gender :");
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.anchor = GridBagConstraints.EAST;
		gbc_lblGender.insets = new Insets(0, 0, 5, 5);
		gbc_lblGender.gridx = 1;
		gbc_lblGender.gridy = 1;
		add(lblGender, gbc_lblGender);
		
		comboGender = new JComboBox();
		comboGender.setModel(new DefaultComboBoxModel(gender.values()));
		comboGender.setMaximumRowCount(3);
		GridBagConstraints gbc_comboGender = new GridBagConstraints();
		gbc_comboGender.insets = new Insets(0, 0, 5, 0);
		gbc_comboGender.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboGender.gridx = 2;
		gbc_comboGender.gridy = 1;
		add(comboGender, gbc_comboGender);
		
		JLabel lblFirstname = new JLabel("Firstname :");
		GridBagConstraints gbc_lblFirstname = new GridBagConstraints();
		gbc_lblFirstname.anchor = GridBagConstraints.EAST;
		gbc_lblFirstname.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstname.gridx = 1;
		gbc_lblFirstname.gridy = 2;
		add(lblFirstname, gbc_lblFirstname);
		
		textFirstname = new JTextField();
		textFirstname.setColumns(10);
		GridBagConstraints gbc_textFirstname = new GridBagConstraints();
		gbc_textFirstname.insets = new Insets(0, 0, 5, 0);
		gbc_textFirstname.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFirstname.gridx = 2;
		gbc_textFirstname.gridy = 2;
		add(textFirstname, gbc_textFirstname);
		
		JLabel lblSurname = new JLabel("Surname :");
		GridBagConstraints gbc_lblSurname = new GridBagConstraints();
		gbc_lblSurname.anchor = GridBagConstraints.EAST;
		gbc_lblSurname.insets = new Insets(0, 0, 5, 5);
		gbc_lblSurname.gridx = 1;
		gbc_lblSurname.gridy = 3;
		add(lblSurname, gbc_lblSurname);
		
		textSurname = new JTextField();
		textSurname.setColumns(10);
		GridBagConstraints gbc_textSurname = new GridBagConstraints();
		gbc_textSurname.insets = new Insets(0, 0, 5, 0);
		gbc_textSurname.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSurname.gridx = 2;
		gbc_textSurname.gridy = 3;
		add(textSurname, gbc_textSurname);
		
		JLabel lblMail = new JLabel("MailAdress :");
		GridBagConstraints gbc_lblMail = new GridBagConstraints();
		gbc_lblMail.anchor = GridBagConstraints.EAST;
		gbc_lblMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblMail.gridx = 1;
		gbc_lblMail.gridy = 4;
		add(lblMail, gbc_lblMail);
		
		textMail = new JTextField();
		textMail.setColumns(10);
		GridBagConstraints gbc_textMail = new GridBagConstraints();
		gbc_textMail.insets = new Insets(0, 0, 5, 0);
		gbc_textMail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textMail.gridx = 2;
		gbc_textMail.gridy = 4;
		add(textMail, gbc_textMail);
		
		JLabel lblDepartment = new JLabel("Birthdate :");
		GridBagConstraints gbc_lblDepartment = new GridBagConstraints();
		gbc_lblDepartment.anchor = GridBagConstraints.EAST;
		gbc_lblDepartment.insets = new Insets(0, 0, 5, 5);
		gbc_lblDepartment.gridx = 1;
		gbc_lblDepartment.gridy = 5;
		add(lblDepartment, gbc_lblDepartment);
		
		DateTimeFormatter DateFormatter = DateTimeFormatter.ofPattern(PanelEmployeeAdd.DATEFORMAT);
		formattedTextBirthdate = new JFormattedTextField(DateFormatter);
		formattedTextBirthdate.setText("");

		formattedTextBirthdate.setName("");
		formattedTextBirthdate.setColumns(10);
		GridBagConstraints gbc_textBirthdate = new GridBagConstraints();
		gbc_textBirthdate.insets = new Insets(0, 0, 5, 0);
		gbc_textBirthdate.fill = GridBagConstraints.HORIZONTAL;
		gbc_textBirthdate.gridx = 2;
		gbc_textBirthdate.gridy = 5;
		add(formattedTextBirthdate, gbc_textBirthdate);
		
		JLabel lblInfoEmployment = new JLabel("Employment infos :");
		GridBagConstraints gbc_lblInfoEmployment = new GridBagConstraints();
		gbc_lblInfoEmployment.anchor = GridBagConstraints.WEST;
		gbc_lblInfoEmployment.gridwidth = 2;
		gbc_lblInfoEmployment.insets = new Insets(0, 0, 5, 0);
		gbc_lblInfoEmployment.gridx = 1;
		gbc_lblInfoEmployment.gridy = 6;
		add(lblInfoEmployment, gbc_lblInfoEmployment);
		
		JLabel label_5 = new JLabel("Department");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 7;
		add(label_5, gbc_label_5);
		
		Company company=Company.getInstance();
		Object[] departmentList=company.getDepartmentList().toArray();
		comboDepartment = new JComboBox(departmentList);
		
		GridBagConstraints gbc_comboDepartment = new GridBagConstraints();
		gbc_comboDepartment.insets = new Insets(0, 0, 5, 0);
		gbc_comboDepartment.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboDepartment.gridx = 2;
		gbc_comboDepartment.gridy = 7;
		add(comboDepartment, gbc_comboDepartment);
		
		JLabel lblArivalTime = new JLabel("Arival Time :");
		GridBagConstraints gbc_lblArivalTime = new GridBagConstraints();
		gbc_lblArivalTime.anchor = GridBagConstraints.EAST;
		gbc_lblArivalTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblArivalTime.gridx = 1;
		gbc_lblArivalTime.gridy = 8;
		add(lblArivalTime, gbc_lblArivalTime);
		
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(PanelEmployeeAdd.TIMEFORMAT);
		formattedTextArivalTime = new JFormattedTextField(timeFormatter);
		formattedTextArivalTime.setText("");

		GridBagConstraints gbc_formattedTextArivalTime = new GridBagConstraints();
		gbc_formattedTextArivalTime.insets = new Insets(0, 0, 5, 0);
		gbc_formattedTextArivalTime.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextArivalTime.gridx = 2;
		gbc_formattedTextArivalTime.gridy = 8;
		add(formattedTextArivalTime, gbc_formattedTextArivalTime);

		
		JLabel lblDepartureTime = new JLabel("Departure Time");
		GridBagConstraints gbc_lblDepartureTime = new GridBagConstraints();
		gbc_lblDepartureTime.anchor = GridBagConstraints.EAST;
		gbc_lblDepartureTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblDepartureTime.gridx = 1;
		gbc_lblDepartureTime.gridy = 9;
		add(lblDepartureTime, gbc_lblDepartureTime);
		
		formattedTextDepartureTime = new JFormattedTextField(timeFormatter);
		formattedTextDepartureTime.setText("");
		GridBagConstraints gbc_formattedTextDepartureTime = new GridBagConstraints();
		gbc_formattedTextDepartureTime.insets = new Insets(0, 0, 5, 0);
		gbc_formattedTextDepartureTime.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextDepartureTime.gridx = 2;
		gbc_formattedTextDepartureTime.gridy = 9;
		add(formattedTextDepartureTime, gbc_formattedTextDepartureTime);

		
		JLabel lblManager = new JLabel("Manager :");
		GridBagConstraints gbc_lblManager = new GridBagConstraints();
		gbc_lblManager.anchor = GridBagConstraints.EAST;
		gbc_lblManager.insets = new Insets(0, 0, 5, 5);
		gbc_lblManager.gridx = 1;
		gbc_lblManager.gridy = 10;
		add(lblManager, gbc_lblManager);
		
		chckManager = new JCheckBox("");
		GridBagConstraints gbc_chckManager = new GridBagConstraints();
		gbc_chckManager.insets = new Insets(0, 0, 5, 0);
		gbc_chckManager.gridx = 2;
		gbc_chckManager.gridy = 10;
		add(chckManager, gbc_chckManager);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionEmployeeUpdate());
		
		lblInfo = new JLabel("");
		GridBagConstraints gbc_lblInfo = new GridBagConstraints();
		gbc_lblInfo.insets = new Insets(0, 0, 5, 0);
		gbc_lblInfo.gridx = 2;
		gbc_lblInfo.gridy = 11;
		add(lblInfo, gbc_lblInfo);
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.gridx = 2;
		gbc_btnSubmit.gridy = 12;
		add(btnSubmit, gbc_btnSubmit);
	}
	
	public JTextField getTextDepartureTime() {
		return textDepartureTime;
	}

	public JFormattedTextField getFormattedTextArivalTime() {
		return formattedTextArivalTime;
	}

	public JFormattedTextField getFormattedTextDepartureTime() {
		return formattedTextDepartureTime;
	}

	public JCheckBox getChckManager() {
		return chckManager;
	}

	public static void updateEmployeeList() {
		Company company=Company.getInstance();
		Iterator<Employee> employeeIterator= company.getEmployeeList().iterator();
		Iterator<Manager> mangerIterator = company.getManagerList().iterator();
		listModel.clear();
		while (employeeIterator.hasNext()){
			listModel.addElement(employeeIterator.next());
		}
		mangerIterator= company.getManagerList().iterator();
		while (mangerIterator.hasNext()){
			listModel.addElement(mangerIterator.next());
		}
	}
	
	public void setInfo(String info, boolean error) {
		lblInfo.setText(info);
		if (error){
			lblInfo.setForeground(Color.RED);
		}else{
			lblInfo.setForeground(Color.BLACK);
		}
	}
	
	public JTextField getTextFirstname() {
		return textFirstname;
	}

	public JTextField getTextSurname() {
		return textSurname;
	}

	public JTextField getTextMail() {
		return textMail;
	}

	public JTextField getFormattedTextBirthdate() {
		return formattedTextBirthdate;
	}

	public JList getEmployeeList() {
		return employeeList;
	}

	public JComboBox getComboGender() {
		return comboGender;
	}

	public JComboBox getComboDepartment() {
		return comboDepartment;
	}
}
