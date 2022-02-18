package quiz.quiz15$;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> myList = new ArrayList<>();
        myList.add(new Tiger());
        myList.add(new Cat());

        ArrayList<Hunter> myList2 = new ArrayList<>();
        myList.add(new Cat());
        myList.add(new Tiger());

        System.out.println(myList);
        System.out.println(myList2);
    }
}
