package day2;

import java.io.IOException;

public class Ex {
    public void Read() throws IOException{
        System.in.read();
    }
    public static void main(String[] args) {
        Ex ex = new Ex();
        try {
            ex.Read();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
    
}
