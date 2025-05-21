/*Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/

package program;
import java.util.Scanner;
public class WordCounter {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string from the user
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        // Call the user-defined function
	        int wordCount = countWords(input);

	        // Display the result
	        System.out.println("Number of words: " + wordCount);

	        scanner.close();
	    }

	    // User-defined function to count words in a string
	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) {
	            return 0;
	        }

	        // Split by one or more whitespace characters
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

}
