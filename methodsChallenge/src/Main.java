public class Main {
    public static void main(String[] args) {

        int position = calculatePosition(1500);
        displayHighScore("Robert",position);
    }

    public static void displayHighScore(String playerName,int position) {

        System.out.println("The player "+playerName+ " is in the position: "+position);

    }

    public static int calculatePosition(int playerScore) {

        if(playerScore>=1000){
            return 1;
        }
        else if(playerScore>=500 &&playerScore<1000){
            return 2;
        }
        else if(playerScore>=100 &&playerScore<500){
            return 3;
        }
        else{
            return 4;
        }

    }

}