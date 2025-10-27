package collectionFramework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) {

        // Create a HashSet
        Set<String> names = new HashSet<>();

        // Add elements
        names.add("Virak");
        names.add("Srey Proek");
        names.add("Boss Proek");
        names.add("Virak");  // duplicate ignored
        names.add(null);     // null allowed

        // Print the HashSet
        System.out.println("HashSet elements: " + names);

        // Check if an element exists
        System.out.println("Contains 'Srey Proek'? " + names.contains("Srey Proek"));

        // Remove an element
        names.remove("Virak");
        System.out.println("After removing 'Virak': " + names);

        // Get size
        System.out.println("Total elements: " + names.size());

        // Loop through HashSet
        System.out.println("Loop using for-each:");
        for (String name : names) {
            System.out.println(name);
        }

        // Iterator example
        System.out.println("Loop using Iterator:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
