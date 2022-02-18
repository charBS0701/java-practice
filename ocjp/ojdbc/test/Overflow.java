package test;

public class Overflow {
    public static void main(String[] args) {
        byte a = 127;
        byte b = -128;
        // a += 1;
        // b -= 1;
        // System.out.println(a);
        // System.out.println(b);
        a = (byte)(a+1);
        


    }
}
