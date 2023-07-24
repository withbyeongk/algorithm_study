package org.example.week1.notTwo;

public class MySolution {

    public static int countStone(int width, int height) {

        // (x,y) 좌표로 존재할 수 있는 총 개수
        int total = width * height;
        int[][] saveStone = new int[width+2][height+2];

        // 해당 좌표의 위, 왼쪽 거리가 2인 곳에 있는지 확인.
        for (int i = 2; i < width+2; i++) {
            for (int j = 2; j < height+2; j++) {
                if (MySolution.isEmpty(saveStone, i, j)){
                    saveStone[i][j] = 1;
                } else{
                    total--;
                }
            }
        }

        print(total);

        return total;
    }
    public static boolean isEmpty(int[][] saveStone, int x, int y){

        if (saveStone[x-2][y] == 0 && saveStone[x][y-2] == 0){
            return true;
        }
        return false;
    }

    private static void print(int total){
        System.out.println("=========================");
        System.out.println("놓을 수 있는 돌 수 : " + total);
        System.out.println("=========================");
    }

}
