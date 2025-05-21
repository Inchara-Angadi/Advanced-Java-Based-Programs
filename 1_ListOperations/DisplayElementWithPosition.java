/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/

package program;
import java.util.LinkedList;
public class DisplayElementWithPosition {
	

	    public static void main(String[] args) {
	        // Create and populate the LinkedList
	        LinkedList<String> l_list = new LinkedList<>();
	        l_list.add("Apple");
	        l_list.add("Banana");
	        l_list.add("Cherry");
	        l_list.add("Date");

	        // Display elements with their positions
	        System.out.println("Elements and their positions in the LinkedList:");
	        for (int i = 0; i < l_list.size(); i++) {
	            System.out.println("Position " + i + ": " + l_list.get(i));
	        }
	    }
	
}
