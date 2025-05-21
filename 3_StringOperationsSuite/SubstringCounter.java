

package program;
import java.util.Scanner;
public class SubstringCounter {
		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get the main string and the substring from the user
	        System.out.print("Enter the main string: ");
	        String mainStr = scanner.nextLine();

	        System.out.print("Enter the substring to search for: ");
	        String subStr = scanner.nextLine();

	        // Call the user-defined function
	        int count = countOccurrences(mainStr, subStr);

	        // Display the result
	        System.out.println("The substring \"" + subStr + "\" appears " + count + " times.");

	        scanner.close();
	    }

	    // User-defined function to count occurrences of a substring
	    public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length(); // Move index forward to avoid overlapping count
	        }

	        return count;
	    }


}
