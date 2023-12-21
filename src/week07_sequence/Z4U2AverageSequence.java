/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week07_sequence;

import java.util.Scanner;

/**
 * Napište program, který načte posloupnost reálných hodnot a vypočte a vypíše jejich průměr. Na vstupu bude 
 * zadáno N, X1, X2, …XN, kde N je celkový počet členů posloupnosti a Xi její jednotlivé členy.
 * @author Vitvarova-J-31c9
 */
public class Z4U2AverageSequence {
    
     public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);
         System.out.println("N: ");
         int n = scanner.nextInt();
         double sum = 0;
         double number;
         
         for (int i = 1; i <= n; i++) {
              System.out.print("X" + i + ": ");
              number = scanner.nextDouble();
              sum += number; 
              
         }
         
         double prumer = sum/ n;
         System.out.println("Prumer je:"+ prumer);
    }
}
