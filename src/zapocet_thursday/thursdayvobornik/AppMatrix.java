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
public class AppMatrix {
    
    private static final Scanner sc = new Scanner(System.in);
    
    //JV A
    public static void main(String[] args){
        int radek;
        int sloupec;
        int[][] matice;
        int maxNenull;
        
        System.out.println("Zadejte počet řádků a sloupců:");
        while((radek = sc.nextInt()) > 0 && (sloupec = sc.nextInt()) > 0){
            System.out.println("Zadejte hodnoty matice v celých číslech:");
            matice = new int[radek][sloupec];
            for(int i = 0; i < radek; i++){
                for(int j = 0; j < sloupec; j++){
                    matice[i][j] = sc.nextInt();   
                }
            }
            
            maxNenull = Tools.maxRowNotNull(matice);
            System.out.println("Nejvíce nenulových prvků je na řádku číslo:" + (maxNenull+1));
            System.out.print("V tomto řádku jsou hodnoty:");
            for(int i = 0; i < sloupec; i++){
                System.out.print(matice[maxNenull][i] + " ");
            }
            System.out.print("\n");
            System.out.println("Zadejte počet řádků a sloupců, pro ukončení zapište celé nekladné číslo:");
        }
    }
}
