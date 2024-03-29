package org.example.week1.kiwiJuiceEasy;


/*
    문제 : 키위 주스

    타로는 맛있는 키위 주스를 준비했습니다.
    타로는 0부터 N-1이라 이름을 붙인 N개의 병에 키위 주스를 넣었습니다.
    이때 i번째 병의 용량은 capacities[i] 리터이며 타로가 i번째 병에 넣은 키위 주스의 양을 bottles[i]리터라고 합니다.

    타로는 병에 키위 주스를 재분배하려고 하며, 0부터 M-1까지 M회 조작합니다.
    i번째의 조작은 타로가 병 fromId[i]부터 병 toId[i]에 키위 주스를 넣는 것을 의미합니다.
    병 fromId[i]가 비어 있거나 병 toId[i]가 꽉차 있는 순간, 타로는 더 이상 키위 주스를 넣지 않습니다.

    N개의 요소를 가진 정수 배열 int[]를 리턴해주세요.
    배열의 i번째 요소는 모든 주스를 쏟는 작업이 완료되고 i번째 병에 남아 있는 키위 주스의 양입니다.

    제약 조건 :

    capacities : 2~50개의 요소가 있는 배열. 각 요소는 1~1000000 사이의 값을 갖습니다.
    bottles : capacities와 같은 수의 요소가 있는 배열입니다. bottles[i]는 capacities[i]에 들어 있는 주스를 의미합니다.
    fromId : 1~50개의 요소가 있는 배열입니다.
    toId : fromId와 같은 수의 요소가 있는 배열입니다.

 */
public class KiwiJuiceEasy {

    public static void main(String[] args){

        Question question = new Question(); // 문제 불러오기
//        question.init(1);
//        question.init(2);
//        question.init(3);
        question.init(4);

        MySolution.thePouring( question.getCapacities(),
                    question.getBottels(),
                    question.getFromId(),
                    question.getToId());

    }

}
