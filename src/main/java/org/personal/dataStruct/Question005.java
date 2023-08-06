package org.personal.dataStruct;

/*
    백준 온라인 저지 10986번. 실버4
    
    입력 : 
    1번째 줄에 N과 M (1 <= N <= 106, 2 <= M <= 103)
    2번째 줄에 N개의 수 A1, A2, A3, ... , An이 주어진다(0 <= Ai <= 109)
    
    출력 :
    1번째 줄에 연속된 부분의 합이 M으로 나누어 떨어지는 구간의 개수 출력
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question005 {
    public static void main(String[] args) throws Exception{
        /*
            정답을 내는 과정에서 메서드처리를 어떻게 잘하면 좋을까
         */
        
        int result = 0;

        int[] arr = getIntArrReader();

        int numOfLen = arr[0];
        int div = arr[1];
        arr = null;

        int[] data = getIntArrReader();
        int[] sumArr = transSumArr(data);

        int[] divArr = new int[sumArr.length];
        int[] cnt = new int[numOfLen];

        for (int i = 0; i < sumArr.length; i++) {
            int remainder = (int)sumArr[i] % div;

            divArr[i] = remainder;

            if (divArr[i] == 0) {
                result++;
            }

            cnt[remainder]++;

        }

        for (int i = 0; i < numOfLen; i++) {
            if (cnt[i] > 1) {
                result = result + (cnt[i] * (cnt[i] - 1) / 2);
            }
        }

        System.out.println("정답 : " + result);
    }

    private static int[] getIntArrReader() throws Exception {
        int[] arr = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        arr = new int[st.countTokens()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        return arr;
    }

    private static int[] transSumArr(int[] arr) {
        int[] sumArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sumArr[i] = arr[i];
            } else{
                sumArr[i] = arr[i] + sumArr[i-1];
            }
        }

        return sumArr;
    }


}
