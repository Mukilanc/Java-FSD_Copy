import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            // This code will generate an exception
            int a = 10 / 0;
            // This code will also generate an exception
            String filename = "myfile.txt";
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException here
            System.out.println(e);
        } catch (IOException e) {
            // Handle the IOException here
            System.out.println(e);
        }
    }
}
