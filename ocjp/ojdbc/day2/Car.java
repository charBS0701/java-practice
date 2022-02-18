package day2;

public class Car extends Vehicle{
    int count = 5;

    @Override
    void openDoor() {
        System.out.println("subOpen");
    }
    
}
