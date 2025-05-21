package program;
import java.util.Scanner;
public class Capitalizewords {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        // Call the user-defined function
	        String capitalized = capitalizeWords(input);

	        // Display the result
	        System.out.println("Capitalized Sentence: " + capitalized);

	        scanner.close();
	    }

	    // User-defined function to capitalize the first letter of each word
	    public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) return str;

	        String[] words = str.trim().split("\\s+");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1).toLowerCase())
	                      .append(" ");
	            }
	        }

	        return result.toString().trim(); // Remove trailing space
	    }
	}

