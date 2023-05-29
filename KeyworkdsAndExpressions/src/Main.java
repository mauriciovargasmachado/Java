public class Main {
    public static void main(String[] args) {

    boolean gameOver = true;
    int score = 800, levelComplete = 5, bonus = 100;

    score = 10000;
    levelComplete = 8;
    bonus = 200;

    int finalScore = score;

    if (gameOver){

        finalScore += (levelComplete*bonus);
        System.out.println("Your final score is: "+finalScore);
    }

    }
}