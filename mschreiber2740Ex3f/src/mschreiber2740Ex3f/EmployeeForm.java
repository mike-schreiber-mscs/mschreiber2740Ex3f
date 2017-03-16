package mschreiber2740Ex3f;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;

import java.awt.Font;

public class EmployeeForm extends JFrame {

	private JPanel contentPane;
	private JTextField empIDTextField;
	private JTextField positionTextField;
	private JTextField empNameTextField;
	private JComboBox departmentComboBox;
	private JList employeeList;
	private DefaultListModel employeeListModel;
	Employee emp1, emp2, emp3;

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
		setTitle("Exercise 3F: Overloaded Constructors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 553, 164);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel();
		employeeList = new JList(employeeListModel);
		scrollPane.setViewportView(employeeList);
		
		JLabel lblNewLabel = new JLabel("Employee ID:");
		lblNewLabel.setBounds(10, 205, 130, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee name:");
		lblNewLabel_1.setBounds(10, 230, 130, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Position:");
		lblNewLabel_2.setBounds(10, 286, 130, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton noArgConstructorBtn = new JButton("No Arg");
		noArgConstructorBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		noArgConstructorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_noArgConstructorBtn_actionPerformed(arg0);
			}
		});
		noArgConstructorBtn.setBounds(66, 314, 89, 23);
		contentPane.add(noArgConstructorBtn);
		
		JButton twoArgConstructorBtn = new JButton("2 Arg");
		twoArgConstructorBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		twoArgConstructorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_twoArgConstructorBtn_actionPerformed(e);
			}
		});
		twoArgConstructorBtn.setBounds(170, 314, 104, 23);
		contentPane.add(twoArgConstructorBtn);
		
		JButton fourArgConstructorBtn = new JButton("4 Arg");
		fourArgConstructorBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		fourArgConstructorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_fourArgConstructorBtn_actionPerformed(e);
			}
		});
		fourArgConstructorBtn.setBounds(292, 314, 89, 23);
		contentPane.add(fourArgConstructorBtn);
		
		empIDTextField = new JTextField();
		empIDTextField.setText("101");
		lblNewLabel.setLabelFor(empIDTextField);
		empIDTextField.setBounds(170, 202, 110, 20);
		contentPane.add(empIDTextField);
		empIDTextField.setColumns(10);
		
		positionTextField = new JTextField();
		positionTextField.setText("Software Engineer");
		lblNewLabel_2.setLabelFor(positionTextField);
		positionTextField.setBounds(170, 283, 138, 20);
		contentPane.add(positionTextField);
		positionTextField.setColumns(10);
		
		departmentComboBox = new JComboBox();
		departmentComboBox.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Human Resources", "Manufacturing", "Shipping", "Maintenance"}));
		departmentComboBox.setBounds(170, 252, 138, 20);
		contentPane.add(departmentComboBox);
		
		empNameTextField = new JTextField();
		empNameTextField.setText("Mark Swanson");
		lblNewLabel_1.setLabelFor(empNameTextField);
		empNameTextField.setBounds(170, 227, 110, 20);
		contentPane.add(empNameTextField);
		empNameTextField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Department:");
		lblNewLabel_3.setLabelFor(departmentComboBox);
		lblNewLabel_3.setBounds(10, 255, 130, 14);
		contentPane.add(lblNewLabel_3);
	}
	protected void do_noArgConstructorBtn_actionPerformed(ActionEvent arg0) {
		//call appropriate constructor			
		emp1 = new Employee(); 
		//add to employeeeListModel
		employeeListModel.addElement(emp1);
			
	}
	
	protected void do_twoArgConstructorBtn_actionPerformed(ActionEvent e) {
		//get empID from empIDtextField, convert to int
		int empId = Integer.parseInt(empIDTextField.getText());
		// call appropriate constructor
		emp2 = new Employee(empNameTextField.getText(), empId);
		//add to employeeeListModel
		employeeListModel.addElement(emp2);
		
	}
	
	protected void do_fourArgConstructorBtn_actionPerformed(ActionEvent e) {
		//get empID from empIDtextField, convert to int
		int empId = Integer.parseInt(empIDTextField.getText());
		//get selected item from combobox to add into employee list model
		String dept = (String) departmentComboBox.getSelectedItem();
				// call appropriate constructor
		emp3 = new Employee(empNameTextField.getText(), empId, dept, positionTextField.getText());
		//add to employeeeListModel
		employeeListModel.addElement(emp3);
	}
}
