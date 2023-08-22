package org.example.week5.interestingParty;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 *  즐거운 파티
 *
 *  문제 :
 *      문자열 배열 first, second가 주어진다
 *      i번째 친구가 흥미있는 화제는 first[i]와 second[i]
 *      모두가 공통의 흥미있는 화제가 있어야 한다.
 *      초대할 수 있는 친구는 최대 몇 명인지 리턴
 *
 *      first와 second의 각 요소는 1~15개의 문자
 *      각 문자는 영어 소문자
 *      i번째 요소 first[i]와 second[i]의 내용은 다르다.
 *
 */
public class InterestingParty {
    public static void main(String[] args) {
        Question q = new Question(2);   // 0~3

        String[] first = q.getFirst();
        String[] second = q.getSecond();
        int result = q.getResult();

        int re = bestInvitations(first, second);

//        int re = mySolution(first, second);

        System.out.println();

        if (re == result) {
            System.out.println("정답");
        }
        System.out.println("result : " + result);
        System.out.println("re : " + re);
    }


    private static int bestInvitations(String[] first, String[] second) {
        String[] merge = mergeArr(first, second);
        int[] count = new int[merge.length];

        for (int i = 0; i < merge.length; i++) {
            for (int j = 0; j < merge.length; j++) {
                if (i == j) {
                    continue;
                }
                if (merge[i].equals(merge[j])) {
                    count[i]++;
                }
            }
        }

        Arrays.sort(count);

        return count[count.length-1]+1;
    }

    private static String[] mergeArr(String[] a, String[] b) {
        String[] merge = new String[a.length + b.length];

        System.arraycopy(a, 0, merge, 0, a.length);
        System.arraycopy(b, 0, merge, a.length, b.length);

        return merge;
    }

    // 응용
    private static int mySolution(String[] first, String[] second) {
        /*
        // Set을 사용하는 방법은 안됨
        // 딱 한가지 주제만 중복되면 가능한데
        // 2개 2개 3개 이런식으로 중복되는 경우를 고려하지 못함.
        HashSet<String> subject = new HashSet<>();
        for (String str : first) {
            subject.add(str);
        }
        for (String str : second) {
            subject.add(str);
        }

        Iterator it = subject.iterator();

        System.out.println("=== SET 요소 출력 ===");
        while (it.hasNext()) {


            // 출력
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("===============");

        return first.length * 2 - subject.size() + 1;
         */

        return 0;
    }

}
