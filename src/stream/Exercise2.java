package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> names = List.of("a", "bb", "a", "c", "d", "e", "fff", "e");
        Stream<String> result = names.stream();


        List<Integer> collect = result.map(r -> r.length())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);
     }
}
