package view.panel.department;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Cursor;
import java.awt.GridBagConstraints;

public class PanelDepartmentUpdate extends JPanel {


		private JTextField textFirstname;
		public PanelDepartmentUpdate() {
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[] {0, 0, 0, 0};
			gridBagLayout.rowHeights = new int[] {0, 0, 0, 30, 0};
			gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
			gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			setLayout(gridBagLayout);

			JLabel lblSelectDepartmentTo = new JLabel("Select department");
			GridBagConstraints gbc_lblSelectDepartmentTo = new GridBagConstraints();
			gbc_lblSelectDepartmentTo.insets = new Insets(0, 0, 5, 5);
			gbc_lblSelectDepartmentTo.gridx = 0;
			gbc_lblSelectDepartmentTo.gridy = 0;
			add(lblSelectDepartmentTo, gbc_lblSelectDepartmentTo);

			JLabel lblUpdateInfos = new JLabel("Update infos");
			GridBagConstraints gbc_lblUpdateInfos = new GridBagConstraints();
			gbc_lblUpdateInfos.gridwidth = 2;
			gbc_lblUpdateInfos.insets = new Insets(0, 0, 5, 0);
			gbc_lblUpdateInfos.gridx = 1;
			gbc_lblUpdateInfos.gridy = 0;
			add(lblUpdateInfos, gbc_lblUpdateInfos);

			JList listDepartment = new JList();
			GridBagConstraints gbc_listDepartment = new GridBagConstraints();
			gbc_listDepartment.gridheight = 2;
			gbc_listDepartment.insets = new Insets(0, 0, 5, 5);
			gbc_listDepartment.fill = GridBagConstraints.BOTH;
			gbc_listDepartment.gridx = 0;
			gbc_listDepartment.gridy = 1;
			add(listDepartment, gbc_listDepartment);
			
						JLabel lblName = new JLabel("Name :");
						GridBagConstraints gbc_lblName = new GridBagConstraints();
						gbc_lblName.insets = new Insets(0, 0, 5, 5);
						gbc_lblName.gridx = 1;
						gbc_lblName.gridy = 1;
						add(lblName, gbc_lblName);
						
									textFirstname = new JTextField();
									textFirstname.setColumns(10);
									GridBagConstraints gbc_textFirstname = new GridBagConstraints();
									gbc_textFirstname.insets = new Insets(0, 0, 5, 0);
									gbc_textFirstname.fill = GridBagConstraints.HORIZONTAL;
									gbc_textFirstname.gridx = 2;
									gbc_textFirstname.gridy = 1;
									add(textFirstname, gbc_textFirstname);
						
									JLabel label_5 = new JLabel("Department");
									GridBagConstraints gbc_label_5 = new GridBagConstraints();
									gbc_label_5.insets = new Insets(0, 0, 5, 5);
									gbc_label_5.gridx = 1;
									gbc_label_5.gridy = 2;
									add(label_5, gbc_label_5);
			
						JComboBox comboDepartment = new JComboBox();
						GridBagConstraints gbc_comboDepartment = new GridBagConstraints();
						gbc_comboDepartment.insets = new Insets(0, 0, 5, 0);
						gbc_comboDepartment.fill = GridBagConstraints.HORIZONTAL;
						gbc_comboDepartment.gridx = 2;
						gbc_comboDepartment.gridy = 2;
						add(comboDepartment, gbc_comboDepartment);

			JButton btnSubmit = new JButton("Submit");
			GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
			gbc_btnSubmit.gridx = 2;
			gbc_btnSubmit.gridy = 3;
			add(btnSubmit, gbc_btnSubmit);

		}
	}
