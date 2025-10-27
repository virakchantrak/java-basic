package collectionFramework.map.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Exercise1 {
    public static void main(String[] args) {

        // Create a TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs
        treeMap.put(3, "Boss Proek");
        treeMap.put(1, "Virak");
        treeMap.put(2, "Srey Proek");
        treeMap.put(5, "Queen Proek");
        treeMap.put(4, "Princess Proek");

        // Print the map (keys will be sorted)
        System.out.println("TreeMap elements (sorted by key): " + treeMap);

        // Get value by key
        System.out.println("Key 2 -> " + treeMap.get(2));

        // Remove an element
        treeMap.remove(3);
        System.out.println("After removing key 3: " + treeMap);

        // First and last keys
        System.out.println("First key: " + ((TreeMap<Integer, String>) treeMap).firstKey());
        System.out.println("Last key: " + ((TreeMap<Integer, String>) treeMap).lastKey());

        // Iterate over entries
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

