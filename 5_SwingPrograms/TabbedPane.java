package program;
import javax.swing.*;
import java.awt.*;
	

	public class TabbedPane extends JFrame {

	    public TabbedPane() {
	        setTitle("Color Tabbed Pane");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create Tabbed Pane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create panels for each color
	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);

	        // Add tabs with labels and panels
	        tabbedPane.addTab("RED", redPanel);
	        tabbedPane.addTab("BLUE", bluePanel);
	        tabbedPane.addTab("GREEN", greenPanel);

	        // Add tabbed pane to the frame
	        add(tabbedPane);

	        setLocationRelativeTo(null); // Center the frame
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new TabbedPane();
	    }
	}

