package stream;

import java.util.List;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {

        // Data Source
        List<String> name = List.of("Virak", "Sreyproek", "Sreyproek", "Antre");

        // Obtain stream instance
        Stream<String> result = name.stream();

        // Intermediate Operations (return a new Stream)
        result.map(String::toUpperCase).distinct()

        // Terminal Operations (produce a result)
        .forEach(System.out::println);

    }
}
