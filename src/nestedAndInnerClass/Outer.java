package nestedAndInnerClass;

class Outer {
    private static String staticMessage = "Hello from Static Outer!";
    private String message = "Hello from Outer!";

    // Not a static inner class
    class Inner {
        void display() {
            System.out.println(message); // Accessing private member
        }
    }

    // Static inner class
    static class StaticInner {
        void display() {
            // Can access only static members
            System.out.println(staticMessage);
            // System.out.println(message); ❌ Not allowed
        }
    }

    public static void main(String[] args) {
        // Creating instance of non-static inner class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();

        // Creating instance of static inner class
        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.display();
    }
}

