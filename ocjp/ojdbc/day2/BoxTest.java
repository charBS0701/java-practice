package day2;

public class BoxTest {
    public static void main(String[] args) {
        Box1 b = new Box1();
        b.setObj("obj");
        // System.out.println(b.getObj());  
        String s = (String)b.getObj();
        System.out.println(s);
        
        Box2<String> b2 = new Box2<String>();
        b2.setT("ttt");
        String ss = b2.getT();

    }
}
