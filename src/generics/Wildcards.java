package generics;

import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        printNumbers(intList);
        printNumbers(doubleList);
    }

    public static void printNumbers(List<? extends Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
