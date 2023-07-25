package polimorfismo;

public class Main {
    public static void main(String[] args) {

        Operations_father rsuma =  new Addition();

        rsuma.askData();
        rsuma.Operations();
        rsuma.showAnswer();

        Operations_father rresta =  new Substraction();

        rresta.askData();
        rresta.Operations();
        rresta.showAnswer();

    }
}
