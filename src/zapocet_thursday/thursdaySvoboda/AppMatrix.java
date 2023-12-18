/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thursdaySvoboda;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Svoboda1-J-adc2
 */
public class AppMatrix {
    
    public static void main(String[] args) {
        System.out.println("Napiš rozměr matice n:");
        Scanner sc = new Scanner(System.in);
        int n = 2;
        System.out.println("Napiš rozměr matice m:");
        Scanner scr = new Scanner(System.in);
        int m = 3;
        
        int[][] mat = new int[m][n];
        
        
        
        
        System.out.println(Arrays.toString(mat));
        System.out.println(Tools.maxRowNotNull(mat));
        
    }
}
