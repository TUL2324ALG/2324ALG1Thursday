/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.OpravaZamecky;

import java.util.Scanner;

/**
 *
 * @author Zamecky-T-45b4
 */

//JV jen chybi vynechani nejrychlejsiho a nejpomalejsiho casu
public class Average5K {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // potřebuju načíst 10 časů 5km dráhy a spočíst kolik minut průměrně trvá uběhnout 1km 
        
        // Zadání hodnot
        char odpoved;
        do {
        int[] casy = new int[10];
        System.out.println("Zadej 10 časů: ");
        for (int i = 0; i < 10; i++) {
            int cas = sc.nextInt();
            casy = new int[cas];
            
        }
        
        // Vypočítání průměru (sečtu všechny hodnoty v poli, vydělím 10 a pak 5
        // Spočtění součtu hodnot v poli
        int sum = 0;
        for (int j = 0; j < casy.length; j++){
            sum += casy[j];
        }
        int prumer = (sum / 10) / 5;
        System.out.println(sum + " min");
            System.out.println("Chceš pokračovat? a - ano");
            odpoved = sc.next().charAt(0);
        } while (odpoved == 'a');
        } 
    }
    

