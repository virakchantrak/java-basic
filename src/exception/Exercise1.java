package exception;

// Unchecked Exception
public class Exercise1 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        // System.out.println(nums[5]); // ❌ ArrayIndexOutOfBoundsException

        // Using try-catch to handle the exception
        try {
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Error: Index out of bounds. Please check the array index.");
            return;
        } finally {
            System.out.println("Finally block executed. Cleanup can be done here if needed.");
        }
        System.out.println("Program continues after exception handling." );
    }
}
