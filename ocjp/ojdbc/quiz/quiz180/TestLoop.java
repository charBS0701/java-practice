package quiz.quiz180;

public class TestLoop {
    public static void main(String[] args) {
        float myarray[] = { 10.20f, 20.30f, 30.40f, 50.60f};
        int index = 0;
        boolean isFound = false;
        float key = 30.40f;

        while (index<5) {
            if (myarray[index] == key) {
                isFound = true;
                break;
            }
            index++;
        }

        System.out.println(isFound);
        System.out.println(index);
    }
}
