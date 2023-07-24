package org.example.week1.kiwiJuiceEasy;

public class Solution1 {

    // 옮길 주스의 양 과 기존 주스 병의 남은 용량 비교
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
        for (int i = 0; i < fromId.length; i++) {
            int from = fromId[i];
            int to = toId[i];
            int space = capacities[to] - bottles[to];

            if (space >= bottles[from]) {
                int vol = bottles[from];
                bottles[to] += vol;
                bottles[from] = 0;
            } else {
                int vol = space;
                bottles[to] += vol;
                bottles[from] -= vol;
            }
        }
        return bottles;
    }
}
