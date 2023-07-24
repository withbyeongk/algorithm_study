package org.example.week1.notTwo;

/*
    문제 : 밥은 1x1 크기의 칸으로 분할되어 있는 width x height 크기의 판이 있습니다.
    판의 열은 0부터 height - 1 까지이며 행은 0부터 width -1 까지 번호가 붙어 있습니다.
    각 칸에는 1개의 돌을 놓을 수 있습니다. 그리고 각 칸에 있는 돌의 유클리드 거리가 2가 되면 안 됩니다.
    (x1, y1) 칸과 (x2, y2)칸의 유클리드 거리는 다음과 같이 정의됩니다.

    .... 책 372 쪽 문제.

    이 판에 놓을 수 있는 돌의 최대 개수를 리턴해 주세요.

    제약 조건 :
    width : 1~1000
    height : 1~1000

 */
public class NotTwo {
    public static void main(String[] args) {

        // 그냥 풀기
        // 문제
        Question question = new Question();
//        question.init(0);
//        question.init(1);
        question.init(2);

        MySolution.maxStones(question.getWidth(), question.getHeight());

        Solution.maxStones(question.getWidth(), question.getHeight());

    }

    public static void printResult(int res){
        System.out.println("=========================");
        System.out.println("놓을 수 있는 돌 수 : " + res);
        System.out.println("=========================");
    }

}
