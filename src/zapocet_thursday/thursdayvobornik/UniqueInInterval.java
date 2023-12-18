/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thursdayvobornik;

import java.util.Scanner;

/**
 *
 * @author Vobornik-J-bb94
 */
public class UniqueInInterval {
    
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        final int poleZvetseni = 10;
        int[] pole = new int[poleZvetseni];
        int[] oldPole;
        int hodnota;
        int intervalA;
        int intervalB;
        int poleRozmer;
        int[] intervalHodnoty;
        int maxHodnota;
        int uniq;
        
        
        System.out.println("Zadejte řadu celých čísel, pro ukončení řady zadejte záporné číslo:");
        
        poleRozmer = 0;
        for(int i = 0; (hodnota = sc.nextInt())>= 0; i++){
            if(i >= pole.length){
                oldPole = new int[pole.length];
                for(int j = 0; j < oldPole.length; j++){
                    oldPole[j] = pole[j];
                }
                pole = new int[pole.length + poleZvetseni];
                for(int j = 0; j < oldPole.length; j++){
                    pole[j] = oldPole[j];
                }
            }
            pole[i] = hodnota;
            poleRozmer = i+1;
        }
        
        System.out.println("Zadejte spodní interval:");
        intervalA = sc.nextInt();
        System.out.println("Zadejte vrchní interval:");
        intervalB = sc.nextInt();
        
        maxHodnota = 0;
        for(int i = 0; i < poleRozmer; i++){
            if(pole[i] > maxHodnota){
                maxHodnota = pole[i];
            }
        }
        if(intervalB > maxHodnota){
            maxHodnota = intervalB;
        }
        
        intervalHodnoty = new int[maxHodnota+1];
        for(int i = 0; i < poleRozmer; i++){
            intervalHodnoty[pole[i]]++;
        }
        
        uniq = 0;
        for(int i = intervalA; i <= intervalB; i++){
            if(intervalHodnoty[i] > 0){
                uniq++;
            }
        }
        
        System.out.print("V posloupnosti [");
        for(int i = 0; i < poleRozmer-1; i++){
            System.out.print(pole[i] + ", ");
        }
        System.out.println(pole[poleRozmer-1] + "] v intervalu " + intervalA + " až " + intervalB + " je různých čísel: " + uniq);
        
    }
}
