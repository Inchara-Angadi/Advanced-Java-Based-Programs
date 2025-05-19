package program;
import java.util.*;
public class ListOperationsDemo {
	
	    public static void main(String[] args) {
	        System.out.println("ArrayList Operations:");
	        performOperations(new ArrayList<>());

	        System.out.println("\nLinkedList Operations:");
	        performOperations(new LinkedList<>());
	    }

	    public static void performOperations(List<String> list) {
	        // 1. Adding elements
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");

	        // 2. Add at specific index
	        list.add(1, "Grapes");

	        // 3. Add multiple elements
	        list.addAll(Arrays.asList("Mango", "Pineapple"));

	        // 4. Accessing elements
	        System.out.println("Element at index 2: " + list.get(2));

	        // 5. Updating elements
	        list.set(2, "Strawberry");

	        // 6. Removing elements
	        list.remove("Grapes");
	        list.remove(0);

	        // 7. Searching elements
	        System.out.println("Contains Mango? " + list.contains("Mango"));

	        // 8. List size
	        System.out.println("List size: " + list.size());

	        // 9. Iterating (for-each)
	        System.out.print("For-each: ");
	        for (String item : list) System.out.print(item + " ");
	        System.out.println();

	        // 10. Using Iterator
	        System.out.print("Iterator: ");
	        Iterator<String> it = list.iterator();
	        while (it.hasNext()) System.out.print(it.next() + " ");
	        System.out.println();

	        // 11. Sorting
	        Collections.sort(list);
	        System.out.println("Sorted list: " + list);

	        // 12. Sublist
	        if (list.size() >= 3)
	            System.out.println("Sublist (1 to 3): " + list.subList(1, 3));

	        // 13. Clearing list
	        list.clear();
	        System.out.println("List after clear: " + list);
	    }
}
