package org.example.week3.circlesCountry;


public class CirclesCountry {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Question question = Question.getQuestion(i);

            int[] X = question.getX();
            int[] Y = question.getY();
            int[] R = question.getR();

            int x1 = question.getX1();
            int y1 = question.getY1();
            int x2 = question.getX2();
            int y2 = question.getY2();

            int result = question.getResult();

            if (result == leastBorders(X, Y, R, x1, y1, x2, y2)) {
                System.out.printf((i+1) + "번 정답\r\n");
            }

        }



    }

    public static int leastBorders(int[] X, int[] Y, int[] R, int x1, int y1, int x2, int y2) {

        int num = 0;

        for (int i = 0; i < X.length; i++) {
            if (inside(X[i], Y[i], x1, y1, R[i]) != inside(X[i], Y[i], x2, y2, R[i])) {
                num++;
            }
        }

        return num;
    }

    private static boolean inside(int X, int Y, int x, int y, int r) {

        return (X-x) * (X-x) + (Y-y) * (Y-y) <= r * r;
    }
}
