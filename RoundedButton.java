package visualCalculator;

import javax.swing.*; 
import java.awt.*; 
import java.awt.geom.RoundRectangle2D; //Import necessary classes for rounded shapes

public class RoundedButton extends JButton { //Define a new button class that has rounded edges

    //Constructor for creating a rounded button
    public RoundedButton(String text) {
        super(text); //Call the default button constructor and set the button text
        setContentAreaFilled(false); //Make the inside of the button transparent
        setFocusPainted(false); //Don't show a special border when the button is focused
    }

    //Override the painting method to draw a custom button shape
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create(); //Prepare for drawing shapes
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //Make the drawing smoother
        Shape shape = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 10, 10); //Create a rounded rectangle shape
        g2.setColor(getBackground()); //Set the fill color to the button's background color
        g2.fill(shape); //Fill the button shape with the background color
        g2.setColor(getForeground()); //Set the draw color to the button's text color
        g2.draw(shape); //Draw the button shape outline
        g2.dispose(); //Clean up after drawing

        super.paintComponent(g); //Draw the button text and other components
    }
}

