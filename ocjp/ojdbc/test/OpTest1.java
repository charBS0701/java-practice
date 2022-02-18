package test;

import java.util.jar.Manifest;

public class OpTest1 {
    public static void main(String[] args) {
        String s = "aa";
        String s1 = "aa";
        String s2 = new String("aa");
        String s3 = new String("aa");
        if(s==s1) {
            System.out.println("같음"); 
        }else {
            System.out.println("다름");
        }

        if (s2.equals(s3)) {
            System.out.println("같음"); 
        }else {
            System.out.println("다름");
        }
        
    }
}
