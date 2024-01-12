/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.OpravaZamecky;

import java.util.Scanner;

/**
 *
 * @author Zamecky-T-45b4
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
                    int[] a = {1, 2, 3, 4, 5};
                    int[] b = {2, 1, 3, 5, 4};
                    
                    if(areSomeArrays(a, b)) {
                        System.out.println("Pole jsou shodná");
                    } else {
                        System.out.println("Pole nejsou shodná");
                    }
                    
                    
                
            }
    
    //JV, kdyby byla Vase uvaha spravna, bylo by to dobre naprogramovano 
    public static boolean areSomeArrays(int[] a, int[] b) {
             // Bude tu podmínka stylem if (a.length == b.length) na zjištění stejného počtu čísel
    // Zda mají stejné hodnoty ale nezáleží na pořadí, tak to jde udělat přes individuální součet hodnot v poli a  pak zda se to rovná
             if(a.length != b.length) {
                        return false;         
             } 
                  
                    int sum1 = 0;
                    for (int i = 0; i < a.length; i++){
                        sum1 += a[i];
                    }
                    int sum2 = 0;
                    for (int j = 0; j < b.length; j++){
                        sum2 += b[j];
                    }
                    if (sum1 != sum2) {
                        return false;
                    }
                    return true;
    }
    
    public static double[][] createOneMatrix(double[][] matrix){
        // pro vypsání tu bude podmínka nějak < matrix[i] aby se vypsali puze 1 na diagonale 
            System.out.println("Zadej řád matice n: ");
            int n = sc.nextInt();
            
            matrix = new double[n][n];
    }
    
}
