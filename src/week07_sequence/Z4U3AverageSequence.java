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
public class Z4U3AverageSequence {
    
     public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);
         //in
         int number;
         
         int sum = 0;
         int n = 0;
         
         //processing
         System.out.println("Zadej kladna cisla, ukonci 0 nebo zapornym");
         while((number = scanner.nextInt()) > 0) {
              sum += number; 
              n++; //n = n+1
         }
         
         //out
        double prumer = (double)sum/n;
        
        if( Double.isNaN(prumer)){ //osetreni limitniho validniho pripadu
            System.out.println("Zadali jste prazdnou posloupnost");
        } else {
            //vypis
            System.out.println("Prumer je:"+ prumer);
         }
    }
}
