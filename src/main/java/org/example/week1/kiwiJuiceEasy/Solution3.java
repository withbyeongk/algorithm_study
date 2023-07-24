package org.example.week1.kiwiJuiceEasy;

public class Solution3 {

    // 옮길 주스의 양과 기존 주스 양의 총합이 일정한점.
    // 옮길 주스는 옮길 주스 총량과 기존 주스 병의 용량 중 작은 값이 된다는 점. 이용
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
        for (int i = 0; i < fromId.length; i++) {
            int sum = bottles[fromId[i]] + bottles[toId[i]];
            bottles[toId[i]] = Math.min(sum, capacities[toId[i]]);
            bottles[fromId[i]] = sum - bottles[toId[i]];

        }

        return bottles;
    }
}
