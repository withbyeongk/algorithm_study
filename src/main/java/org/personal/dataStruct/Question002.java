package org.personal.dataStruct;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/*
    백준 온라인 저지 1546번. 브론즈1
    평균 구하기

    자기 점수 중 최댓값(M)을 고르고
    모든 점수를 점수 / M*100 로 고쳤다.

    예 :
    최고점 M = 70
    수학 점수 Math = 50 일 때
    50/70*100 = 71.43 으로 고친다.

    입력 :
    1번째 줄에 시험을 본 과목의 개수 N, 해당 값은 1000보다 작거나 같다.
    2번째 줄에 세준이의 현재 성적이 주어진다. 해당 값은 100보다 작거나 같은, 음이 아닌 정수이고, 적어도 1개의 값은 0보다 크다.

    출력 :
    1번째 줄에 새로운 평균을 출력.
    실제 정답과 출력값의 절대 오차 또는 상대 오차가 0.01 이하이면 정답

 */
public class Question002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int subjectNum = 0;     // 과목 수

        System.out.print("시험을 본 과목의 수 : ");

        subjectNum = sc.nextInt();
        sc.nextLine();

        System.out.println("시험 점수를 나열해 주세요.");

        String input = sc.nextLine();
        String[] scoresArr = input.split(" ");

        System.out.println("입력한 점수 확인");
        for (String scoreStr : scoresArr) {
            System.out.println("score = " + scoreStr);
        }

        int[] scores = new int[scoresArr.length];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(scoresArr[i]);
        }

        double result = calculate(scores);

        System.out.println("result = " + result);

    }

    private static double calculate(int[] scores){
        int max = getMax(scores).getAsInt();

        int sum = Arrays.stream(scores).sum();

        return (sum / (double) max) * 100 / (double) scores.length;
    }

    private static OptionalInt getMax(int[] scores) {
        return Arrays.stream(scores).max();
    }

}
