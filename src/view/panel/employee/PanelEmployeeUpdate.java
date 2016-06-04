package view.panel.employee;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class PanelEmployeeUpdate extends JPanel {
	private JTextField textFirstname;
	private JTextField textSurname;
	private JTextField textMail;
	private JTextField textBirthdate;
	public PanelEmployeeUpdate() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[] {0, 0, 0, 30, 30, 30, 30, 30, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblSelectEmployeeTo = new JLabel("Select employee");
		GridBagConstraints gbc_lblSelectEmployeeTo = new GridBagConstraints();
		gbc_lblSelectEmployeeTo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectEmployeeTo.gridx = 0;
		gbc_lblSelectEmployeeTo.gridy = 0;
		add(lblSelectEmployeeTo, gbc_lblSelectEmployeeTo);
		
		JLabel lblUpdateInfos = new JLabel("Update infos");
		GridBagConstraints gbc_lblUpdateInfos = new GridBagConstraints();
		gbc_lblUpdateInfos.gridwidth = 2;
		gbc_lblUpdateInfos.insets = new Insets(0, 0, 5, 5);
		gbc_lblUpdateInfos.gridx = 1;
		gbc_lblUpdateInfos.gridy = 0;
		add(lblUpdateInfos, gbc_lblUpdateInfos);
		
		JList listEmployee = new JList();
		GridBagConstraints gbc_listEmployee = new GridBagConstraints();
		gbc_listEmployee.gridheight = 6;
		gbc_listEmployee.insets = new Insets(0, 0, 5, 5);
		gbc_listEmployee.fill = GridBagConstraints.BOTH;
		gbc_listEmployee.gridx = 0;
		gbc_listEmployee.gridy = 1;
		add(listEmployee, gbc_listEmployee);
		
		JLabel lblGender = new JLabel("Gender :");
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.anchor = GridBagConstraints.EAST;
		gbc_lblGender.insets = new Insets(0, 0, 5, 5);
		gbc_lblGender.gridx = 1;
		gbc_lblGender.gridy = 1;
		add(lblGender, gbc_lblGender);
		
		JComboBox comboGender = new JComboBox();
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
		
		textBirthdate = new JTextField();
		textBirthdate.setName("");
		textBirthdate.setColumns(10);
		GridBagConstraints gbc_textBirthdate = new GridBagConstraints();
		gbc_textBirthdate.insets = new Insets(0, 0, 5, 0);
		gbc_textBirthdate.fill = GridBagConstraints.HORIZONTAL;
		gbc_textBirthdate.gridx = 2;
		gbc_textBirthdate.gridy = 5;
		add(textBirthdate, gbc_textBirthdate);
		
		JLabel label_5 = new JLabel("Department");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 6;
		add(label_5, gbc_label_5);
		
		JComboBox comboDepartment = new JComboBox();
		GridBagConstraints gbc_comboDepartment = new GridBagConstraints();
		gbc_comboDepartment.insets = new Insets(0, 0, 5, 0);
		gbc_comboDepartment.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboDepartment.gridx = 2;
		gbc_comboDepartment.gridy = 6;
		add(comboDepartment, gbc_comboDepartment);
		
		JButton btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.gridx = 2;
		gbc_btnSubmit.gridy = 7;
		add(btnSubmit, gbc_btnSubmit);
	}

}
