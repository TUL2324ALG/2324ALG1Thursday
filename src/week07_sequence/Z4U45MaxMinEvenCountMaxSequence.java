/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week07_sequence;

/*Napište program, kterému je na vstupu zadána posloupnost celých kladných čísel. Program má vypsat minimální 
a maximální zadanou hodnotu a počet sudých členů posloupnosti. Program modifikujte pro oba způsoby 
zadávání posloupnosti.
Napište program, kterému je na vstupu zadána posloupnost celých čísel. Program má zjistit a vypsat maximální 
hodnotu a počet výskytů této maximální hodnoty. */
import java.util.Scanner;

public class Z4U45MaxMinEvenCountMaxSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = 0;//i pro zaporna cisla by muselo byt Integer.MIN_VALUE;
        int number;
        int countEven = 0;
        int countMax = 0;
        System.out.println("Zadejte pocet prvku posloupposti : ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            number = sc.nextInt();
            //hledani min
            if (number < min) {
                min = number;
            }
            
            //hledani max a poctu jeho vyskytu
            if (number > max) {
                max = number;
                countMax = 1; //kdyz najdu nove max, restartuju pocet vyskytu
            } else if (number == max) {
                countMax++;
            }
            
            //hledani poctu sudych
            if (number % 2 == 0) {
                countEven++;
            }

        }
        System.out.println("Minumim je:" + min);
        System.out.println("Maximum je:" + max);
        System.out.println("Sudych cisel je :" + countEven);
        System.out.println("Pocet vyskytu maxima:" + countMax);

    }

}
