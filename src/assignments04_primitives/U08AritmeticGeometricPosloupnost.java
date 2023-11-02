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
public class U08AritmeticGeometricPosloupnost {

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

            boolean jeAritmeticka = true;
            boolean jeGeometricka = true;
            double d = 0.0;
            double q = 0.0;

            for (int i = 1; i < pocet; i++) {
                cislo = sc.nextDouble();

                if (i == 1) {
                    d = cislo - cisloPred; //rozdil mezi prvnimi dvema cisly
                    q = cislo / cisloPred; //podil mezi prvnimi dvema cisly, bylo by dobre osetrit, aby cisloPred nebyla 0 - deleni 0
                }
                //kdyz kontroluju 2 charakteristiky najednou, omezuje me to v optimalizaci
                if (cisloPred * q != cislo) {
                    jeGeometricka = false;
                }
                if (cisloPred + d != cislo) {
                    jeAritmeticka = false;
                }

                cisloPred = cislo;
            }

            System.out.println(jeAritmeticka ? "Je aritmeticka" : "Neni aritmeticka");
            System.out.println(jeGeometricka ? "Je geometricka" : "Neni geometricka");
        }
    }
}
