package program;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	

	public class ClockType extends JFrame implements ActionListener {

	    JButton btnClock, btnHourGlass;
	    JLabel messageLabel;

	    public ClockType() {
	        // Frame setup
	        setTitle("Image Button Demo");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        // Load images
	        ImageIcon clockIcon = new ImageIcon("digital_clock.png");
	        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

	        // Create buttons with images
	        btnClock = new JButton(clockIcon);
	        btnHourGlass = new JButton(hourGlassIcon);

	        // Add action listeners
	        btnClock.addActionListener(this);
	        btnHourGlass.addActionListener(this);

	        // Create label to display message
	        messageLabel = new JLabel("Press an image button");
	        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));
	        messageLabel.setForeground(Color.BLUE);

	        // Add components to frame
	        add(btnClock);
	        add(btnHourGlass);
	        add(messageLabel);

	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnClock) {
	            messageLabel.setText("Digital Clock is pressed");
	        } else if (e.getSource() == btnHourGlass) {
	            messageLabel.setText("Hour Glass is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        new ClockType();
	    }
	}

