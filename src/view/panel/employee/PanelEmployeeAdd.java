package view.panel.employee;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.Person.gender;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class PanelEmployeeAdd extends JPanel {

	private JTextField txtFirstname;
	private JTextField txtSurname;
	private JTextField txtMail;
	private JTextField txtBirthdate;

	public PanelEmployeeAdd(){
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{50, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		JLabel LblInstruction = new JLabel("Please fill all the fileds :");
		LblInstruction.setVerticalAlignment(SwingConstants.BOTTOM);
		LblInstruction.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_LblInstruction = new GridBagConstraints();
		gbc_LblInstruction.gridwidth = 2;
		gbc_LblInstruction.anchor = GridBagConstraints.NORTH;
		gbc_LblInstruction.insets = new Insets(0, 0, 5, 0);
		gbc_LblInstruction.gridx = 0;
		gbc_LblInstruction.gridy = 0;
		add(LblInstruction, gbc_LblInstruction);

		JLabel lblGender = new JLabel("Gender :");
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.anchor = GridBagConstraints.EAST;
		gbc_lblGender.insets = new Insets(0, 0, 5, 5);
		gbc_lblGender.gridx = 0;
		gbc_lblGender.gridy = 1;
		add(lblGender, gbc_lblGender);

		JComboBox cbbGender = new JComboBox();
		cbbGender.setModel(new DefaultComboBoxModel(gender.values()));
		cbbGender.setMaximumRowCount(3);
		GridBagConstraints gbc_cbbGender = new GridBagConstraints();
		gbc_cbbGender.insets = new Insets(0, 0, 5, 0);
		gbc_cbbGender.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbbGender.gridx = 1;
		gbc_cbbGender.gridy = 1;
		add(cbbGender, gbc_cbbGender);

		JLabel lblFirstaname = new JLabel("Firstname :");
		GridBagConstraints gbc_lblFirstaname = new GridBagConstraints();
		gbc_lblFirstaname.anchor = GridBagConstraints.EAST;
		gbc_lblFirstaname.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstaname.gridx = 0;
		gbc_lblFirstaname.gridy = 2;
		add(lblFirstaname, gbc_lblFirstaname);

		txtFirstname = new JTextField();
		GridBagConstraints gbc_txtFirstname = new GridBagConstraints();
		gbc_txtFirstname.insets = new Insets(0, 0, 5, 0);
		gbc_txtFirstname.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFirstname.gridx = 1;
		gbc_txtFirstname.gridy = 2;
		add(txtFirstname, gbc_txtFirstname);
		txtFirstname.setColumns(10);

		JLabel lblSurname = new JLabel("Surname :");
		GridBagConstraints gbc_lblSurname = new GridBagConstraints();
		gbc_lblSurname.anchor = GridBagConstraints.EAST;
		gbc_lblSurname.insets = new Insets(0, 0, 5, 5);
		gbc_lblSurname.gridx = 0;
		gbc_lblSurname.gridy = 3;
		add(lblSurname, gbc_lblSurname);

		txtSurname = new JTextField();
		GridBagConstraints gbc_txtSurname = new GridBagConstraints();
		gbc_txtSurname.insets = new Insets(0, 0, 5, 0);
		gbc_txtSurname.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSurname.gridx = 1;
		gbc_txtSurname.gridy = 3;
		add(txtSurname, gbc_txtSurname);
		txtSurname.setColumns(10);

		JLabel lblMail = new JLabel("MailAdress :");
		GridBagConstraints gbc_lblMail = new GridBagConstraints();
		gbc_lblMail.anchor = GridBagConstraints.EAST;
		gbc_lblMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblMail.gridx = 0;
		gbc_lblMail.gridy = 4;
		add(lblMail, gbc_lblMail);

		txtMail = new JTextField();
		GridBagConstraints gbc_txtMail = new GridBagConstraints();
		gbc_txtMail.insets = new Insets(0, 0, 5, 0);
		gbc_txtMail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMail.gridx = 1;
		gbc_txtMail.gridy = 4;
		add(txtMail, gbc_txtMail);
		txtMail.setColumns(10);

		JLabel lblBirthdate = new JLabel("Birthdate :");
		GridBagConstraints gbc_lblBirthdate = new GridBagConstraints();
		gbc_lblBirthdate.anchor = GridBagConstraints.EAST;
		gbc_lblBirthdate.insets = new Insets(0, 0, 5, 5);
		gbc_lblBirthdate.gridx = 0;
		gbc_lblBirthdate.gridy = 5;
		add(lblBirthdate, gbc_lblBirthdate);

		txtBirthdate = new JTextField();
		txtBirthdate.setName("");
		GridBagConstraints gbc_txtBirthdate = new GridBagConstraints();
		gbc_txtBirthdate.insets = new Insets(0, 0, 5, 0);
		gbc_txtBirthdate.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBirthdate.gridx = 1;
		gbc_txtBirthdate.gridy = 5;
		add(txtBirthdate, gbc_txtBirthdate);
		txtBirthdate.setColumns(10);

		JLabel lblDepartment = new JLabel("Department");
		GridBagConstraints gbc_lblDepartment = new GridBagConstraints();
		gbc_lblDepartment.anchor = GridBagConstraints.EAST;
		gbc_lblDepartment.insets = new Insets(0, 0, 5, 5);
		gbc_lblDepartment.gridx = 0;
		gbc_lblDepartment.gridy = 6;
		add(lblDepartment, gbc_lblDepartment);

		JComboBox cbbDepartment = new JComboBox();
		GridBagConstraints gbc_cbbDepartment = new GridBagConstraints();
		gbc_cbbDepartment.insets = new Insets(0, 0, 5, 0);
		gbc_cbbDepartment.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbbDepartment.gridx = 1;
		gbc_cbbDepartment.gridy = 6;
		add(cbbDepartment, gbc_cbbDepartment);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Submited");
			}
		});
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnSubmit.gridx = 1;
		gbc_btnSubmit.gridy = 7;
		add(btnSubmit, gbc_btnSubmit);
	}
}
