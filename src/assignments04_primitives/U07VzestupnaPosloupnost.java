/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignments04_primitives;

import java.util.Scanner;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class U07VzestupnaPosloupnost {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Zadej počet čísel: ");
        int pocet = sc.nextInt();

        if (pocet <= 0) {
            System.out.println("Konec, zadali jste prazdnou nebo nevalidni posloupnost");
        } else {
            System.out.println("Zapište posloupnost čísel");

            double cislo;
            double cisloPred = sc.nextDouble(); //prvni prvek nacteny samostatne
            boolean jeVzestupna = true;

            for (int i = 1; i < pocet && jeVzestupna; i++) {
                cislo = sc.nextDouble();

                if (cisloPred > cislo) {
                    jeVzestupna = false;
                    //break;
                }

                cisloPred = cislo;
            }

            System.out.println(jeVzestupna ? "Je vzestupna" : "Neni vzestupna");
        }
    }
}
