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

public class RowNorms {
    public static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        // Je tu dána matice, jde mi o to ukázat logiku v tom programu, nemohu si vzpomenout jak načíst matici přes Scanner
        boolean test = true;
        double[][] matrix = {
                           {2.8, 4.11, 6.66},
                           {4.8, 7.21, 3.28},
                           {5.45, 8.23, 9.1}};
        // Dale se tu musí vypsat řádek matice a pro každý řádek testovat ty dvě podmínky
        double radek = ;
        double norma = Math.sqrt(radek);
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] <= 0) {
                    test = false;
                    break;
                }
            }
        }
     
        
        // Případ, zda matice obsahuje pouze kladná čísla je že projdu přes 2 cykly celou matici a pak jen podmínka zda matrix[i][j] > 0
    
}
}
