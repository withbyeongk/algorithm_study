package org.example.week4.cryptography;

import java.util.Arrays;
import java.util.Map;

/*

 */
public class Cryptography {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            Question question = new Question(i);
            int[] numbers = question.getNumbers();
            long result = question.getResult();

            System.out.printf("%d번 문제 :: result = %d%n", i+1, result);
            if ( result == encrypt(numbers)){
                System.out.println("정답");
            } else {
                System.out.println("오답");
            }
        }
    }

    public static long encrypt(int[] numbers) {
        long ret = 1;
        Arrays.sort(numbers);
        numbers[0]++;
        for (int i = 0; i < numbers.length; i++) {
            ret *= numbers[i];
        }
        return ret;
    }

}
