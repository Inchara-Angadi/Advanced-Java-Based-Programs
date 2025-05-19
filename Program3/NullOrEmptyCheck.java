package program;
import java.util.Scanner;
public class NullOrEmptyCheck {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Check using user-defined function
	        if (isNullOrEmpty(input)) {
	            System.out.println("The string is null or contains only whitespace.");
	        } else {
	            System.out.println("The string is valid and not just whitespace.");
	        }

	        scanner.close();
	    }

	    // User-defined function to check for null or whitespace-only string
	    public static boolean isNullOrEmpty(String str) {
	        return (str == null || str.trim().isEmpty());
	    }

}
