/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet_oprava.opravatlusty;

/**
 *
 * @author Tlusty-V-75e8
 */
public class Tools {
    public static boolean areSameArrays(int [] a,int [] b) {
        for (int i = 0; i < a.length; i++) {
            Math.sort(a); //JV sort metody automaticky prochazeji pole
        }
        for (int i = 0; i < b.length; i++) {
            Math.sort(b);
        }
        if (a ==b) { //JV tohle je porovnani, jestli se obe pole nachazeji na stejne pozici v pameti 
         return  true;
        }
        return false;
    }
    
    public static void createOneMetrix(int n ) {
        int[][] matice = new int [n][n];
        
        for (int i = 0; i < matice.length/2; i++) {
            for (int j = 0; j < matice.length; j++) {
                System.out.print(i + " "); //JV bylo potreba naplnit pole hodnotami
            }
        }
       
    }
    
    
    
    public static void main(String[] args) {
        
    }
}
