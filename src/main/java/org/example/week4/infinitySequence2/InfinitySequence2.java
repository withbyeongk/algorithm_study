package org.example.week4.infinitySequence2;

import org.example.week4.infinitySequence2.Question;

public class InfinitySequence2 {
    public static void main(String[] args) {


        for (int i = 0; i < 4; i++) {
            Question question = new Question(i);
            long result = question.getResult();

            System.out.printf("%d번 문제 :: result = %d%n", i+1, result);
            if ( result == cals(question.getN(), question.getP(), question.getQ(), question.getX(), question.getY())){
                System.out.println("정답");
            } else {
                System.out.println("오답");
            }
        }
    }

    public static long recursion(long n, int p, int q, int x, int y) {
        if (n <= 0) {
            return 1;
        } else {
            return recursion(n / p-x, p, q, x, y) + recursion(n / q-y, p, q, x, y);
        }
    }

    public static long cals(long n, int p, int q, int x, int y) {
        return recursion(n, p, q, x, y);
    }

}
