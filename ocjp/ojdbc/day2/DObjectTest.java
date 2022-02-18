package day2;

abstract class DObject {
    public DObject next;
    public DObject() {
        next = null;
    }
    abstract public void draw();
}

class Line extends DObject {

    @Override
    public void draw() {
        System.out.println("Line");
    }

}

abstract class Rect extends DObject {

}

public class DObjectTest {
    public static void main(String[] args) {
        // DObject d = new DObject();
        DObject d1 = new Line();
        d1.draw();
        
        
    }
}
