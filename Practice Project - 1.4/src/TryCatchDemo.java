public class TryCatchDemo {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {

            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        }


        System.out.println("The program continues to execute.");
    }
}
