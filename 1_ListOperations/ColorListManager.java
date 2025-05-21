/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/

package program;
import java.util.ArrayList;
import java.util.Scanner;

public class ColorListManager {
	
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the ArrayList
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Display the original list
	        System.out.println("Original Color List: " + colors);

	        // Ask the user for the index to remove
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the index (0-based) of the color to remove: ");
	        int index = scanner.nextInt();

	        // Check if the index is valid
	        if (index >= 0 && index < colors.size()) {
	            // Remove the element at the given index
	            String removedColor = colors.remove(index);
	            System.out.println("Removed color: " + removedColor);
	        } else {
	            System.out.println("Invalid index. No color removed.");
	        }

	        // Display the updated list
	        System.out.println("Updated Color List: " + colors);

	        scanner.close();
	    }
}
