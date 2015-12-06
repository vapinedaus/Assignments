package lesson6.question2;
  
import java.awt.Color; 
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RainbowColorFrame extends JFrame {

	   JButton btnRed = new JButton();
	   JButton btnOrange = new JButton();
	   JButton btnGreen = new JButton();
	   JButton btnBlue = new JButton();
	   JButton btnYellow= new JButton();
	   JButton btnIndigo= new JButton();
	   JButton btnViolet= new JButton();
	 public RainbowColorFrame() {
		    setTitle("Rainbow Color Frame");
			setBounds(0,0,755,155);
			setLocation(300, 200);
			setLayout(new FlowLayout(FlowLayout.LEFT));
			

			
			 btnRed.setPreferredSize( new Dimension(100,110));
			 btnRed.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));
			 btnRed.setLayout(new GridLayout(3,2));
			 btnRed.setBackground(Color.RED);
			 add(btnRed);
			 btnRed.addActionListener(
					 new ActionListener()
					 {
						 @Override
						 public void actionPerformed(ActionEvent e)
						 {
							 JButton source = (JButton) e.getSource();
							 JOptionPane.showMessageDialog(source,"Red signifies passion, vitality, enthusiasm and security", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
								
						 }
					 }
					 );
			 
			 
			 btnOrange.setPreferredSize( new Dimension(100,110));
			 btnOrange.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));
			 btnOrange.setLayout(new GridLayout(3,2));
			 btnOrange.setBackground(Color.ORANGE);
			 add(btnOrange);
			 btnOrange.addActionListener(
					 new ActionListener()
					 {
						 @Override
						 public void actionPerformed(ActionEvent e)
						 {
							 JButton source = (JButton) e.getSource();
							 JOptionPane.showMessageDialog(source,"Orange signifies creativity, playfulness, exploration on a practical level and relief from boredom", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
								
						 }
					 }
					 );
			 
			 btnGreen.setPreferredSize( new Dimension(100,110));
			 btnGreen.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));
			 btnGreen.setLayout(new GridLayout(3,2));
			 btnGreen.setBackground(Color.GREEN);
			 add(btnGreen);
			 btnGreen.addActionListener(
					 new ActionListener()
					 {
						 @Override
						 public void actionPerformed(ActionEvent e)
						 {
							 JButton source = (JButton) e.getSource();
							 JOptionPane.showMessageDialog(source,"Green signifies harmony, sympathy, health and abundance", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
								
						 }
					 }
					 );
			 
			
			 btnBlue.setPreferredSize( new Dimension(100,110));
			 btnBlue.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));
			 btnBlue.setLayout(new GridLayout(3,2));
			 btnBlue.setBackground(Color.BLUE);
			 add(btnBlue);
			 btnBlue.addActionListener(
					 new ActionListener()
					 {
						 @Override
						 public void actionPerformed(ActionEvent e)
						 {
							 JButton source = (JButton) e.getSource();
							 JOptionPane.showMessageDialog(source,"Blue signifies peace and understanding, sympathy and relax", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
								
						 }
					 }
					 );
			 
			 btnYellow.setPreferredSize( new Dimension(100,110));
			 btnYellow.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));
			 btnYellow.setLayout(new GridLayout(3,2));
			 btnYellow.setBackground(Color.YELLOW);
			 add(btnYellow);
			 btnYellow.addActionListener(
					 new ActionListener()
					 {
						 @Override
						 public void actionPerformed(ActionEvent e)
						 {
							 JButton source = (JButton) e.getSource();
							 JOptionPane.showMessageDialog(source,"Yellow signifies clarity of thought, orderliness and memory improvement", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
								
						 }
					 }
					 );
			 
			 btnIndigo.setPreferredSize( new Dimension(100,110));
			 btnIndigo.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));
			 btnIndigo.setLayout(new GridLayout(3,2));
			 btnIndigo.setBackground(new Color(75,0,130));
			 add(btnIndigo);
			 btnIndigo.addActionListener(
					 new ActionListener()
					 {
						 @Override
						 public void actionPerformed(ActionEvent e)
						 {
							 JButton source = (JButton) e.getSource();
							 JOptionPane.showMessageDialog(source,"Indigo signifies self-mastery, intuition and spiritual attainment", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
								
						 }
					 }
					 );
			 

			 btnViolet.setPreferredSize( new Dimension(100,110));
			 btnViolet.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));
			 btnViolet.setLayout(new GridLayout(3,2));
			 btnViolet.setBackground(new Color(159, 0, 255));
			 add(btnViolet);
			 btnViolet.addActionListener( 
					 new ActionListener()
					 { 
						 @Override
						 public void actionPerformed(ActionEvent e)
						 {
							 JButton source = (JButton) e.getSource();
							 JOptionPane.showMessageDialog(source,"Violet signifies sorrow, idealism and brings love for humanity", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
								
						 }
					 }
					 );
			
			
			 
	      }
	
	
	public static void main(String[] args) {

		RainbowColorFrame frame = new RainbowColorFrame();
		frame.setResizable(true);
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	

	
}
