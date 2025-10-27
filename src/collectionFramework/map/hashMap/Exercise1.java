package collectionFramework.map.hashMap;

import java.util.HashMap;

public class Exercise1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Virak");
        map.put(2,"SreyProek");

        boolean exits = map.containsKey(1);
        System.out.println("Key 1 exists: " + exits);

        for ( Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        System.out.println("List of couple");
        System.out.println(map);

    }
}
