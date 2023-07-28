package org.example.week2.badNeighbors;

/*
    문제 :
    옛날 노래 중에 "Go ahead and hate your neighbor"라는 가사가 있다.
    Onetin 마을 사람들은 가사를 가슴 깊이 새기고 있다.
    모든 마을 사람은 자신의 양옆에 있는 이웃을 싫어한다.
    하지만 아무도 마을의 우물에서 멀리 떨어져 살고 싶은 마음이 없어서
    마을은 우물을 기준으로 원형으로 구성되어 있다.
    불행히도 우물은 노후화가 진행되어 수리가 필요해졌다.
    여러분은 "우물을 지켜주세요." 재단에서 주민의 기부를 받으려고 고용되었다.

    마을의 주민은 모두 int 배열 donations의 금액만큼만 기부하려 한다.
    int배열 donation은 우물을 기준으로 시계 방향 순서이다.
    하지만 이웃 사람이 기부를 하면 자신은 기부하지 않는다.
    이웃은 donations에 연속되어 있으므로 donations 배열의 1번째 요소와 마지막 번째 요소는 서로 이웃이다.
    마을에서 얻을 수 있는 가장 큰 기부 금액을 리턴하세요.
    
    제한조건 :
    donations - 2~40개의 요소가 있는 배열, 각 요소는 1~1000 사이의 값
 */

public class BadNeighbors {
    public static void main(String[] args) {

        Question question = new Question();

        for (int i = 0; i < 4; i++) {
            int result = Solution.maxDonations(question.init(i));
            question.printResult(result);
        }
    }
}
