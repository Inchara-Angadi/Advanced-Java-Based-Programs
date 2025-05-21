package program;
import java.util.ArrayList;

public class ColorRemoveDemo {
	
	    public static void main(String[] args) {
	        // Create and populate the ArrayList
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("White");

	        System.out.println("Original colors: " + colors);

	        // Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            colors.remove(1); // Removes "Green"
	        }

	        // Remove color "Blue" by value
	        colors.remove("Blue");

	        System.out.println("Updated colors: " + colors);
	    }
	}


