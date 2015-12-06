package lesson7.question1;

import java.awt.*;
import javax.swing.*;


	public class MetricConversionAssistant extends JFrame {

		private JPanel contentPane;
		private JTextField txtMile;
		private JTextField txtKilometer;
		private JTextField txtKilogram;
		private JTextField txtLiter;
		private JTextField txtCentigrade;
		private JTextField txtPound;
		private JTextField txtGallon;
		private JTextField txtFarenheit;


		public static void main(String[] args) {
			
			MetricConversionAssistant frame = new MetricConversionAssistant();
			frame.setVisible(true);
			
		}

	
		public MetricConversionAssistant() {
			setTitle("Metric Conversion Assistant");
			getContentPane().setLayout(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 630, 250);
			contentPane = new JPanel();
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBounds(5, 5, 600, 140);
			contentPane.add(panel);
				panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
			
				
				JPanel pnl1 = new JPanel();
				panel.add(pnl1);
				pnl1.setLayout(null);
				
				JLabel lblMile = new JLabel("Mile:");
				lblMile.setHorizontalAlignment(SwingConstants.RIGHT);
				lblMile.setBounds(90, 22, 46, 14);
				pnl1.add(lblMile);
				
				JLabel lblPound = new JLabel("Pound:");
				lblPound.setHorizontalAlignment(SwingConstants.RIGHT);
				lblPound.setBounds(90, 53, 46, 14);
				pnl1.add(lblPound);
				
				JLabel lblGallon = new JLabel("Gallon:");
				lblGallon.setHorizontalAlignment(SwingConstants.RIGHT);
				lblGallon.setBounds(90, 82, 46, 14);
				pnl1.add(lblGallon);
				
				JLabel lblFarenheit = new JLabel("Farenheit:");
				lblFarenheit.setHorizontalAlignment(SwingConstants.RIGHT);
				lblFarenheit.setBounds(52, 110, 84, 14);
				pnl1.add(lblFarenheit);
			
			JPanel pnl3 = new JPanel();
			panel.add(pnl3);
			pnl3.setLayout(null);
			
			txtMile = new JTextField();
			txtMile.setBounds(10, 22, 131, 20);
			pnl3.add(txtMile);
			txtMile.setColumns(10);	
			
			txtPound = new JTextField();
			txtPound.setColumns(10);
			txtPound.setBounds(10, 53, 131, 20);
			pnl3.add(txtPound);
			
			txtGallon = new JTextField();
			txtGallon.setColumns(10);
			txtGallon.setBounds(10, 82, 131, 20);
			pnl3.add(txtGallon);
			
			txtFarenheit = new JTextField();
			txtFarenheit.setColumns(10);
			txtFarenheit.setBounds(10, 113, 131, 20);
			pnl3.add(txtFarenheit);
			
			JPanel pnl2 = new JPanel();
			panel.add(pnl2);
			pnl2.setLayout(null);
			
			JLabel lblKilometer = new JLabel("Kilometer:");
			lblKilometer.setHorizontalAlignment(SwingConstants.RIGHT);
			lblKilometer.setBounds(77, 22, 63, 14);
			pnl2.add(lblKilometer);
			
			JLabel lblKilogram = new JLabel("Kilogram:");
			lblKilogram.setHorizontalAlignment(SwingConstants.RIGHT);
			lblKilogram.setBounds(64, 53, 76, 14);
			pnl2.add(lblKilogram);
			
			JLabel lblLiter = new JLabel("Liter:");
			lblLiter.setHorizontalAlignment(SwingConstants.RIGHT);
			lblLiter.setBounds(94, 82, 46, 14);
			pnl2.add(lblLiter);
			
			JLabel lblCentigrade = new JLabel("Centigrade:");
			lblCentigrade.setHorizontalAlignment(SwingConstants.RIGHT);
			lblCentigrade.setBounds(64, 113, 76, 14);
			pnl2.add(lblCentigrade);
			
			JPanel pnl4 = new JPanel();
			panel.add(pnl4);
			pnl4.setLayout(null);
			
			txtKilometer = new JTextField();
			txtKilometer.setBounds(0, 22,  130, 20);
			txtKilometer.setColumns(10);
			pnl4.add(txtKilometer);
			
			txtKilogram = new JTextField();
			txtKilogram.setColumns(10);
			txtKilogram.setBounds(0, 53, 130, 20);
			pnl4.add(txtKilogram);
			
			txtLiter = new JTextField();
			txtLiter.setColumns(10);
			txtLiter.setBounds(0, 82, 130, 20);
			pnl4.add(txtLiter);
			
			txtCentigrade = new JTextField();
			txtCentigrade.setColumns(10);
			txtCentigrade.setBounds(0, 113, 130, 20);
			pnl4.add(txtCentigrade);
			
			JButton btnConvert = new JButton("Convert");
			btnConvert.setBounds(257, 156, 89, 23);
			contentPane.add(btnConvert);
			btnConvert.addActionListener(evt->
			{
				if (!txtMile.getText().isEmpty())
				{
					double convertMiletoKm = Double.parseDouble(txtMile.getText()) * 1.609344;
					txtKilometer.setText(String.valueOf(convertMiletoKm));
				}
				
				if (!txtPound.getText().isEmpty())
				{
					double convertPoundtoKilogram = Double.parseDouble(txtPound.getText()) /2.2046;
					txtKilogram.setText(String.valueOf(convertPoundtoKilogram));
				}
				
				if (!txtGallon.getText().isEmpty())
				{
					double convertGallontoLiter = Double.parseDouble(txtGallon.getText()) * 3.785;
					txtLiter.setText(String.valueOf(convertGallontoLiter));
				}
				if (!txtFarenheit.getText().isEmpty())
				{
					double convertFahrenheittoCentigrade = (Double.parseDouble(txtFarenheit.getText()) -32) *5/9;;
					txtCentigrade.setText(String.valueOf(convertFahrenheittoCentigrade));
				}
				

				
			});
			
			
		}
		
	}
