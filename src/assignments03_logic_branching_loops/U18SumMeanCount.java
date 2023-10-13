/*
 Zapište program, který bude zpracovávat sadu zadaných kladných čísel. Program má postupně zjistit počet a 
součet a následně i průměr zadaných čísel. Zadávání bude ukončeno uživatelem zadáním nulové nebo záporné 
hodnoty. Jaké jsou rozdíly při výpočtu průměru z celých nebo reálných čísel?
 */
package assignments03_logic_branching_loops;

import java.util.Scanner;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class U18SumMeanCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;
        
        //vynulovani pocatecnych hodnot
        int sum = 0;
        int count = 0;
        double mean;

        while ((input = sc.nextInt()) > 0) {
                sum += input; //sum = sum + input;
                count++;
        }

        mean = (double)sum / count;

        System.out.println("Pocet cisel: " + count);
        System.out.println("Soucet cisel: " + sum);
        System.out.println("Prumer cisel: " + mean);
    }

}
