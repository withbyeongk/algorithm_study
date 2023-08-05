package org.example.week3.circlesCountry;

public class Question {

    private int[] X;
    private static int[][] QUESTION_X = {
            {0},
            {0, -6, -6},
            {1, -3, 2, 5, -4, 12, 12},
            {-3, 2, 2, 0, -4, 12, 12, 12},
            {-107, -38, 140, 148, -198, 172, -179, 148, 176, 153, -56, -187}
    };

    private int[] Y;
    private static int[][] QUESTION_Y = {
            {0},
            {0, 1, 2},
            {1, -1, 2, 5, 5, 1, 1},
            {-1, 2, 3, 1, 5, 1, 1, 1},
            {175, -115, 23, -2, -49, -151, -52, 42, 0, 68, 109, -174}
    };

    private int[] R;
    private static int[][] QUESTION_R = {
            {2},
            {2, 2, 2},
            {8, 1, 2, 1, 1, 1, 2},
            {1, 3, 1, 7, 1, 1, 2, 3},
            {135, 42, 70, 39, 89, 39, 43, 150, 10, 120, 16, 8}
    };

    private int x1;
    private static int[] QUESTION_X1 = {-5, -5, -5, 2, 102};
    private int y1;
    private static int[] QUESTION_Y1 = {1, 1, 1, 3, 16};
    private int x2;
    private static int[] QUESTION_X2 = {5, 5, 12, 13, 19};
    private int y2;
    private static int[] QUESTION_Y2 = {1, 1, 1, 2, -108};

    private int result;
    private static int[] QUESTION_RESULT = {0, 2, 3, 5, 3};

    private Question() {

    }

    private Question(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2, int result) {
        X = x;
        Y = y;
        R = r;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.result = result;
    }

    public static Question getQuestion(int i) {

        if(i >= 0 && i < 5){
            return new Question(QUESTION_X[i], QUESTION_Y[i], QUESTION_R[i], QUESTION_X1[i], QUESTION_Y1[i], QUESTION_X2[i], QUESTION_Y2[i], QUESTION_RESULT[i]);
        }

        System.out.println("문제 번호 ERROR.");
        return null;
    }

    public int[] getX() {
        return X;
    }

    public int[] getY() {
        return Y;
    }

    public int[] getR() {
        return R;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getResult() {
        return result;
    }
}
