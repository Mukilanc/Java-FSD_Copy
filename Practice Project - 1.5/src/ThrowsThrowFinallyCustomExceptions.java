public class ThrowsThrowFinallyCustomExceptions {

    public static void main(String[] args) throws MyCustomException {
        try {
            throw new MyCustomException("This is a custom exception.");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

class MyCustomException extends Exception {

    public MyCustomException(String message) {
        super(message);
    }
}
