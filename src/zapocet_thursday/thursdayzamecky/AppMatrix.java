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
public class AppMatrix {
public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Zadej rozmery matice: ");
        int radky = sc.nextInt();
        int sloupce = sc.nextInt();
        int[][] c = new int[radky][sloupce];
        System.out.println("Zadej hodnoty matice: ");
        for (int k = 0; k < radky; k++){
            for (int l = 0; l < sloupce; l++){
                c[k][l] = sc.nextInt();
            }
        }
        
        //JV chybi volani metody
        
        for(int i = 0; i< c.length; i++){
            for (int j = 0; j < c[i].length; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
