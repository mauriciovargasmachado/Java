import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String word;
        String invertedWord;
        int wordLenght;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert a word o frase: ");
        word = sc.nextLine();

        wordLenght = word.length();

        while (wordLenght!=0){
            invertedWord += word.substring(wordLenght-1,wordLenght);
            wordLenght--;
        }
        System.out.println(invertedWord);

    }
}