package visualCalculator;

//Appropriate Imports for Java Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualCalculator {

	//Swing Variables
	private JFrame frame;
	private JTextField operationInput;
	
	//Operation Variables
	private float firstNumber = 0;
	private float secondNumber = 0;
	private String currentOperation = "";
	
	//Operation Characters
	private String plus = "+";
	private String minus = "-";
	private String multi = "*";
	private String div = "/";
	
	public VisualCalculator() {
		
		// Set the default font size for JTextFields
		UIManager.put("TextField.font", new Font("Latin Modern", Font.PLAIN, 16)); 

		
		//Create Frame
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,500);
		frame.setLocationRelativeTo(null);
		
	    operationInput = new JTextField();
		
		//Creating Buttons for all numbers
		RoundedButton zeroButton = new RoundedButton("0");
		zeroButton.setBackground(Color.BLACK);
		zeroButton.setForeground(Color.WHITE);
		zeroButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operationInput.setText(operationInput.getText() + "0");
			}
		});
		
		JButton oneButton = new JButton("1");
		oneButton.setBackground(Color.BLACK);
		oneButton.setForeground(Color.WHITE);
		oneButton.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				operationInput.setText(operationInput.getText() + "1");
			}
		});
		
		JButton twoButton = new JButton("2");
		twoButton.setBackground(Color.BLACK);
		twoButton.setForeground(Color.WHITE);
		twoButton.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				operationInput.setText(operationInput.getText() + "2");
			}
		});
		
		JButton threeButton = new JButton("3");
		threeButton.setBackground(Color.BLACK);
		threeButton.setForeground(Color.WHITE);
		threeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operationInput.setText(operationInput.getText() + "3");
			}
		});
		
		JButton fourButton = new JButton("4");
		fourButton.setBackground(Color.BLACK);
		fourButton.setForeground(Color.WHITE);
		fourButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operationInput.setText(operationInput.getText() + "4");
			}
		});
		
		JButton fiveButton = new JButton("5");
		fiveButton.setBackground(Color.BLACK);
		fiveButton.setForeground(Color.WHITE);
		fiveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operationInput.setText(operationInput.getText() + "5");
			}
		});
		
		JButton sixButton = new JButton("6");
		sixButton.setBackground(Color.BLACK);
		sixButton.setForeground(Color.WHITE);
		sixButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operationInput.setText(operationInput.getText() + "6");
			}
		});
		
		JButton sevenButton = new JButton("7");
		sevenButton.setBackground(Color.BLACK);
		sevenButton.setForeground(Color.WHITE);
		sevenButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operationInput.setText(operationInput.getText() + "7");
			}
		});
		
		JButton eightButton = new JButton("8");
		eightButton.setBackground(Color.BLACK);
		eightButton.setForeground(Color.WHITE);
		eightButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operationInput.setText(operationInput.getText() + "8");
			}
		});
		
		JButton nineButton = new JButton("9");
		nineButton.setBackground(Color.BLACK);
		nineButton.setForeground(Color.WHITE);
		nineButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operationInput.setText(operationInput.getText() + "9");
			}
		});
		
		JButton dotButton = new JButton(".");
		dotButton.setBackground(Color.BLACK);
		dotButton.setForeground(Color.WHITE);
		dotButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operationInput.setText(operationInput.getText() + ".");
			}
		});
		
		JButton equalsButton = new JButton("=");
		equalsButton.setBackground(Color.ORANGE);
		equalsButton.setForeground(Color.BLACK);
		equalsButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				result();
			}
			});
		
		JButton additionButton = new JButton("+");
		additionButton.setBackground(Color.ORANGE);
		additionButton.setForeground(Color.BLACK);
		additionButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addition();
			}
		});
		
		JButton subtractionButton = new JButton("-");
		subtractionButton.setBackground(Color.ORANGE);
		subtractionButton.setForeground(Color.BLACK);
		subtractionButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				subtraction();
			}
		});
		
		JButton multiplicationButton = new JButton("*");
		multiplicationButton.setBackground(Color.ORANGE);
		multiplicationButton.setForeground(Color.BLACK);
		multiplicationButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				multiplication();
			}
		});
		
		JButton divisionButton = new JButton("/");
		divisionButton.setBackground(Color.ORANGE);
		divisionButton.setForeground(Color.BLACK);
		divisionButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				division();	
			}
		});
		
		JButton clearButton = new JButton("C");
		clearButton.setBackground(Color.GRAY);
		clearButton.setForeground(Color.BLACK);
		clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		
		JButton backSpaceButton = new JButton ("<--");
		backSpaceButton.setBackground(Color.GRAY);
		backSpaceButton.setForeground(Color.BLACK);
		backSpaceButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backspace();
			}
		});
		
		//Setting Layout
		frame.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		//Task Input
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 30;
		frame.add(operationInput,gbc);
		
		//Clear Button
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 0.3;
		gbc.weighty = 0.3;
		frame.add(clearButton, gbc);
		
		//BackSpace Button
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(backSpaceButton, gbc);
		
		//Button for number 7
		gbc.gridx = 0; //Column 0
		gbc.gridy = 2; //Row 0
		gbc.gridwidth = 1; //Span 1 column
		gbc.gridheight = 1; //Span 1 row
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(sevenButton, gbc);
		
		//Button for number 4
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(fourButton,gbc);
		
		//Button for number 1
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(oneButton, gbc); 
		
		//Button for number 8
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(eightButton, gbc);
		
		//Button for number 5
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(fiveButton, gbc);
		
		//Button for number 2
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(twoButton, gbc);
		
		//Button for number 9
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 0.3;
		gbc.weighty = 0.3;
		frame.add(nineButton, gbc);
		
		//Button for number 6
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(sixButton, gbc);
		
		//Button for number 3
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(threeButton, gbc);
		
		//Button for .
		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(dotButton, gbc);
		
		//Button for 0
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(zeroButton, gbc);
		
		//Button for Division
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(divisionButton, gbc);
		
		//Button for Multiplication
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(multiplicationButton, gbc);
		
		//Button for Subtraction
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(subtractionButton, gbc);
		
		//Button for Addition
		gbc.gridx = 3;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(additionButton, gbc);
		
		//Button for Equals
		gbc.gridx = 3;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		frame.add(equalsButton, gbc);
		
		frame.setVisible(true);
		
}
	
	private void addition() {
		firstNumber = Float.parseFloat(operationInput.getText()); //turns string into a float
		currentOperation = "+";
		operationInput.setText("");
	
	}
	
	private void subtraction() {
		firstNumber = Float.parseFloat(operationInput.getText());
		currentOperation = "-";
		operationInput.setText("");
	}
	
	private void multiplication() {
		firstNumber = Float.parseFloat(operationInput.getText());
		currentOperation = "*";
		operationInput.setText("");
	}
	
	private void division() {
		firstNumber = Float.parseFloat(operationInput.getText());
		currentOperation = "/";
		operationInput.setText("");
	}
	
	private void clear() {
		operationInput.setText("");
	}
	
	private void backspace() {
	    // Get the current text from the input field
	    String currentText = operationInput.getText();
	    
	    // Check if the text field is not empty
	    if (!currentText.isEmpty()) {
	        // Remove the last character from the text
	        String newText = currentText.substring(0, currentText.length() - 1);
	        
	        // Set the modified text back to the input field
	        operationInput.setText(newText);
	    }
	}

	
	private void result() {
		secondNumber = Float.parseFloat(operationInput.getText());
		float result = 0;
		
		if (currentOperation.equals(plus)) {
			
			result = firstNumber + secondNumber;
			
		} else if (currentOperation.equals(minus)) {
			
			result = firstNumber - secondNumber;
			
		}else if (currentOperation.equals(multi)) {
			
			result = firstNumber * secondNumber;
			
		}else if (currentOperation.equals(div)) {
			
			if(secondNumber == 0) {
				
			JOptionPane.showMessageDialog(frame, "Error: Division by zero", "Error", JOptionPane.ERROR_MESSAGE);
			operationInput.setText("");
			return;
			
			}else {
				
			result = firstNumber / secondNumber;
			
			}
		}
		
		operationInput.setText(String.valueOf(result));
		
	}
	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() { //Execute on Swing threat
	            @Override
	            public void run() {
	                new VisualCalculator(); 
	            }
	        });
	}

}
