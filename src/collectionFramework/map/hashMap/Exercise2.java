package collectionFramework.map.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("KH", "Cambodia");
        countries.put("US", "United States");
        countries.put("FR", "France");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter country code: ");
        String code = sc.nextLine().toUpperCase();

        if (countries.containsKey(code)) {
            System.out.println("✅ Result: " + countries.get(code));
        } else {
            System.out.println("❌ Country code not found.");
        }
    }
}
