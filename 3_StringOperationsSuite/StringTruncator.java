/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/

package program;
import java.util.Scanner;

public class StringTruncator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        System.out.print("Enter the maximum length: ");
	        int maxLength = scanner.nextInt();

	        // Call the user-defined function
	        String result = truncate(input, maxLength);

	        // Display the result
	        System.out.println("Truncated String: " + result);

	        scanner.close();
	    }

	    // User-defined function to truncate string and add ellipsis
	    public static String truncate(String str, int maxLength) {
	        if (str == null) return null;
	        if (maxLength < 0) return "";

	        if (str.length() <= maxLength) {
	            return str;
	        } else if (maxLength <= 3) {
	            // Not enough room for "..." plus any characters
	            return str.substring(0, maxLength);
	        } else {
	            return str.substring(0, maxLength - 3) + "...";
	        }
	    }
	}

