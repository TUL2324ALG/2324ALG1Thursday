package assignments04_primitives;

import java.util.Scanner;

public class U05PocetMax_v2 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         Napište program, kterému je na vstupu zadána posloupnost celých čísel. Program má zjistit a vypsat maximální 
            hodnotu a počet výskytů této maximální hodnoty. 
         */
        
        // s ukoncenim, kdyz se zada 0
        int cislo;
        int max = Integer.MIN_VALUE;
        int pocetMax = 0;

        System.out.println("Zapište posloupnost čísel");

        while ((cislo = sc.nextInt()) > 0) {
            if (cislo > max) {
                max = cislo;
                pocetMax = 1;
            } else if (cislo == max) {
                pocetMax++;
            }
        }
        if (pocetMax == 0) {
            pocetMax = 1;
            max = 0;
        }
        System.out.println("Maximum je: " + max);
        System.out.println("Počet maxim je: " + pocetMax);

    }
}