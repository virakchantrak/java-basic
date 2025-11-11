package stream;

import java.util.List;
import java.util.stream.Stream;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9);
        int sum = integerList.stream().filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum);
    }
}
