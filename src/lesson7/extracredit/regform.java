package lesson7.extracredit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class regform extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regform frame = new regform();
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
	public regform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(100, 5, 300, 40);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel lblWelcome = new JLabel("<html><center><p>Welcome to Maharishi University of Management</p> <p>Online class registration form </p> </center><html>",SwingConstants.CENTER);
		panel.add(lblWelcome);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(157, 56, 317, 500);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 26, 229, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 58, 229, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 89, 229, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 120, 229, 20);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 153, 229, 20);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 184, 229, 20);
		panel_1.add(textField_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(10, 222, 109, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("New radio button");
		radioButton.setBounds(121, 222, 109, 23);
		panel_1.add(radioButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 256, 28, 20);
		panel_1.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(6, 285, 97, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("New check box");
		checkBox.setBounds(117, 285, 97, 23);
		panel_1.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("New check box");
		checkBox_1.setBounds(214, 285, 97, 23);
		panel_1.add(checkBox_1);
		
		JTextArea txtrDsg = new JTextArea();
	
		txtrDsg.setBounds(10, 325, 275, 64);
		panel_1.add(txtrDsg);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(97, 440, 89, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 56, 151, 500);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(95, 28, 46, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(95, 59, 46, 14);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(95, 94, 46, 14);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(95, 124, 46, 14);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(95, 152, 46, 14);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(95, 180, 46, 14);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(95, 223, 46, 14);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(95, 261, 46, 14);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(95, 286, 46, 14);
		panel_2.add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setBounds(95, 324, 46, 14);
		panel_2.add(label_8);
	}
}
