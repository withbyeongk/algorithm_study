package org.example.week4.infinitySequence2;

public class Question {

    private long n;
    private int p;
    private int q;
    private int x;
    private int y;
    private int result;

    public Question(int i) {
        if (i == 0) {
            this.n = 10000000L;
            this.p = 2;
            this.q = 3;
            this.x = 10000000;
            this.y = 10000000;
            this.result = 2;
        } else if (i == 1) {
            this.n = 12;
            this.p = 2;
            this.q = 3;
            this.x = 1;
            this.y = 0;
            this.result = 8;
        } else if (i == 2) {
            this.n = 0;
            this.p = 2;
            this.q = 2;
            this.x = 0;
            this.y = 0;
            this.result = 1;
        } else if (i == 3) {
            this.n = 124;
            this.p = 45;
            this.q = 67;
            this.x = 8;
            this.y = 9;
            this.result = 2;
        }
    }

    public long getN() {
        return n;
    }

    public int getP() {
        return p;
    }

    public int getQ() {
        return q;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getResult() {
        return result;
    }
}
