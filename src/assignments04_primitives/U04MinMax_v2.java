package assignments04_primitives;

import java.util.Scanner;

public class U04MinMax_v2 {

    /*
     Napište program, kterému je na vstupu zadána posloupnost celých kladných čísel. Program má vypsat minimální 
        a maximální zadanou hodnotu a počet sudých členů posloupnosti. Program modifikujte pro oba způsoby 
        zadávání posloupnosti.
     */

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //int pocetPrvku = sc.nextInt();
        // s ukoncenim, kdyz se zada 0
        int cislo;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int pocetSud = 0;

        System.out.println("Zapište posloupnost čísel, sekvenci ukončete 0 nebo zapornym cislem");

        boolean isValid = false;
        while ((cislo = sc.nextInt()) > 0) {
            if (cislo < min) {
                min = cislo;
            }
            if (cislo > max) {
                max = cislo;
            }
            if (cislo % 2 == 0) {
                pocetSud++;
            }
            isValid = true; //dela se v kazde iteraci cyklu, neni optimalni, mozna lepsi pocet++
        }

        if (!isValid) {
            System.out.println("Nebyla zadána sekvence.");
        } else {
            System.out.println("Minimum je: " + min);
            System.out.println("Maximum je: " + max);
            System.out.println("Počet sudých čísel je: " + pocetSud);
        }

    }
}
