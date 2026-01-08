package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundedWildcard {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        printNumbers(numbers);
        printNumbers(objects);

        System.out.println(numbers); // [10, 20, 30]
        System.out.println(objects); // [10, 20, 30]
    }

    public static void printNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }

}
