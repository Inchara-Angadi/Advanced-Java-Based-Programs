/*Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/


package program;
import java.util.Scanner;
public class WhitespaceRemover {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string with whitespace: ");
	        String input = scanner.nextLine();

	        // Call the user-defined function
	        String result = removeWhitespace(input);

	        // Display the result
	        System.out.println("String without whitespace: " + result);

	        scanner.close();
	    }

	    // User-defined function to remove all whitespace characters
	    public static String removeWhitespace(String str) {
	        if (str == null) return null;

	        // \s matches any whitespace character
	        return str.replaceAll("\\s", "");
	    }
	}

