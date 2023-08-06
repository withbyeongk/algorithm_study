package org.personal.dataStruct;

/*
    백준 온라인 저지 11659번. 실버4
    구간 합 구하기

    입력 :
    1번째 줄에 수의 개수 N(1 <= N <= 100000), 합을 구해야 하는 횟수 M(1 <= M <= 100000)
    2번째 줄에 N개의 수, 각 수는 1000보다 작거나 같은 자연수
    3번째 줄부터는 M개의 줄에 합을 구해야 하는 구간 i와 j가 주어진다.

    출력 :
    총 M개의 줄에 입력으로 주어진 i번째 수에서 j번째 수까지의 합을 출력

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Question003 {
    public static void main(String[] args) {

        /*
            Scanner 를 사용해서 풀었는데,
            BufferedReader와 StringTokenizer 를 사용해서 풀어야 속도 면에서 나은 것 같다.
         */
        Scanner sc = new Scanner(System.in);

        System.out.printf("데이터의 개수, 질의 개수를 입력 : ");

        String input = sc.nextLine();

        int numOfData = Integer.parseInt(input.split(" ")[0]);
        int numOfQuery = Integer.parseInt(input.split(" ")[1]);

        System.out.printf("구간 합을 구할 대상 배열 입력 : ");
        input = sc.nextLine();

        int[] dataArr = stringToIntArray(input);

        int[] results = new int[numOfQuery];

        System.out.println("질의 입력");
        for (int i = 0; i < numOfQuery; i++) {
            input = sc.nextLine();
            int start = Integer.parseInt(input.split(" ")[0]);
            int end = Integer.parseInt(input.split(" ")[1]);

            results[i] = calculate(dataArr, start, end);
        }

        printResult(results);

    }

    private static int[] stringToIntArray(String input) {
        String[] arr = input.split(" ");
        int[] dataArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dataArr[i] = Integer.parseInt(arr[i]);
        }
        return dataArr;
    }

    private static int calculate(int[] dataArr, int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += dataArr[i-1];
        }

        return sum;
    }

    private static void printResult(int[] results) {
        System.out.println("결과 : ");
        for (int result : results) {
            System.out.println(result);
        }
    }

}
