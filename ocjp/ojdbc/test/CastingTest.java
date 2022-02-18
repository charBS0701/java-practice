package test;

public class CastingTest {
    public static void main(String[] args) {
        float f = 1.6f;
        int i = (int)f;
        System.out.println(i);
        byte b = 127;
        System.out.println(b);
        int i1 = (int)12d;
        char c1 = (char)65;
        System.out.println(c1);
        int i2 = 'A';
        System.out.println(i2);
    }
}
