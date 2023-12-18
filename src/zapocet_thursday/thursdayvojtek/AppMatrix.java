/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thursdayvojtek;

import java.util.Scanner;

/**
 *
 * @author Vojtek-M-a1c7
 */
public class AppMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* // TODO code application logic here
        int[][] a ={
            {0,2,0,0},
            {0,3,2,5},
            {0,0,0,0},
            {0,0,2,3},
        };*/
        Scanner sc = new Scanner(System.in);
        boolean pokracovat = true;
        int[] vys;
        while(pokracovat)
        {
            
            //zde načti od uživatele
            System.out.println("Zadejte rozměry matice:");
            int rozmer1 = sc.nextInt();
            int rozmer2 = sc.nextInt();
            System.out.println("Zadejte prvky matice");
            int[][] a = new int[rozmer1][rozmer2];
            for (int i = 0; i < rozmer1; i++) 
            {
                for (int j = 0; j < rozmer2; j++) 
                {
                    a[i][j] = sc.nextInt();
                }
            }
            //načítání 
            
        vys=Tools.maxRowNotNull(a);
        
            
        System.out.println("Řádek s nejvíce nenulovými čísli je:");
        for (int i = 0; i < vys.length; i++)//výpis 
        {
            System.out.print(vys[i]+" ");
        }
        System.out.println("");
        System.out.println("A je to řádek číslo " + Tools.maxRowNotNullLine(a));         
        System.out.println("Pokud chcete ukončit zmáčkněte 0");
        pokracovat = (sc.nextInt()!=0);
        }
    }
    
}
