package org.example.week2.colorfulBoxesAndBalls;

public class Question {

    private int numRed;
    private int numBlue;
    private int onlyRed;
    private int onlyBlue;
    private int bothColors;
    private int result;

    public Question(){

    }

    public void init(int num){
        if (num == 0) {
            this.numRed = 2;
            this.numBlue = 3;
            this.onlyRed = 100;
            this.onlyBlue = 400;
            this.bothColors = 200;
            this.result = 1400;
        } else if (num == 1) {
            this.numRed = 2;
            this.numBlue = 3;
            this.onlyRed = 100;
            this.onlyBlue = 400;
            this.bothColors = 300;
            this.result = 1600;
        } else if (num == 2) {
            this.numRed = 5;
            this.numBlue = 5;
            this.onlyRed = 464;
            this.onlyBlue = 464;
            this.bothColors = 464;
            this.result = 4640;
        } else if (num == 3) {
            this.numRed = 1;
            this.numBlue = 4;
            this.onlyRed = 20;
            this.onlyBlue = -30;
            this.bothColors = -10;
            this.result = -100;
        } else if (num == 4) {
            this.numRed = 9;
            this.numBlue = 1;
            this.onlyRed = -1;
            this.onlyBlue = -10;
            this.bothColors = 4;
            this.result = 0;
        }
    }

    public int getNumRed() {
        return numRed;
    }

    public void setNumRed(int numRed) {
        this.numRed = numRed;
    }

    public int getNumBlue() {
        return numBlue;
    }

    public void setNumBlue(int numBlue) {
        this.numBlue = numBlue;
    }

    public int getOnlyRed() {
        return onlyRed;
    }

    public void setOnlyRed(int onlyRed) {
        this.onlyRed = onlyRed;
    }

    public int getOnlyBlue() {
        return onlyBlue;
    }

    public void setOnlyBlue(int onlyBlue) {
        this.onlyBlue = onlyBlue;
    }

    public int getBothColors() {
        return bothColors;
    }

    public void setBothColors(int bothColors) {
        this.bothColors = bothColors;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
