/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thursdayvotypka;
import java.util.Scanner;
/**
 *
 * @author Votypka-M-da83
 */
public class AppMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int radek=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Zadej pocet radku matice: ");
        int m=sc.nextInt();
        System.out.println("Zadej pocet sloupcu matice: ");
        int n=sc.nextInt();
        System.out.println("Zadej hodnoty matice: ");
        int[][] Array=new int[m][n];
        for(int i=0;i<Array.length;i++){
            for(int j =0;j<Array[0].length;j++){
                Array[i][j]=sc.nextInt();
            }
        }
        radek=Array.Tools.maxRowNotNull;
        System.out.println("Radek s nejvice nulovyma hodnotama je radek: " + radek);
    }
    
}
