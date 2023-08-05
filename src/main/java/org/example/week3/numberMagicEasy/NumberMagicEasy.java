package org.example.week3.numberMagicEasy;

import java.util.Scanner;

/*
    문제 :
    16이하의 수 맞추기

 */
public class NumberMagicEasy {
    private static Scanner scanner = new Scanner(System.in);

    private static int[][] cards = {
            {1, 2, 3, 4, 5, 6, 7, 8},
            {1, 2, 3, 4, 9, 10, 11, 12},
            {1, 2, 5, 6, 9, 10, 13, 14},
            {1, 3, 5, 7, 9, 11, 13, 15}
    };

    public static void main(String[] args) {
        int result = 0b0000;

        for (int i = 0; i < 4; i++) {
            int response = isExisted(i);
            if (response == 1) {
                System.out.printf("%d번째 카드의 대답은? Y\n", i+1);
                result |= (1 << (3-i));
                System.out.println("result : " + result);
            } else if (response == 0) {
                System.out.printf("%d번째 카드의 대답은? N\r\n", i+1);
                result &= ~(1 << (3-i));
                System.out.println("result : " + result);
            }
        }
        System.out.println("결과 : " + (result+1));
    }

    private static int isExisted(int i){
        System.out.printf("%d 번째 카드에 있나요?\r\n", i+1);
        String input = scanner.nextLine();

        if (input == null || "".equals(input)) {
            System.out.println("입력해 주세요.");
            return -1;
        }

        if ("Y".equals(input)) {
            return 1;
        } else if ("N".equals(input)){
            return 0;
        } else {
            System.out.println("Y나 N으로 입력해 주세요.");
            return -1;
        }
    }
}
