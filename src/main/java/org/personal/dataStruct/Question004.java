package org.personal.dataStruct;

import java.util.Scanner;

/*
    백준 온라인 저지 11660번. 실버1
    구간 합 구하기 2

    입력 :
    1번째 줄에 표의 크기 N과 합을 구해야 하는 횟수 M. (1 <= N <= 1024, 1 <= M <= 100000)
    2번째 줄부터 N개의 줄에는 표에 채워져 있는 수가 1행부터 차례대로 주어진다.
    다음 M개의 줄에는 4개의 정수 X1, Y1, X2, Y2가 주어지며, (X1, Y1)에서 (X2, Y2)의 합을 구해 출력해야 한다.
    표에 채워져 있는 수는 1000보다 작거나 같은 자연수가(X1 <= X2, Y1 <= Y2)

    출력 :
    총 M줄에 걸쳐 (X1, Y1)에서 (X2, Y2)까지 합을 구해 출력한다.

 */
public class Question004 {
    public static void main(String[] args) {
        /*
            Scanner 를 사용해서 풀었는데,
            BufferedReader와 StringTokenizer 를 사용해서 풀어야 속도 면에서 나은 것 같다.
         */
        Scanner sc = new Scanner(System.in);

        System.out.printf(" 행 열 입력 : ");
        String input = sc.nextLine();
        int size = Integer.parseInt(input.split(" ")[0]);
        int numOfQuery = Integer.parseInt(input.split(" ")[1]);

        System.out.println("행렬 데이터 입력 :");
        int[][] metrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            input = sc.nextLine();
            String[] tmp = input.split(" ");
//            System.out.println("입력 확인 : " + input);

            for (int j = 0; j < size; j++) {
                metrix[i][j] = Integer.parseInt(tmp[j]);
//                System.out.print(metrix[i][j] + " ");
            }
//            System.out.println();
        }

        int[] results = new int[numOfQuery];

        System.out.println("질의 시작");
        for (int i = 0; i < numOfQuery; i++) {
            input = sc.nextLine();
            String[] tmp = input.split(" ");
            int x1 = Integer.parseInt(tmp[0]);
            int y1 = Integer.parseInt(tmp[1]);
            int x2 = Integer.parseInt(tmp[2]);
            int y2 = Integer.parseInt(tmp[3]);

            results[i] = calculate(metrix, x1, y1, x2, y2);
        }

        printResult(results);
    }

    private static int calculate(int[][] metrix, int x1, int y1, int x2, int y2) {
        int sum = 0;

        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                sum += metrix[i-1][j-1];
            }
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
