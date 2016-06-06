package view.panel.department;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import controler.department.ActionDepartmentAdd;
import model.Company;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDepartmentAdd extends JPanel {
	private JTextField textName;
	private JComboBox comboManager;
	public PanelDepartmentAdd() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblInstruction = new JLabel("Please, fill all the field");
		GridBagConstraints gbc_lblInstruction = new GridBagConstraints();
		gbc_lblInstruction.insets = new Insets(0, 0, 5, 5);
		gbc_lblInstruction.gridx = 0;
		gbc_lblInstruction.gridy = 0;
		add(lblInstruction, gbc_lblInstruction);
		
		JLabel lblName = new JLabel("Name :");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.EAST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 1;
		add(lblName, gbc_lblName);
		
		textName = new JTextField();
		GridBagConstraints gbc_textName = new GridBagConstraints();
		gbc_textName.insets = new Insets(0, 0, 5, 0);
		gbc_textName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textName.gridx = 1;
		gbc_textName.gridy = 1;
		add(textName, gbc_textName);
		textName.setColumns(10);
		
		JLabel lblManager = new JLabel("Manager :");
		GridBagConstraints gbc_lblManager = new GridBagConstraints();
		gbc_lblManager.anchor = GridBagConstraints.EAST;
		gbc_lblManager.insets = new Insets(0, 0, 5, 5);
		gbc_lblManager.gridx = 0;
		gbc_lblManager.gridy = 2;
		add(lblManager, gbc_lblManager);
		
		
		Company company=Company.getInstance();
		Object[] ManagerList=company.getManagerList().toArray();
		comboManager = new JComboBox(ManagerList);
		GridBagConstraints gbc_comboManager = new GridBagConstraints();
		gbc_comboManager.insets = new Insets(0, 0, 5, 0);
		gbc_comboManager.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboManager.gridx = 1;
		gbc_comboManager.gridy = 2;
		add(comboManager, gbc_comboManager);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionDepartmentAdd());
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.gridx = 1;
		gbc_btnSubmit.gridy = 4;
		add(btnSubmit, gbc_btnSubmit);
	}
	public JTextField getTextName() {
		return textName;
	}
	public JComboBox getComboManager() {
		return comboManager;
	}

}
