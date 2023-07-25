package org.example.week2.badNeighbors;

public class Question {

    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int[] init(int i){
        if (i==0){
            setResult(19);
            return new int[]{10, 3, 2, 5, 7, 8};
        } else if (i == 1) {
            setResult(15);
            return new int[]{11, 15};
        } else if (i == 2) {
            setResult(21);
            return new int[]{7, 7, 7, 7, 7, 7, 7};
        } else if (i == 3) {
            setResult(16);
            return new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        }else if (i == 4) {
            setResult(2926);
            return new int[]{94, 40, 49, 65, 21, 21, 106, 80, 92, 81, 679, 4, 61, 6, 237, 12, 72, 74, 29, 95, 265, 35, 47, 1, 61, 397, 52, 72, 37, 51, 1, 81, 45, 435, 7, 36, 57, 86, 81, 72};
        } else {
            setResult(0);
            System.out.println("문제는 0~4번까지 존재함.");
            return null;
        }
    }

    public void printResult(int result){
        if (getResult() == result){
            System.out.println("정답");
        }else {
            System.out.println("오답");
        }
    }
}
