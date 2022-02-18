package test;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score[] = new int[5];
        for(int i=0; i<5; i++) {
            System.out.println(i+"번째 점수 입력");
            score[i] = in.nextInt();
        }
        for (int i = 0; i<5; i++) {
            System.out.println(i + "번째 값은 " + score[i]);
        }
        
    }
}
