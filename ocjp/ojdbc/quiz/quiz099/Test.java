package quiz.quiz099;

public class Test {
    
    static void dispResult(int[] num) {
        try {
            System.out.println(num[1] / (num[1] - num[2]));
        } catch(ArithmeticException e) {
            System.out.println("first E");
        }
        System.out.println("Done");
    }
    


    public static void main(String[] args) {
        try {
            int[] arr = { 100, 100 };
            dispResult(arr);
        } catch (IllegalArgumentException e) {
            System.out.println("second E");
        } catch (Exception e) {
            System.out.println("third E");
        }
    }
}
