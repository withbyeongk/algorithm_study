package org.example.week1.kiwiJuiceEasy;

public class Solution2 {

    // 옮길 주스의 양 과 기존 주스 병의 남은 용량 중 적은 것이 이동함.
    // 코드가 짧아짐. 실수가 줄어들 수 있다.
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
        for (int i = 0; i < fromId.length; i++) {
            int from = fromId[i];
            int to = toId[i];
            int vol = Math.min(bottles[from], capacities[to] - bottles[from]);

            bottles[from] -= vol;
            bottles[to] += vol;

        }

        return bottles;
    }
}
