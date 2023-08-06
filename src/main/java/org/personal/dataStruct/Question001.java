package org.personal.dataStruct;

import java.util.Scanner;

/*
    백준 온라인 저지 11720번. 브론즈2
    숫자 합 구하기

    입력 :
    1번째 줄에 숫자의 개수 N( 1 <= N <= 100),
    2번째 줄에 숫자 N개가 공백없이 주어진다.

    출력 :
    입력으로 주어진 숫자 N개의 합을 출력한다.
 */
public class Question001 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        String input = sc.nextLine();

        int num = Integer.parseInt(input);      // 숫자의 개수

        input = sc.nextLine();

        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i] - '0';

            sum += temp;
        }

        System.out.println("sum = " + sum);
    }


}
