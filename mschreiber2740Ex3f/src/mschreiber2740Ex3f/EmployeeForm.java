package mschreiber2740Ex3f;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class EmployeeForm extends JFrame {

	private JPanel contentPane;
	private JTextField employeeIDTextField;
	private JTextField positionTextField;
	private JTextField employeeNameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployeeForm() {
		setTitle("mschreiber2740Ex3F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 84);
		contentPane.add(scrollPane);
		
		JList employeeList = new JList();
		scrollPane.setViewportView(employeeList);
		
		JLabel lblNewLabel = new JLabel("Employee ID:");
		lblNewLabel.setBounds(10, 104, 130, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee name:");
		lblNewLabel_1.setBounds(10, 128, 130, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Position:");
		lblNewLabel_2.setBounds(10, 178, 130, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("No Arg");
		btnNewButton.setBounds(72, 228, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2 Arg");
		btnNewButton_1.setBounds(185, 228, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4 Arg");
		btnNewButton_2.setBounds(297, 228, 89, 23);
		contentPane.add(btnNewButton_2);
		
		employeeIDTextField = new JTextField();
		employeeIDTextField.setText("101");
		lblNewLabel.setLabelFor(employeeIDTextField);
		employeeIDTextField.setBounds(185, 101, 110, 20);
		contentPane.add(employeeIDTextField);
		employeeIDTextField.setColumns(10);
		
		positionTextField = new JTextField();
		positionTextField.setText("Software Engineer");
		lblNewLabel_2.setLabelFor(positionTextField);
		positionTextField.setBounds(185, 175, 110, 20);
		contentPane.add(positionTextField);
		positionTextField.setColumns(10);
		
		JComboBox departmentComboBox = new JComboBox();
		departmentComboBox.setBounds(185, 150, 110, 20);
		contentPane.add(departmentComboBox);
		
		employeeNameTextField = new JTextField();
		employeeNameTextField.setText("Mark Swanson");
		lblNewLabel_1.setLabelFor(employeeNameTextField);
		employeeNameTextField.setBounds(185, 125, 110, 20);
		contentPane.add(employeeNameTextField);
		employeeNameTextField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Department:");
		lblNewLabel_3.setLabelFor(departmentComboBox);
		lblNewLabel_3.setBounds(10, 153, 130, 14);
		contentPane.add(lblNewLabel_3);
	}
}
