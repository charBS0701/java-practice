package quiz.quiz87;

public class Series {
    private boolean flag=true;
    
    public void displaySeries() {
        int num = 2;
        while (flag) {
            if (num % 7 == 0)
            flag = false;
            System.out.println(num);
            num+=2;
        }
    }
    public static void main(String[] args) {
        new Series().displaySeries();
    }
}
