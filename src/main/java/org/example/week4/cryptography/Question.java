package org.example.week4.cryptography;

public class Question {

    private int[] numbers;
    private long result;

    public Question(int i) {
        if (i == 0) {
            this.numbers = new int[]{1, 2, 3};
            this.result = 12;
        } else if (i == 1) {
            this.numbers = new int[]{1, 3, 2, 1, 1, 3};
            this.result = 36;
        } else if (i == 2) {
            this.numbers = new int[]{1000, 999, 998, 997, 996, 995};
            this.result = 986074810223904000L;
        } else if (i == 3) {
            this.numbers = new int[]{1, 1, 1, 1};
            this.result = 2;
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public long getResult() {
        return result;
    }
}
