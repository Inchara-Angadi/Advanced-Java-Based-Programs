/*Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/


package program;
import java.util.LinkedList;

public class InsertAtEndExample {

	    public static void main(String[] args) {
	        // Create and populate the LinkedList
	        LinkedList<String> l_list = new LinkedList<>();
	        l_list.add("Red");
	        l_list.add("Green");
	        l_list.add("Blue");

	        // Insert "Pink" at the end of the list using offerLast()
	        l_list.offerLast("Pink");

	        // Display the updated list
	        System.out.println("LinkedList after inserting 'Pink' at the end:");
	        for (String color : l_list) {
	            System.out.println(color);
	        }
	    }
}
