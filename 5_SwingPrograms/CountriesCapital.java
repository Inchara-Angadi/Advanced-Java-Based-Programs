/* Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.*/

package program;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.event.*;
	
	public class CountriesCapital extends JFrame {

	    // Map to store countries and their capitals
	    private Map<String, String> countryCapitals;

	    public CountriesCapital() {
	        setTitle("Country Capital Selector");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        // Initialize country-capital map
	        countryCapitals = new LinkedHashMap<>();
	        countryCapitals.put("USA", "Washington, D.C.");
	        countryCapitals.put("India", "New Delhi");
	        countryCapitals.put("Vietnam", "Hanoi");
	        countryCapitals.put("Canada", "Ottawa");
	        countryCapitals.put("Denmark", "Copenhagen");
	        countryCapitals.put("France", "Paris");
	        countryCapitals.put("Great Britain", "London");
	        countryCapitals.put("Japan", "Tokyo");
	        countryCapitals.put("Africa", "Addis Ababa (AU HQ)"); // Africa isn't a country; assumed AU HQ
	        countryCapitals.put("Greenland", "Nuuk");
	        countryCapitals.put("Singapore", "Singapore");

	        // Create JList
	        String[] countries = countryCapitals.keySet().toArray(new String[0]);
	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Add selection listener
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
	                    System.out.println("Selected Country Capitals:");
	                    for (String country : selectedCountries) {
	                        String capital = countryCapitals.get(country);
	                        System.out.println(country + " → " + capital);
	                    }
	                    System.out.println(); // Line break
	                }
	            }
	        });

	        // Add components to frame
	        add(new JLabel("Select countries:"), BorderLayout.NORTH);
	        add(scrollPane, BorderLayout.CENTER);

	        setLocationRelativeTo(null); // Center the frame
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new CountriesCapital();
	    }
	}
