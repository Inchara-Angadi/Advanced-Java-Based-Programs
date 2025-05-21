package program;
import java.util.LinkedList;
import java.util.Collections;
public class SwapElementsInLinkedList {
	
	    public static void main(String[] args) {
	        // Create and populate the LinkedList
	        LinkedList<String> l_list = new LinkedList<>();
	        l_list.add("One");
	        l_list.add("Two");
	        l_list.add("Three");
	        l_list.add("Four");

	        // Display the list before swapping
	        System.out.println("Before swapping:");
	        System.out.println(l_list);

	        // Swap first (index 0) and third (index 2) elements
	        Collections.swap(l_list, 0, 2);

	        // Display the list after swapping
	        System.out.println("After swapping first and third elements:");
	        System.out.println(l_list);
	    }

}
