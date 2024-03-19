package visualCalculator;

//Appropriate Imports for Java Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualCalculator {

	private JFrame frame;
	private JButton button;
	private JLabel label;
	
	private void initialize() {
		//Create Frame
		frame = new JFrame("Visual Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);
		
		frame.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		frame.add(new JButton("1"), gbc);
		
		//Creating Buttons
		JButton zeroButton = new JButton("0"); 
	       zeroButton.addActionListener(new ActionListener() {
	           @Override
	           public void actionPerformed(ActionEvent e) {
	               int num = 0;
	           }
	     });
	}
	
	public static void main(String[] args) {
		
		//Create Frame(400,300)
			//Exit On Close
		
		//Create Layout of Calculator (GridBag Layout -- > x and y coordinate)
			//Layout Options (GridBag, Border, FlowLayout, Grid, BoxLayout)
		
		//Create Buttons (manual) --> Dont forget Action Listener
			//Numbers = 0 - 9
			//Operations = +,-,*,/
			//Equals
			//Decimal Point
			//Clear
			//BackSpace
		
		//GUI display 
			//TextField
		
		//Methods for Operators
			//Add
			//Subtract
			//Multiply
			//Divide
				//Handle Division by 0
			//Equals of two operators
				//Mindful of Order of Operations
			//Clear
				//TextField remove ALL
			//Backspace Method
				//Remove last time character one by one
		
		
		
		
		
		
		
		
		
		

	}

}
