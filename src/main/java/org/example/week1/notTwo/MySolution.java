package org.example.week1.notTwo;

public class MySolution {

    public static int maxStones(int width, int height) {

        // (x,y) 좌표로 존재할 수 있는 총 개수
        int total = width * height;
        int[][] saveStone = new int[height+2][width+2];

        // 해당 좌표의 위, 왼쪽 거리가 2인 곳에 있는지 확인.
        // 보초병 방식으로 예외 처리(실제 판보다 2만큼 더 크게 잡음)
        for (int i = 2; i < height+2; i++) {
            for (int j = 2; j < width+2; j++) {
                if (MySolution.isEmpty(saveStone, i, j)){
                    saveStone[i][j] = 1;
                } else{
                    total--;
                }
            }
        }

        NotTwo.printResult(total);
        printStone(saveStone, width, height);
        return total;
    }
    public static boolean isEmpty(int[][] saveStone, int x, int y){

        // 이전에 놓인 돌만 확인. x 왼쪽과 y 아래쪽
        if (saveStone[x-2][y] == 0 && saveStone[x][y-2] == 0){
            return true;
        }
        return false;
    }



    private static void printStone(int[][] saveStone, int width, int height){
        System.out.println("======== Stone ==========");
        for (int i = 2; i < height+2; i++ ){
            for (int j = 2; j < width+2; j++){
                System.out.print(saveStone[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=========================");
    }

}
