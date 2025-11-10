package methodReference;

public class Exercise1 {
    public static void main(String[] args) {
        MyPrinter myPrinter = s -> System.out.print(s);
        MyPrinter myPrinter2 = System.out::print;

        myPrinter.print("Sreyproek");
        myPrinter2.print("Virak");
    }

    interface MyPrinter {
        void print(String text);
    }
}
