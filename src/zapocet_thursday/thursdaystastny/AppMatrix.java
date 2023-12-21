/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thursdaystastny;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Stastny1-J-df6f
 */
public class AppMatrix {
    
    //JV A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Zadejte počet řádků a sloupců matice: ");
        int[][] matice = new int[sc.nextInt()][sc.nextInt()];
        System.out.println("Zadejte hodnoty matice: ");
        for (int i = 0; i < matice.length; i++) {
            for (int j = 0; j < matice[i].length; j++) {
                matice[i][j]=sc.nextInt();
            }            
        }
        System.out.println("Radek s nejvice nenulovymi hodnotami je "+Tools.maxRowNotNull(matice)+ " obsahujici hodnoty " + Arrays.toString(matice[Tools.maxRowNotNull(matice)]));    
    }
}
