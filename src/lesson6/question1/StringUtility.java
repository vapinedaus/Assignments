package lesson6.question1; 

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringUtility {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
    	frame.setTitle("String Utility");
    	frame.setSize(500,200);
    	frame.setLocation(400, 100);
    	frame.setResizable(false);
    	Form(frame);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
	}
	
    static void Form(JFrame frame)
	{
    	
        frame.setLayout(null);
        
       // frame.getContentPane().setBackground(Color.LIGHT_GRAY);
	     
        JLabel lbl = new JLabel();
        lbl.setText("Input:");
        lbl.setBounds(260, 40, 100, 25);
        lbl.setFont(new Font("Calibri", Font.PLAIN, 12)); 
        frame.add(lbl);
        
        JLabel lbl2 = new JLabel();
        lbl2.setText("Output:");
        lbl2.setFont(new Font("Calibri", Font.PLAIN, 12)); 
        lbl2.setBounds(260, 75, 100, 25);
        frame.add(lbl2);
        
        final JTextField txtInput = new JTextField();
        txtInput.setBounds(260, 60, 140, 20);
        frame.add(txtInput);
        
        final JTextField txtOutput = new JTextField();
        txtOutput.setBounds(260, 95, 140, 20);
        frame.add(txtOutput);
        
        JButton btnCountText = new JButton();
        btnCountText.setText("Count Letters");
        btnCountText.setBounds(50, 40, 150, 25);
        frame.add(btnCountText);
        btnCountText.addActionListener(
        		new ActionListener()
        		{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						txtOutput.setText(String.valueOf(countLetters(txtInput.getText())));
					}
        			
        		}
        
        		
        		);
        
        
        
        JButton btnReverse = new JButton();
        btnReverse.setText("Reverse Letters");
        btnReverse.setBounds(50, 70, 150, 25);
        frame.add(btnReverse);
        
        btnReverse.addActionListener(
        		new ActionListener() 
        		{
 
					@Override
	 				public void actionPerformed(ActionEvent e) {
						
						txtOutput.setText(String.valueOf(reverse(txtInput.getText())));
					}
        			
        		}
        
        		
        		);
        
        
        JButton btnRemoveDuplicte = new JButton();
        btnRemoveDuplicte.setText("Remove Duplicates");
        btnRemoveDuplicte.setBounds(50, 100, 150, 25);
        btnRemoveDuplicte.addActionListener(
        		new ActionListener()
        		{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						txtOutput.setText(String.valueOf(removeDuplicates(txtInput.getText())));
					}
        			
        		}
        
        		
        		);
        frame.add(btnRemoveDuplicte);
        
	}

    static String removeDuplicates(String input)
    {
    
    	if (input.length() ==1)
    	{
    		return input;
    	}
    	else if( input.substring(1).contains(input.substring(0,1)))
    	{
    		return removeDuplicates(input.substring(1));
    	}
    	else
    	{
    		return input.substring(0,1) + removeDuplicates(input.substring(1));
    		
    	}
    		
   
    	
    	
    }
    
    
    
    static int countLetters(String input)
    {
    	if (input.isEmpty())
    	{
    		return 0;
    	}
    	else
    	{
    		return 1 +  countLetters(input.substring(0, input.length()-1));
    	}
    }
    
    static String reverse(String input)
    {
    
    	if (input.isEmpty())
    	{
    		return "";
    	}
    	else
    	{
    		return input.substring(input.length()-1) +  reverse(input.substring(0, input.length()-1));
    	}
    	
    	
    }
}
