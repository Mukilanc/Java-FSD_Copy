public class TryCatchDemo {

    public static void main(String[] args) {
        // Try to divide 10 by 0.
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException.
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        }

        // Continue executing the program.
        System.out.println("The program continues to execute.");
    }
}
