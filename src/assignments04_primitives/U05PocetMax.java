package assignments04_primitives;

import java.util.Scanner;

public class U05PocetMax {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         Napište program, kterému je na vstupu zadána posloupnost celých čísel. Program má zjistit a vypsat maximální 
            hodnotu a počet výskytů této maximální hodnoty. 
         */
        // se zadanim poctem prvku
        System.out.println("Zadejte počet prvků:");
        int pocetPrvku = sc.nextInt();
        int cislo = 0;
        int max = Integer.MIN_VALUE;
        int pocetMax = 0;

        System.out.println("Zapište posloupnost čísel");

        for (int i = 0; i < pocetPrvku; i++) {
            cislo = sc.nextInt();
            if (cislo > max) {
                max = cislo;
                pocetMax = 1;
            } else if (cislo == max) {
                pocetMax++;
            }
        }
        System.out.println("Maximum je: " + max);
        System.out.println("Počet maxim je: " + pocetMax);

    }
}