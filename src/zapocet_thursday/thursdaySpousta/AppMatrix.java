/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thursdaySpousta;

import java.util.Scanner;

/**
 *
 * @author Spousta-D-879d
 */
public class AppMatrix {
    
    
    public static void main(String[] args) {
    int matrixSizeRow,matrixSizeCol;
    int repeat = 1;
    int maxRow;
     Scanner sc = new Scanner(System.in);
        while (repeat == 1){
        System.out.println("Zadejte rozmery matice:(radky)(sloupce)");
    matrixSizeRow = sc.nextInt();
    matrixSizeCol = sc.nextInt();
    int[][] matrix = new int[matrixSizeRow][matrixSizeCol];
    System.out.println("Nactete hodnoty matice");
        for (int i = 0; i < matrixSizeRow; i++) {
            for (int j = 0; j < matrixSizeCol; j++) {
               matrix[i][j] = sc.nextInt();
            }
            
        
    }maxRow = Tools.maxRowNotNull(matrix);
     System.out.println("Nejvice nenulovych hodnot bylo na radku: " + maxRow);
    for (int j = 0; j < matrix[maxRow].length; j++) {
                System.out.print(matrix[maxRow][j] + ", ");
            }
    System.out.println();
    System.out.println("Pokud chcete opakovat napiste 1, pokud ne napiste 0");
        repeat = sc.nextInt();
        }
        
    
     
    
}}
