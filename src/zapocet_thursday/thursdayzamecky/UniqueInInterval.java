/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thursdayzamecky;
import java.util.Scanner;
/**
 *
 * @author Zamecky-T-45b4
 */
public class UniqueInInterval {
public static Scanner sc = new Scanner(System.in);
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Zadej hodnotu čísel: ");
        
        //JV program je vzdy vseobecnej - dokaze resit víc uloh stejneho typu
        int pocet=0;
        int[] a = {4, 6, 3, 5, 5, 3, 2, 7, 5, 4};
        int min = 4;
        int max = 9;  
        for (int i = 0; i < a.length; i++){
            if (a[i] >= min && a[i] <=max){
                pocet++;
            }
            
           System.out.println(pocet);
        }
    }
    
}
