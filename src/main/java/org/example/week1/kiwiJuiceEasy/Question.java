package org.example.week1.kiwiJuiceEasy;

public class Question {
    private int[] capacities;
    private int[] bottels;
    private int[] fromId;
    private int[] toId;


    public Question() {
    }

    public Question(int[] capacities, int[] bottels, int[] fromId, int[] toId) {
        this.capacities = capacities;
        this.bottels = bottels;
        this.fromId = fromId;
        this.toId = toId;
    }

    public int[] getCapacities() {
        return capacities;
    }

    public int[] getBottels() {
        return bottels;
    }

    public int[] getFromId() {
        return fromId;
    }

    public int[] getToId() {
        return toId;
    }

    public void init(int i){
        if (i == 1){
            this.capacities = new int[]{10, 10};
            this.bottels = new int[]{5, 8};
            this.fromId = new int[]{0};
            this.toId = new int[]{1};
        } else if (i == 2){
            this.capacities = new int[]{30, 20, 10};
            this.bottels = new int[]{10, 5, 5};
            this.fromId = new int[]{0, 1, 2};
            this.toId = new int[]{1, 2, 0};
        } else if (i == 3){
            this.capacities = new int[]{14, 35, 86, 58, 25, 62};
            this.bottels = new int[]{6, 34, 27, 38, 9, 60};
            this.fromId = new int[]{1, 2, 4, 5, 3, 3, 1, 0};
            this.toId = new int[]{0, 1, 2, 4, 2, 5, 3, 1};
        } else if (i == 4){
            this.capacities = new int[]{700000, 800000, 900000, 1000000};
            this.bottels = new int[]{478478, 478478, 478478, 478478};
            this.fromId = new int[]{2, 3, 2, 0, 1};
            this.toId = new int[]{0, 1, 1, 3, 2};
        }
    }
}
