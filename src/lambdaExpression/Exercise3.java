package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> even = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(even);

        List<String> names = Arrays.asList("Virak", "Sreyproek");
        List<String> list = names.stream()
                .map(n -> n.toUpperCase())
                .toList();
        System.out.println(list);

        List<String> love = Arrays.asList("Srey Proek", "Virak", "Boss", "Luck");
        love.stream()
                .filter(n -> n.length() > 4)
                .map(n -> n.toUpperCase())
                .forEach(name -> System.out.println("💖 " + name));
    }
}
