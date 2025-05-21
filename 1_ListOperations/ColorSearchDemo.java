/*Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/


package program;
import java.util.*;
public class ColorSearchDemo {
	
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the list
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("White");

	        // Display the list
	        System.out.println("Available colors: " + colors);

	        // Check if "Red" is in the list
	        if (colors.contains("Red")) {
	            System.out.println("The color 'Red' is available in the list.");
	        } else {
	            System.out.println("The color 'Red' is NOT available in the list.");
	        }
	    }
	}


