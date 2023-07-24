package org.example.week1.kiwiJuiceEasy;

public class MySolution {

    public static int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId){
        // do
        for (int i = 0; i < fromId.length; i++) {
            int sum = bottles[fromId[i]] + bottles[toId[i]];

            if (sum > capacities[toId[i]]){
                bottles[fromId[i]] = sum - capacities[toId[i]];
                bottles[toId[i]] = capacities[toId[i]];
            } else{
                bottles[fromId[i]] = 0;
                bottles[toId[i]] = sum;
            }
        }

        print(bottles);

        return bottles;
    }

    private static void print(int[] arr){
        System.out.println("===== KiwiJuiceEasy result =====");
        for (int bottle : arr) {
            System.out.print(bottle);
            System.out.print(" ");
            System.out.println();
        }
        System.out.println("================================");
    }
}
