import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String userOption;

        userOption = JOptionPane.showInputDialog("Please insert your a letter:");

        userOption = userOption.toLowerCase();

        switch (userOption){
            case "a":
                JOptionPane.showMessageDialog(null,"A is for Alpha!!!");
                break;
            case "b":
                JOptionPane.showMessageDialog(null,"B is for Bravo!!!");
                break;
            case "c":
                JOptionPane.showMessageDialog(null,"C is for Charlie!!!");
                break;
            case "d":
                JOptionPane.showMessageDialog(null,"D is for Delta!!!");
                break;
            case "e":
                JOptionPane.showMessageDialog(null,"E is for Echo!!!");
                break;
            case "f":
                JOptionPane.showMessageDialog(null,"F is for Foxtrot!!!");
                break;
            case "g":
                JOptionPane.showMessageDialog(null,"G is for Golf!!!");
                break;
            case "h":
                JOptionPane.showMessageDialog(null,"H is for Hotel!!!");
                break;
            case "i":
                JOptionPane.showMessageDialog(null,"I is for India!!!");
                break;
            case "j":
                JOptionPane.showMessageDialog(null,"J is for Juliet!!!");
                break;
            case "k":
                JOptionPane.showMessageDialog(null,"K is for Kilo!!!");
                break;
            case "l":
                JOptionPane.showMessageDialog(null,"L is for Lima!!!");
                break;
            case "m":
                JOptionPane.showMessageDialog(null,"M is for Mike!!!");
                break;
            case "n":
                JOptionPane.showMessageDialog(null,"N is for November!!!");
                break;
            case "o":
                JOptionPane.showMessageDialog(null,"O is for Oscar!!!");
                break;
            case "p":
                JOptionPane.showMessageDialog(null,"P is for papa!!!");
                break;
            case "q":
                JOptionPane.showMessageDialog(null,"Q is for Quebec!!!");
                break;
            case "r":
                JOptionPane.showMessageDialog(null,"R is for Romeo!!!");
                break;
            case "s":
                JOptionPane.showMessageDialog(null,"S is for Sierra!!!");
                break;
            case "t":
                JOptionPane.showMessageDialog(null,"T is for Tango!!!");
                break;
            case "u":
                JOptionPane.showMessageDialog(null,"U is for Uniform!!!");
                break;
            case "v":
                JOptionPane.showMessageDialog(null,"V is for Victor!!!");
                break;
            case "w":
                JOptionPane.showMessageDialog(null,"W is for Whiskey!!!");
                break;
            case "x":
                JOptionPane.showMessageDialog(null,"X is for Xray!!!");
                break;
            case "y":
                JOptionPane.showMessageDialog(null,"Y is for Yankee!!!");
                break;
            case "z":
                JOptionPane.showMessageDialog(null,"Z is for Zulu!!!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Wrong Input!!!");
                break;
        }


    }




}