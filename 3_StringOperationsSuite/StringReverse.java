/*Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/

package program;
import java.util.Scanner;
public class StringReverse {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string to reverse: ");
	        String input = scanner.nextLine();

	        // Call the user-defined function
	        String reversed = reverseString(input);

	        // Display the result
	        System.out.println("Reversed string: " + reversed);

	        scanner.close();
	    }

	    // User-defined function to reverse a string
	    public static String reverseString(String str) {
	        if (str == null) {
	            return null;
	        }

	        StringBuilder reversed = new StringBuilder(str);
	        return reversed.reverse().toString();
	    }
	
}
