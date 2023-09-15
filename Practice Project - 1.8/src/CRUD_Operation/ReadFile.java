package CRUD_Operation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        File file = new File("my_file.txt");

        FileReader reader = new FileReader(file);

        int c;
        while ((c = reader.read()) != -1) {
            System.out.print((char) c);
        }

        reader.close();
    }
}
