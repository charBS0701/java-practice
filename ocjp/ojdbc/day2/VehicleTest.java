package day2;

public class VehicleTest {
    public static void main(String[] args) {
        // Car c1 = new Car();
        // System.out.println(c1.count);
        // c1.openDoor();
        Vehicle v1 = new Car();
        System.out.println(v1.count);
        v1.openDoor();
        Car c3 = (Car)v1;
        System.out.println(c3.count);
        c3.openDoor();
        // Car c2 = (Car)new Vehicle();
        // System.out.println(c2.count);
        // c2.openDoor();
    }
}
