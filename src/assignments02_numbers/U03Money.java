/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignments02_numbers;

import java.util.Scanner;

public class U03Money {
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int money;
        //money = 521;
        System.out.println("Zadej castku:");
        money = sc.nextInt();
        
        int hundreds,fifties,twenties,tens,fives,twos,ones;
        int vstup = money;
        //vypocet
        hundreds = vstup/100;
        vstup = vstup%100; //vstup - hundreds*100
        
        fifties = vstup/50;
        vstup = vstup%50;
        
        twenties = vstup/20;
        vstup = vstup%20;
        
        tens = vstup/10;
        vstup = vstup%10;
        
        fives = vstup/5;
        vstup = vstup%5;
        
        twos = vstup/2;
        vstup = vstup%2;
        
        ones = vstup;
        
        
        System.out.println(hundreds + "x stovkami ");
        System.out.println(fifties + "x padesatikorunami");
        System.out.println(twenties + "x dvacetikorunami");
        System.out.println(tens + "x desetikorunami");
        System.out.println(fives + "x petikorunami");
        System.out.println(twos + "x dvoukorunami");
        System.out.println(ones + "x korunami");
    }
    
}
