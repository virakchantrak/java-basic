package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Problems:
 * You must cast manually (annoying).
 * You can cast wrong → runtime ClassCastException.
 */
public class WithOutGeneric {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add("Virak");

        for (Object o : list) {
            String s = (String) o;
            System.out.println(s);
        }
    }
}
