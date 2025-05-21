/*Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/

package program;
import javax.swing.*;
import java.awt.*;
public class HelloSwing {
	

	
	    public static void main(String[] args) {
	        // Create a new JFrame
	        JFrame frame = new JFrame("Swing Welcome Message");
	        frame.setSize(600, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create a JLabel with the message
	        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);
	        
	        // Set font: Plain style, size 32
	        label.setFont(new Font("SansSerif", Font.PLAIN, 32));

	        // Set text color to blue
	        label.setForeground(Color.BLUE);

	        // Add label to frame
	        frame.add(label);

	        // Center the frame on the screen
	        frame.setLocationRelativeTo(null);

	        // Make the frame visible
	        frame.setVisible(true);
	    }
	}

	
	    
	
