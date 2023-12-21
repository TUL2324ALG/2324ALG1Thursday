/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thursdaySvoboda;

import java.util.Arrays;

/**
 *
 * @author Svoboda1-J-adc2
 */
public class Tools {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3};
        int[] b = new int[] {5, 4}; 
    int[][] mat = new int[][]{{1, 0, 0},{0, 1, 0},{0, 0, 1}};
            
        sumArray(a,b);
        System.out.println(maxRowNotNull(mat));
        System.out.println(oneMatrix(mat));
    }
    
    //JV co kdyz bude prvni nebo druhe pole kratsi
    public static void sumArray(int[] a, int[] b) { //JV vysledkem metody maji byt data ne vypis!
        int[] c = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            c[i] = a[i] + b[i];
            
        }
        System.out.println(c);
    }
    
    public static int maxRowNotNull(int[][] mat){ //JV matice muze mit ruzny pocet radku
        int radek1 = 0;
         int radek2 = 0;
          int radek3 = 0;
          int finalradek = 0;
          
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] !=0 && i==0){
                    radek1++;
                }
                if (mat[i][j] !=0 && i==1){
                    radek2++;
                }
                if (mat[i][j] !=0 && i==2){
                    radek3++;
                }
     
            }
        }
        
        if (radek1 > radek2 && radek1 > radek3){
            finalradek = 1;
        }else{
            if(radek2> radek3){
                finalradek = 2;
            }else{
                finalradek = 3;
            }
        }
        
//        finalradek = radek1;
//                if (radek2 > radek1){
//                    finalradek = radek2;
//                }
//                if (radek3 > radek2){
//                    finalradek = radek3;
//                }
//                
//                
                
        return finalradek;
    }
    
    public static boolean oneMatrix(int[][] mat){
        boolean ano = true;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][i] != 1){
                    ano = false;
                }
                if (mat[i][j] != mat[j][i]) { //JV toto je test symetrie
                ano = false;
                
            }
                if (mat[1][2] != 0){ //JV proc jenom test jednoho prvku na 0
                    ano = false;
                }
                
            }
            
        }
        
       return ano; 
    }
    
    
}
