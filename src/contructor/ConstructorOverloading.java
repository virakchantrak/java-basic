package contructor;

/**
 * Constructor Overloading
 * You can have multiple constructors with different parameters — this is called constructor overloading.
 */
public class ConstructorOverloading {
    String brand;
    int year;

    // Default constructor
    ConstructorOverloading() {
        brand = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    ConstructorOverloading(String b, int y) {
        brand = b;
        year = y;
    }

    void display() {
        System.out.println(brand + " - " + year);
    }

    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading(); // calls default constructor
        ConstructorOverloading c2 = new ConstructorOverloading("Toyota", 2022); // calls parameterized constructor

        c1.display();
        c2.display();
    }
}
