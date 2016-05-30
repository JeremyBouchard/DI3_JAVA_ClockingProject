package view;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import model.Person.gender;
import javax.swing.JFormattedTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
	private JTextField txtFirstname;
	private JTextField txtSurname;
	private JTextField txtMailAdress;
	private JTextField txtBirthdate;



	public GUI() {
		setResizable(false);
		setTitle("Employee Add");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{50, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);

		JLabel LblEmployeeInfo = new JLabel("Fill with employyee infos :");
		LblEmployeeInfo.setVerticalAlignment(SwingConstants.BOTTOM);
		LblEmployeeInfo.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_LblEmployeeInfo = new GridBagConstraints();
		gbc_LblEmployeeInfo.gridwidth = 2;
		gbc_LblEmployeeInfo.anchor = GridBagConstraints.NORTH;
		gbc_LblEmployeeInfo.insets = new Insets(0, 0, 5, 0);
		gbc_LblEmployeeInfo.gridx = 0;
		gbc_LblEmployeeInfo.gridy = 0;
		getContentPane().add(LblEmployeeInfo, gbc_LblEmployeeInfo);

		JLabel lblGender = new JLabel("Gender :");
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.anchor = GridBagConstraints.EAST;
		gbc_lblGender.insets = new Insets(0, 0, 5, 5);
		gbc_lblGender.gridx = 0;
		gbc_lblGender.gridy = 1;
		getContentPane().add(lblGender, gbc_lblGender);

		JComboBox cbbGender = new JComboBox();
		cbbGender.setModel(new DefaultComboBoxModel(gender.values()));
		cbbGender.setMaximumRowCount(3);
		GridBagConstraints gbc_cbbGender = new GridBagConstraints();
		gbc_cbbGender.insets = new Insets(0, 0, 5, 0);
		gbc_cbbGender.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbbGender.gridx = 1;
		gbc_cbbGender.gridy = 1;
		getContentPane().add(cbbGender, gbc_cbbGender);

		JLabel lblFirstaname = new JLabel("Firstname :");
		GridBagConstraints gbc_lblFirstaname = new GridBagConstraints();
		gbc_lblFirstaname.anchor = GridBagConstraints.EAST;
		gbc_lblFirstaname.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstaname.gridx = 0;
		gbc_lblFirstaname.gridy = 2;
		getContentPane().add(lblFirstaname, gbc_lblFirstaname);

		txtFirstname = new JTextField();
		GridBagConstraints gbc_txtFirstname = new GridBagConstraints();
		gbc_txtFirstname.insets = new Insets(0, 0, 5, 0);
		gbc_txtFirstname.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFirstname.gridx = 1;
		gbc_txtFirstname.gridy = 2;
		getContentPane().add(txtFirstname, gbc_txtFirstname);
		txtFirstname.setColumns(10);

		JLabel lblSurname = new JLabel("Surname :");
		GridBagConstraints gbc_lblSurname = new GridBagConstraints();
		gbc_lblSurname.anchor = GridBagConstraints.EAST;
		gbc_lblSurname.insets = new Insets(0, 0, 5, 5);
		gbc_lblSurname.gridx = 0;
		gbc_lblSurname.gridy = 3;
		getContentPane().add(lblSurname, gbc_lblSurname);

		txtSurname = new JTextField();
		GridBagConstraints gbc_txtSurname = new GridBagConstraints();
		gbc_txtSurname.insets = new Insets(0, 0, 5, 0);
		gbc_txtSurname.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSurname.gridx = 1;
		gbc_txtSurname.gridy = 3;
		getContentPane().add(txtSurname, gbc_txtSurname);
		txtSurname.setColumns(10);

		JLabel lblMailadress = new JLabel("MailAdress :");
		GridBagConstraints gbc_lblMailadress = new GridBagConstraints();
		gbc_lblMailadress.anchor = GridBagConstraints.EAST;
		gbc_lblMailadress.insets = new Insets(0, 0, 5, 5);
		gbc_lblMailadress.gridx = 0;
		gbc_lblMailadress.gridy = 4;
		getContentPane().add(lblMailadress, gbc_lblMailadress);

		txtMailAdress = new JTextField();
		GridBagConstraints gbc_txtMailAdress = new GridBagConstraints();
		gbc_txtMailAdress.insets = new Insets(0, 0, 5, 0);
		gbc_txtMailAdress.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMailAdress.gridx = 1;
		gbc_txtMailAdress.gridy = 4;
		getContentPane().add(txtMailAdress, gbc_txtMailAdress);
		txtMailAdress.setColumns(10);

		JLabel lblBirthdate = new JLabel("Birthdate :");
		GridBagConstraints gbc_lblBirthdate = new GridBagConstraints();
		gbc_lblBirthdate.anchor = GridBagConstraints.EAST;
		gbc_lblBirthdate.insets = new Insets(0, 0, 5, 5);
		gbc_lblBirthdate.gridx = 0;
		gbc_lblBirthdate.gridy = 5;
		getContentPane().add(lblBirthdate, gbc_lblBirthdate);

		txtBirthdate = new JTextField();
		txtBirthdate.setName("");
		GridBagConstraints gbc_txtBirthdate = new GridBagConstraints();
		gbc_txtBirthdate.insets = new Insets(0, 0, 5, 0);
		gbc_txtBirthdate.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBirthdate.gridx = 1;
		gbc_txtBirthdate.gridy = 5;
		getContentPane().add(txtBirthdate, gbc_txtBirthdate);
		txtBirthdate.setColumns(10);

		JLabel lblDepartment = new JLabel("Department");
		GridBagConstraints gbc_lblDepartment = new GridBagConstraints();
		gbc_lblDepartment.anchor = GridBagConstraints.EAST;
		gbc_lblDepartment.insets = new Insets(0, 0, 5, 5);
		gbc_lblDepartment.gridx = 0;
		gbc_lblDepartment.gridy = 6;
		getContentPane().add(lblDepartment, gbc_lblDepartment);

		JComboBox cbbDepartment = new JComboBox();
		GridBagConstraints gbc_cbbDepartment = new GridBagConstraints();
		gbc_cbbDepartment.insets = new Insets(0, 0, 5, 0);
		gbc_cbbDepartment.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbbDepartment.gridx = 1;
		gbc_cbbDepartment.gridy = 6;
		getContentPane().add(cbbDepartment, gbc_cbbDepartment);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnEmpployee = new JMenu("Empployee");
		menuBar.add(mnEmpployee);
		
		JMenuItem mntmAdd = new JMenuItem("Add");
		mntmAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.out.println("change panel");
			}
		});
		mnEmpployee.add(mntmAdd);



	}
}



