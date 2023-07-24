package laundrymachinefuntions;

import java.util.Scanner;

public class LaundryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to you whashing machine.");
        System.out.println("Please select what kind of clothes do you want to wash 1 for white, and 2 for color clothes: ");
        int clothesType = sc.nextInt();

        System.out.println("Please select how many kilos of clothes do you whan to whash?");
        int kilos = sc.nextInt();

        LaundryMachineFuntions lavadora = new LaundryMachineFuntions(kilos,clothesType);

        lavadora.doneWashing();

    }
}
