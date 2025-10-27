package collectionFramework.list;

import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Virak");
        names.add("Srey Proek");
        names.add("Virak"); // duplicate allowed
        names.add(null);    // null allowed

        // Get list
        System.out.println("Names in the list: " + names);

        // Get by index
        System.out.println("Name at index 1: " + names.get(1));

        // Update element
        names.set(1, "Boss Proek");
        System.out.println("After update: " + names);

        // Remove element
        names.remove(0);
        System.out.println("After removing index 0: " + names);

        // Size of the list
        System.out.println("Size of the list: " + names.size());

        // Loop through elements
        System.out.println("Loop using for-each:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
