package org.example.week1.notTwo;

public class Question {

    private int width;
    private int height;

    public Question() {
    }

    public Question(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void init(int i) {
        if (i == 0) {
            this.width = 3;
            this.height = 2;
        } else if (i == 1){
            this.width = 3;
            this.height = 5;
        } else if (i == 2){
            this.width = 8;
            this.height = 5;
        }
    }
}
