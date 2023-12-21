/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02_numbers;

import java.util.Scanner;


public class Bankovky {
    public static void main(String[] args) {
        //in
        Scanner sc = new Scanner(System.in);
        System.out.print("Money:");
        int inputMoney = sc.nextInt(); //ziskany vstup neprepisuju v kodu
        int money = inputMoney ;
        
        //vypocet
        int bankovka100 = 0;
        int bankovka50 = 0;
        int bankovka20 = 0;
        int bankovka10 = 0;
        int bankovka5 = 0;
        int bankovka2 = 0;
        int bankovka1 = 0;
         
        bankovka100 = money / 100 ;
        money = money % 100; //money -= bankovka100 * 100 ; //money = money -(bankovky100*100)
        bankovka50 = money / 50 ;
        money -= bankovka50 * 50 ;
        bankovka20 = money / 20 ;
        money -= bankovka20 * 20 ;
        bankovka10 = money / 10 ;
        money -= bankovka10 * 10 ;
        bankovka5 = money / 5 ;
        money -= bankovka5 * 5 ;
        bankovka2 = money / 2 ;
        money -= bankovka2 * 2 ;
        bankovka1 = money ;
        
        //out, vypis
        System.out.println("Mate - " + inputMoney + "Penize ");
        System.out.println( "Bankovky 100 - " + bankovka100 + "," 
                + "Mince 50 - "  + bankovka50 + "," 
                + "Mince 20 - " + bankovka20 + "," 
                + "Mince 10 - " + bankovka10 + "," 
                + "Mince 5 - " + bankovka5 + "," 
                + "Mince 2 - " + bankovka2 + "," 
                + "Mince 1 - " + bankovka1  ); 
    }
    
}
