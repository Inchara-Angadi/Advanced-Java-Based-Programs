package program;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
	
	public class AddCountries extends JFrame {

	    public AddCountries() {
	        setTitle("Country Selector");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        // Array of country names
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada",
	            "Denmark", "France", "Great Britain",
	            "Japan", "Africa", "Greenland", "Singapore"
	        };

	        // Create JList and allow multiple selections
	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Add selection listener
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    java.util.List<String> selected = countryList.getSelectedValuesList();
	                    System.out.println("Selected Countries:");
	                    for (String country : selected) {
	                        System.out.println(country);
	                    }
	                    System.out.println(); // Line break for clarity
	                }
	            }
	        });

	        // Add to frame
	        add(new JLabel("Select countries:"), BorderLayout.NORTH);
	        add(scrollPane, BorderLayout.CENTER);

	        setLocationRelativeTo(null); // Center the frame
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new AddCountries();
	    }
	}

