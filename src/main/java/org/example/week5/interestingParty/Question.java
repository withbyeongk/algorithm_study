package org.example.week5.interestingParty;

public class Question {
    private static final String[][] FIRST = {
            {"fishing", "gardening", "swimming", "fishing"},
            {"variety", "diversity", "loquacity", "courtesy"},
            {"snakes", "programming", "cobra", "monty"},
            {"t", "o", "p", "c", "o", "d", "e", "r", "s", "i", "n", "g", "l", "e", "r", "o", "u", "n", "d", "m", "a","t", "c", "h", "f", "o", "u", "r", "n", "i"}
    };

    private static final String[][] SECOND = {
            {"hunting", "fishing", "fishing", "biting"},
            {"talking", "speaking", "discussion", "meeting"},
            {"python", "python", "anaconda", "python"},
            {"n", "e", "f", "o", "u", "r", "j", "a", "n", "u", "a", "r", "y", "t", "w", "e", "n", "t", "y", "t", "w", "o", "s", "a", "t", "u", "r", "d", "a", "y"}
    };

    private static final int[] RESULT = {4, 1, 3, 6};

    private String[] first;
    private String[] second;
    private int result;

    private Question(){

    }

    public Question(int i) {
        this.first = FIRST[i];
        this.second = SECOND[i];
        this.result = RESULT[i];
    }

    public String[] getFirst() {
        return first;
    }

    public String[] getSecond() {
        return second;
    }

    public int getResult() {
        return result;
    }
}
