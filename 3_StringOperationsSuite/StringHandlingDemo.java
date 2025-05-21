package program;

public class StringHandlingDemo {
	
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "AIET";
	        String str2 = new String("Engineering");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("\nLength of str1: " + str1.length());
	        System.out.println("Character at index 2 in str1: " + str1.charAt(2));

	        // 3. String Comparison
	        String str3 = "AIET";
	        System.out.println("\nstr1 equals str3: " + str1.equals(str3));
	        System.out.println("str1 == str3 (reference): " + (str1 == str3));
	        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

	        // 4. String Searching
	        String text = "Welcome to AIET College";
	        System.out.println("\nText: " + text);
	        System.out.println("Contains 'AIET': " + text.contains("AIET"));
	        System.out.println("Index of 'College': " + text.indexOf("College"));
	        System.out.println("Last index of 'e': " + text.lastIndexOf('e'));

	        // 5. Substring Operations
	        System.out.println("\nSubstring from index 11 to 15: " + text.substring(11, 15));

	        // 6. String Modification
	        System.out.println("Replace 'College' with 'Institute': " + text.replace("College", "Institute"));
	        System.out.println("To Upper Case: " + text.toUpperCase());
	        System.out.println("To Lower Case: " + text.toLowerCase());

	        // 7. Whitespace Handling
	        String spaced = "   Hello AIET!   ";
	        System.out.println("\nOriginal string with spaces: '" + spaced + "'");
	        System.out.println("Trimmed: '" + spaced.trim() + "'");

	        // 8. String Concatenation
	        String full = str1.concat(" ").concat(str2);
	        System.out.println("\nConcatenated String: " + full);

	        // 9. String Splitting
	        String data = "CSE,ECE,MECH,CIVIL";
	        String[] departments = data.split(",");
	        System.out.println("\nDepartments:");
	        for (String dept : departments) {
	            System.out.println(dept);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("AIET");
	        sb.append(" College");
	        sb.insert(5, "Engineering ");
	        sb.replace(0, 4, "Welcome");
	        System.out.println("\nStringBuilder Result: " + sb.toString());

	        // 11. String Formatting
	        int year = 2025;
	        double fee = 12345.67;
	        String formatted = String.format("Year: %d, Fee: %.2f", year, fee);
	        System.out.println("\nFormatted String: " + formatted);

	        // 12. Validate Email
	        String email = "student@aiet.edu";
	        System.out.println("\nEmail: " + email);
	        System.out.println("Contains '@': " + email.contains("@"));
	        System.out.println("Starts with 'student': " + email.startsWith("student"));
	        System.out.println("Ends with '.edu': " + email.endsWith(".edu"));
	    }
	
}
