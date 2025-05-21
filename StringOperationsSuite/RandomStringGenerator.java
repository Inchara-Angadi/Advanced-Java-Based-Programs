package program;
import java.util.Random;
import java.util.Scanner;
public class RandomStringGenerator {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: desired length of random string
	        System.out.print("Enter the desired length of the random string: ");
	        int length = scanner.nextInt();

	        // Generate and display the random string
	        String randomStr = generateRandomString(length);
	        System.out.println("Generated Random String: " + randomStr);

	        scanner.close();
	    }

	    // User-defined function to generate a random string
	    public static String generateRandomString(int length) {
	        if (length <= 0) return "";

	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        Random random = new Random();
	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            sb.append(characters.charAt(index));
	        }

	        return sb.toString();
	    }
	
}
