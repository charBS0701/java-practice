package day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/ojdbc/day2/test.txt");
        int readByte;
        while((readByte=is.read())!=-1) {
            System.out.print((char) readByte);
        }

    }
}
