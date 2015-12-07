package lesson6.extracredit;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;



public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtStreet;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtCountry;


	public static void main(String[] args) {
	Registration frame = new Registration();
	frame.setVisible(true);

	}


	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 50, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlWelcome = new JPanel();
		pnlWelcome.setBounds(100, 5, 300, 40);
		contentPane.add(pnlWelcome);
		pnlWelcome.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel lblWelcome = new JLabel("<html><center><p>Welcome to Maharishi University of Management</p> <p>Online class registration form </p> </center><html>",SwingConstants.CENTER);
		pnlWelcome.add(lblWelcome);
		
		JPanel pnlBody = new JPanel();
		pnlBody.setBounds(157, 56, 317, 500);
		contentPane.add(pnlBody);
		pnlBody.setLayout(null);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(10, 26, 229, 20);
		pnlBody.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(10, 58, 229, 20);
		pnlBody.add(txtLastName);
		
		txtStreet = new JTextField();
		txtStreet.setColumns(10);
		txtStreet.setBounds(10, 89, 229, 20);
		pnlBody.add(txtStreet);
		
		txtCity = new JTextField();
		txtCity.setColumns(10);
		txtCity.setBounds(10, 120, 229, 20);
		pnlBody.add(txtCity);
		
		txtState = new JTextField();
		txtState.setColumns(10);
		txtState.setBounds(10, 153, 229, 20);
		pnlBody.add(txtState);
		
		txtCountry = new JTextField();
		txtCountry.setColumns(10);
		txtCountry.setBounds(10, 184, 229, 20);
		pnlBody.add(txtCountry);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(10, 222, 109, 23);
		pnlBody.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(121, 222, 109, 23);
		pnlBody.add(rdbtnFemale);
		
		JComboBox cmbCourse = new JComboBox();
		cmbCourse.setBounds(10, 256, 129, 20);
		cmbCourse.addItem("Java");
		cmbCourse.addItem("C");
		pnlBody.add(cmbCourse);
	
		
		JCheckBox chckbxMorning = new JCheckBox("Morning");
		chckbxMorning.setBounds(6, 285, 97, 23);
		pnlBody.add(chckbxMorning);
		
		JCheckBox chckbxAfternoon = new JCheckBox("Afternoon");
		chckbxAfternoon.setBounds(117, 285, 97, 23);
		pnlBody.add(chckbxAfternoon);
		
		JCheckBox chckbxEvening = new JCheckBox("Evening");
		chckbxEvening.setBounds(214, 285, 97, 23);
		pnlBody.add(chckbxEvening);
		
		JTextArea txtMessage = new JTextArea();
	
		txtMessage.setBounds(10, 325, 275, 64);
		pnlBody.add(txtMessage);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(97, 440, 89, 23);
		pnlBody.add(btnSubmit);
		
		rdbtnMale.addActionListener(evt->
		{
			rdbtnFemale.setSelected(false);
		});
		rdbtnFemale.addActionListener(evt->
		{
			rdbtnMale.setSelected(false);
		});
		

		chckbxMorning.addActionListener(evt->
		{
			chckbxAfternoon.setSelected(false);
			chckbxEvening.setSelected(false);
		});
		chckbxAfternoon.addActionListener(evt->
		{
			
			chckbxMorning.setSelected(false);
			chckbxEvening.setSelected(false);
		});
		chckbxEvening.addActionListener(evt->
		{
			chckbxAfternoon.setSelected(false);
			chckbxMorning.setSelected(false);
		});
		
	
		
		
		btnSubmit.addActionListener(evt->
		{
			boolean blnsuccesful = true;
			JButton source = (JButton) evt.getSource();
			JOptionPane jpane= new JOptionPane(source);
			if (txtFirstName.getText().isEmpty() &&
					txtLastName.getText().isEmpty() &&
					txtStreet.getText().isEmpty() &&
					txtCity.getText().isEmpty() &&
					txtState.getText().isEmpty() &&
					txtCountry.getText().isEmpty() &&
					txtMessage.getText().isEmpty() )
			{
				jpane.showMessageDialog(source,"Field should not be empty", "Required Field", JOptionPane.ERROR_MESSAGE);
				blnsuccesful=false;
			}
			
			if (rdbtnMale.isSelected() ==false && rdbtnFemale.isSelected()==false)
			{
				jpane.showMessageDialog(source,"Need to select the Gender", "Required Gender", JOptionPane.ERROR_MESSAGE);
				blnsuccesful=false;
			}
			if (chckbxMorning.isSelected() ==false && chckbxMorning.isSelected()==false && chckbxEvening.isSelected()==false)
			{
				jpane.showMessageDialog(source,"Need to select Suitable session", "Required session", JOptionPane.ERROR_MESSAGE);
				blnsuccesful=false;
			}
			if (blnsuccesful==true)
			{
				jpane.showMessageDialog(source,"Successfully Registered", "Registration Status", JOptionPane.ERROR_MESSAGE);
				
			}
		});
		
		
		
		
		JPanel pnlBody2 = new JPanel();
		pnlBody2.setBounds(5, 56, 151, 500);
		contentPane.add(pnlBody2);
		pnlBody2.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(40, 28, 101, 14);
		pnlBody2.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(40, 59, 101, 14);
		pnlBody2.add(lblLastName);
		
		JLabel lblStreet = new JLabel("Street:");
		lblStreet.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStreet.setBounds(40, 94, 101, 14);
		pnlBody2.add(lblStreet);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setBounds(40, 124, 101, 14);
		pnlBody2.add(lblCity);
		
		JLabel lblState = new JLabel("State:");
		lblState.setHorizontalAlignment(SwingConstants.RIGHT);
		lblState.setBounds(40, 152, 101, 14);
		pnlBody2.add(lblState);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCountry.setBounds(40, 180, 101, 14);
		pnlBody2.add(lblCountry);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGender.setBounds(40, 223, 101, 14);
		pnlBody2.add(lblGender);
		
		JLabel lblSelectCourse = new JLabel("Select Course:");
		lblSelectCourse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSelectCourse.setBounds(40, 261, 101, 14);
		pnlBody2.add(lblSelectCourse);
		
		JLabel lblSuitableSession = new JLabel("Suitable Session:");
		lblSuitableSession.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSuitableSession.setBounds(40, 286, 101, 14);
		pnlBody2.add(lblSuitableSession);
		
		JLabel lblMessage = new JLabel("Message:");
		lblMessage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMessage.setBounds(40, 324, 101, 14);
		pnlBody2.add(lblMessage);
	}
}

