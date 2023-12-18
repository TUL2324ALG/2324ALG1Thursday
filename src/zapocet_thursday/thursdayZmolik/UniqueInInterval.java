/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thursdayZmolik;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zmolik-V-50b5
 */
//JV na zkoušce se zeptejte, jestli v zadané úloze můžete použít Arraylist - 
//tady jsem chtěla, aby jste nasimuloval zvetsovani statickeho pole a hledani jedinecnych cisel 
public class UniqueInInterval {
    private static ArrayList<Integer> allNums = new ArrayList<>();
    private static ArrayList<Integer> uniqueNums = new ArrayList<>();
    private static boolean run = true;
    private static Scanner sc = new Scanner(System.in);
    public static int intervalMin = 0;
    public static int intervalMax = 0;
    
    // 4 6 3 5 5 3 2 7 5 4 -1 9 4
    public static void main(String[] args) {
        while(run){
            getNum();
        }
        getInterval();
        intoConsole();
    }
    
    private static void getNum(){
        System.out.println("Zadej číslo");
        int num = sc.nextInt();
        if(num < 0){
            run = false;
        } else {
            allNums.add(num);
            if (!uniqueNums.contains(num)) {
                uniqueNums.add(num);
            }
        }  
    }
    
    private static void intoConsole(){
        int totalNums = 0;
        for (int num : uniqueNums){
            if(num >= intervalMin && num <= intervalMax){
                totalNums++;
            }
        }
        
        System.out.println("V posloupnosti " + allNums + " v intervalu " + intervalMin + " až " + intervalMax +": " + totalNums + " čísel");
    }
    
    private static void getInterval(){
        System.out.println("Zadejte vrchní hranici intervalu");
        intervalMax = sc.nextInt();
        System.out.println("Zadejte spodní hranici intervalu");
        intervalMin = sc.nextInt();
        
    }
}
