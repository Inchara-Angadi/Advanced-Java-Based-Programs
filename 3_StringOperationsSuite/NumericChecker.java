/*Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/

package program;
import java.util.Scanner;
public class NumericChecker {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Call the user-defined function
	        if (isNumeric(input)) {
	            System.out.println("The string contains only numeric characters.");
	        } else {
	            System.out.println("The string does NOT contain only numeric characters.");
	        }

	        scanner.close();
	    }

	    // User-defined function to check if a string is numeric
	    public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) return false;
	        return str.matches("\\d+");  // \d matches digits, + ensures at least one digit
	    }
	
}
