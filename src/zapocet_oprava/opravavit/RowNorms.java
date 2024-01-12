/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapocet_oprava.opravavit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vit-V-298b
 */
public class RowNorms {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int col = 0;
        int row = 0;
        
        System.out.println("Zadej rozměry matice");
        
        col = sc.nextInt();
        row = sc.nextInt();
        
        double[][] matrix = new double[col][row];
        
        System.out.println("Zadej hodnoty do matice");
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextByte();
            }
        }
        
        
        
    }
    
}
