package test;

public class OverloadingTest {
    public static void main(String[] args) {
        OverloadingTest a = new OverloadingTest();
        System.out.println(a.add());
        System.out.println(a.add(2,6));
        System.out.println(a.add("4","5"));
        System.out.println(a.add(3.4f, 6.5f));
    }
    public int add() {
        return 0;

    }

    public int add(int i, int x) {

        return i+x;
    }

    public int add(String i, String x) {
        return Integer.parseInt(i)+Integer.parseInt(x);
    }
    public float add(float i, float x) {
        return i+x;
    }
}

