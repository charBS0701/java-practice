package quiz.quiz13$;
class X {
    int x1, x2, x3;
    
    X() {
        System.out.println("X maded");
    }
}

class Y extends X {
    int y1;
    Y() {
        x1 = 1;
        x2 = 2;
        y1 = 10;
        System.out.println("Y maded");
    }
}

class Z extends Y {
    int z1;
    Z() {
        x1 =3;
        y1 =20;
        z1 = 100;
        System.out.println("Z maded");
    }
}
public class Test3 {
    public static void main(String[] args) {
        Z obj = new Z();
        System.out.println("end");
    }
    
}
