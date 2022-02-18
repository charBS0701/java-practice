package test;

public class Array4 {
    public static void main(String[] args) {
        int[][] score = new int[5][3];
        score[0][0] = 99;
        score[2][2] = 87;
        for(int i = 0; i<score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t");
            }
            System.out.println();
        }

        for(int[] i:score) {
            for(int x:i) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }

    }
}
