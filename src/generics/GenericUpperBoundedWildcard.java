package generics;

import java.util.List;

public class GenericUpperBoundedWildcard {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        printNumbers(integers);
        List<Double> doubles = List.of(1.1, 2.2, 3.3);
        printNumbers(doubles);
    }

    public static void printNumbers(List<? extends Number> list) {
        for (int i = 0; i < list.size(); i++) {
            Number n = list.get(i);
            System.out.println(n);
        }
    }

}
