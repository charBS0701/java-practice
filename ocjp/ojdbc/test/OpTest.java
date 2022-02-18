package test;

public class OpTest {
    public static void main(String[] args) {
        int i = 1;
        ++i;
        System.out.println(i);

        int a,b;
        int num1=10, num2=10;
        a= ++num1;
        System.out.println(a + " " + num1);
        b = num2++;
        System.out.println(b + " " + num2);

        byte b1=10,b2=20;
        byte c = (byte)(b1 +b2);


        float f = 3.14f;
        int ci = (int)c + i;
        // int fi1 = f +i;
        int fi2 = (int)f + i;
        float fi = f + i;

        System.out.println(0.1d == 0.1f);
        System.out.println((float)0.1d == 0.1f);
    }
}
