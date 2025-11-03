package generics;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World", "Generic", "Method"};

        System.out.println("Integer Array:");
        Printer.printArray(intArray);

        System.out.println("\nString Array:");
        Printer.printArray(stringArray);
    }
    public static class Printer {
        public static <T> void printArray(T[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
