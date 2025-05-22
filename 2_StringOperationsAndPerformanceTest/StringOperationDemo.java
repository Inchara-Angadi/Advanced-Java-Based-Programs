/* Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/


package program;
import java.util.*;
public class StringOperationDemo {
	
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        String str3 = new String("Hello");

	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);
	        System.out.println("String 3: " + str3);

	        // 2. Length and Character Access
	        System.out.println("\nLength of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        System.out.println("\nstr1 equals str3: " + str1.equals(str3));
	        System.out.println("str1 == str3 (reference comparison): " + (str1 == str3));
	        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

	        // 4. String Searching
	        String sentence = "Java programming is fun";
	        System.out.println("\nSentence: " + sentence);
	        System.out.println("Contains 'programming': " + sentence.contains("programming"));
	        System.out.println("Index of 'fun': " + sentence.indexOf("fun"));
	        System.out.println("Last index of 'a': " + sentence.lastIndexOf('a'));

	        // 5. Substring Operations
	        System.out.println("\nSubstring (5 to 16): " + sentence.substring(5, 16));

	        // 6. String Modification
	        System.out.println("Replace 'fun' with 'awesome': " + sentence.replace("fun", "awesome"));
	        System.out.println("To Upper Case: " + sentence.toUpperCase());
	        System.out.println("To Lower Case: " + sentence.toLowerCase());

	        // 7. Whitespace Handling
	        String spaced = "   Hello World!   ";
	        System.out.println("\nOriginal with spaces: '" + spaced + "'");
	        System.out.println("Trimmed: '" + spaced.trim() + "'");

	        // 8. String Concatenation
	        String combined = str1.concat(" ").concat(str2);
	        System.out.println("\nConcatenated: " + combined);

	        // 9. String Splitting
	        String csv = "red,green,blue,yellow";
	        String[] colors = csv.split(",");
	        System.out.println("\nColors after split:");
	        for (String color : colors) {
	            System.out.println(color);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Welcome");
	        sb.append(" to Java");
	        sb.insert(8, "programming ");
	        sb.replace(0, 7, "Hello");
	        System.out.println("\nStringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        int age = 25;
	        double salary = 4567.89;
	        String formatted = String.format("Age: %d, Salary: %.2f", age, salary);
	        System.out.println("\nFormatted String: " + formatted);

	        // 12. Email Validation
	        String email = "user@example.com";
	        System.out.println("\nEmail: " + email);
	        System.out.println("Contains '@': " + email.contains("@"));
	        System.out.println("Starts with 'user': " + email.startsWith("user"));
	        System.out.println("Ends with '.com': " + email.endsWith(".com"));
	    }

}
