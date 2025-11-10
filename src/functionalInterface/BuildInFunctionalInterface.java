package functionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Using Built-in Functional Interface
public class BuildInFunctionalInterface {
    public static void main(String[] args) {

        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * integer;
            }
        };
//        System.out.println("Square of 5: " + square.apply(5));

        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
//        System.out.println(isEven.test(4));

        List<Integer> list = List.of(1,2,3,4);
        Consumer<List<Integer>> display = new Consumer<>() {
            @Override
            public void accept(List<Integer> integers) {
                System.out.println(integers);
            }
        };
//        display.accept(list);

        Supplier<String> stringSupplier = () -> "Virak";
        String string = stringSupplier.get();
//        System.out.println(string);

        List<Integer> integerList = List.of(1,2,3,4,5,6);

    }
}
