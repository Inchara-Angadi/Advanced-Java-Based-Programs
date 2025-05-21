package program;
import java.util.ArrayList;
import java.util.Collections;
public class ColorSort {

	public class SortColors {
	    public static void main(String[] args) {
	        // Create and populate the ArrayList
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("White");

	        // Display original list
	        System.out.println("Original colors: " + colors);

	        // Sort the list
	        Collections.sort(colors);

	        // Display sorted list
	        System
	        
	        .out.println("Sorted colors: " + colors);
	    }
	}
}
