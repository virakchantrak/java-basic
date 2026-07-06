package generics;

public class GenericClass1 {
    public static void main(String[] args) {
        Box <Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println("Integer Box contains: " + intBox.getItem());

        Box <String> strBox = new Box<>();
        strBox.setItem("Hello Generics");
        System.out.println("String Box contains: " + strBox.getItem());
    }

    /**
     * T is a type parameter (a placeholder for a real type)
     * When you do Box<Integer>, the compiler treats T as Integer for type checking.
     */
    public static class Box<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }
}
