package view.panel.employee;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.time.format.DateTimeFormatter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import employee.EmployeeAddAction;
import model.Person.gender;

public class PanelEmployeeAdd extends JPanel {
	
	final public static String DATEFORMAT= "dd-MM-uuuu";
	final public static String TIMEFORMAT= "H:mm";
	private JComboBox cbbDepartment;
	private JComboBox cbbGender;
	private JTextField txtFirstname;
	private JTextField txtSurname;
	private JTextField txtMail;
	private JFormattedTextField formattedTextBirthdate;
	private JFormattedTextField formattedTextDepartureTime;
	private JFormattedTextField formattedTextArivalTime;

	public PanelEmployeeAdd(){
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		JLabel LblInstruction = new JLabel("Personal details :");
		LblInstruction.setVerticalAlignment(SwingConstants.BOTTOM);
		LblInstruction.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_LblInstruction = new GridBagConstraints();
		gbc_LblInstruction.gridwidth = 2;
		gbc_LblInstruction.anchor = GridBagConstraints.NORTHWEST;
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

		cbbGender = new JComboBox();
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
		add(getTxtFirstname(), gbc_txtFirstname);
		getTxtFirstname().setColumns(10);

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


		DateTimeFormatter DateFormatter = DateTimeFormatter.ofPattern(DATEFORMAT);
		formattedTextBirthdate = new JFormattedTextField(DateFormatter);
		formattedTextBirthdate.setText("DD-MM-YYYY");

		GridBagConstraints gbc_formattedTextBirthdate = new GridBagConstraints();
		gbc_formattedTextBirthdate.insets = new Insets(0, 0, 5, 0);
		gbc_formattedTextBirthdate.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextBirthdate.gridx = 1;
		gbc_formattedTextBirthdate.gridy = 5;
		add(formattedTextBirthdate, gbc_formattedTextBirthdate);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new EmployeeAddAction());
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnSubmit.gridx = 1;
		gbc_btnSubmit.gridy = 10;
		add(btnSubmit, gbc_btnSubmit);

		JLabel lblEmploye = new JLabel("Employment infos :");
		GridBagConstraints gbc_lblEmploye = new GridBagConstraints();
		gbc_lblEmploye.anchor = GridBagConstraints.WEST;
		gbc_lblEmploye.gridwidth = 2;
		gbc_lblEmploye.insets = new Insets(0, 0, 5, 0);
		gbc_lblEmploye.gridx = 0;
		gbc_lblEmploye.gridy = 6;
		add(lblEmploye, gbc_lblEmploye);

		JLabel lblDepartment = new JLabel("Department");
		GridBagConstraints gbc_lblDepartment = new GridBagConstraints();
		gbc_lblDepartment.anchor = GridBagConstraints.EAST;
		gbc_lblDepartment.insets = new Insets(0, 0, 5, 5);
		gbc_lblDepartment.gridx = 0;
		gbc_lblDepartment.gridy = 7;
		add(lblDepartment, gbc_lblDepartment);

		cbbDepartment = new JComboBox();
		GridBagConstraints gbc_cbbDepartment = new GridBagConstraints();
		gbc_cbbDepartment.insets = new Insets(0, 0, 5, 0);
		gbc_cbbDepartment.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbbDepartment.gridx = 1;
		gbc_cbbDepartment.gridy = 7;
		add(cbbDepartment, gbc_cbbDepartment);
		
		
		JLabel lblArivaltime = new JLabel("Arival Time :");
		GridBagConstraints gbc_lblArivaltime = new GridBagConstraints();
		gbc_lblArivaltime.anchor = GridBagConstraints.EAST;
		gbc_lblArivaltime.insets = new Insets(0, 0, 5, 5);
		gbc_lblArivaltime.gridx = 0;
		gbc_lblArivaltime.gridy = 8;
		add(lblArivaltime, gbc_lblArivaltime);
		
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(TIMEFORMAT);
		formattedTextArivalTime = new JFormattedTextField(timeFormatter);
		formattedTextArivalTime.setText("HH:MM");
		
		GridBagConstraints gbc_formattedTextArivalTime = new GridBagConstraints();
		gbc_formattedTextArivalTime.insets = new Insets(0, 0, 5, 0);
		gbc_formattedTextArivalTime.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextArivalTime.gridx = 1;
		gbc_formattedTextArivalTime.gridy = 8;
		add(formattedTextArivalTime, gbc_formattedTextArivalTime);

		JLabel lblDepartureTime = new JLabel("Departure Time :");
		GridBagConstraints gbc_lblDepartureTime = new GridBagConstraints();
		gbc_lblDepartureTime.anchor = GridBagConstraints.EAST;
		gbc_lblDepartureTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblDepartureTime.gridx = 0;
		gbc_lblDepartureTime.gridy = 9;
		add(lblDepartureTime, gbc_lblDepartureTime);
		
		formattedTextDepartureTime = new JFormattedTextField(timeFormatter);
		formattedTextDepartureTime.setText("HH:MM");
		
		GridBagConstraints gbc_formattedTextDepartureTime = new GridBagConstraints();
		gbc_formattedTextDepartureTime.insets = new Insets(0, 0, 5, 0);
		gbc_formattedTextDepartureTime.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextDepartureTime.gridx = 1;
		gbc_formattedTextDepartureTime.gridy = 9;
		add(formattedTextDepartureTime, gbc_formattedTextDepartureTime);
		
		
	}
	
	public void setError(String inputError) {
		System.out.println("error !!!!" + inputError);
	}

	public JFormattedTextField getFormattedTextBirthdate() {
		return formattedTextBirthdate;
	}

	public JFormattedTextField getFormattedTextDepartureTime() {
		return formattedTextDepartureTime;
	}

	public JFormattedTextField getFormattedTextArivalTime() {
		return formattedTextArivalTime;
	}

	public JTextField getTxtFirstname() {
		return txtFirstname;
	}

	public JTextField getTxtSurname() {
		return txtSurname;
	}

	public JTextField getTxtMail() {
		return txtMail;
	}

	public JTextField getFormattedTxtBirthdate() {
		return formattedTextBirthdate;
	}

	public JComboBox getCbbDepartment() {
		return cbbDepartment;
	}

	public JComboBox getCbbGender() {
		return cbbGender;
	}

}
