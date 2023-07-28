package org.example.week2.colorfulBoxesAndBalls;

/*
    동일한 공 우선으로 담을 때
    동일하지 않은 공 우선으로 담을 때
    두가지 중 뭐가 더 포인트가 많은지만 체크하면 됨
 */
public class ColorfulBoxesAndBalls {

    public static void main(String[] args) {
        Question question = new Question();
        for (int i = 0; i < 5; i++) {
            question.init(i);
            int result = getMaximum(question.getNumRed(), question.getNumBlue(), question.getOnlyRed(),
                    question.getOnlyBlue(), question.getBothColors());
            if (result == question.getResult()){
                System.out.println("정답");
            }
            else{
                System.out.println("오답");
            }
        }

    }

    public static int getMaximum(int numRed, int numBlue, int onlyRed, int onlyBlue, int bothColors){
        // 판단
        if (numRed > numBlue) {
            int diff = numRed - numBlue;
            int bigColor = numRed;
            int bigPoint = onlyRed;
            int smallColor = numBlue;
            int smallPoint = onlyBlue;

            return calculate(diff, bigColor, bigPoint, smallColor, smallPoint, bothColors);

        } else if (numRed < numBlue) {
            int diff = numBlue - numRed;
            int bigColor = numBlue;
            int bigPoint = onlyBlue;
            int smallColor = numRed;
            int smallPoint = onlyRed;

            return calculate(diff, bigColor, bigPoint, smallColor, smallPoint, bothColors);

        } else{
            int diff = 0;
            int bigColor = numBlue;
            int bigPoint = onlyBlue;
            int smallColor = numRed;
            int smallPoint = onlyRed;

            return calculate(diff, bigColor, bigPoint, smallColor, smallPoint, bothColors);

        }

    }

    private static int calculate(int diff, int bigColor, int bigPoint, int smallColor, int smallPoint, int bothColors) {
        int eqResult = (smallColor * smallPoint) + (bigColor * bigPoint);
        int diffResult = smallColor * 2 * bothColors + (diff * bigPoint);
        return eqResult > diffResult ? eqResult : diffResult;
    }

}
