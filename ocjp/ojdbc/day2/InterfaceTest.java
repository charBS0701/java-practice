package day2;

interface AAA{
    int a = 2;
    void draw();
}

interface CCC {
    void check();
}

class BBB implements AAA, CCC {
    int a;
    @Override
    public void draw() {
        System.out.println("BBB draw");
    }
    @Override
    public void check() {
        System.out.println("CCC check");
    }

}

public class InterfaceTest {
    public static void main(String[] args) {
        AAA a = new BBB();
        System.out.println(a.a);
        a.draw();
        // a.a=3;
    }
}
