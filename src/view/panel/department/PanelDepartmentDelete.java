package view.panel.department;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

public class PanelDepartmentDelete extends JPanel {
	public PanelDepartmentDelete(){
		setBorder(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{170, 0};
		gridBagLayout.rowHeights = new int[]{16, 174, 25, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		JLabel lblInstruction = new JLabel("Select the department to delete");
		GridBagConstraints gbc_lblInstruction = new GridBagConstraints();
		gbc_lblInstruction.insets = new Insets(0, 0, 5, 0);
		gbc_lblInstruction.gridx = 0;
		gbc_lblInstruction.gridy = 0;
		add(lblInstruction, gbc_lblInstruction);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Submited");
			}
		});

		JList list = new JList();
		list.setVisibleRowCount(5);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.insets = new Insets(5, 15, 5, 15);
		gbc_list.gridx = 0;
		gbc_list.gridy = 1;
		add(list, gbc_list);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 2;
		add(btnNewButton, gbc_btnNewButton);
	}
}
