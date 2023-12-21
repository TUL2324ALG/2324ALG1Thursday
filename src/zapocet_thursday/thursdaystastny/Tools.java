/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thursdaystastny;

import java.util.Arrays;

/**
 *
 * @author Stastny1-J-df6f
 */
public class Tools {
    
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,2,0};
        System.out.println(Arrays.toString(sumArray(a, b)));
        System.out.println("");
    }
    
    public static int[] sumArray (int[] a, int[] b){ //JV pole nemusi byt stejne velke
        int[] sum=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            sum[i]=a[i]+b[i];
        }
        return sum;
    }
    
   public static int maxRowNotNull (int[][] c){
       int notNull=0;
       int row=0;
       int temp=0;
       for (int i = 0; i < c.length; i++) { //JV chtelo by to nekde vynulovat temp r
           for (int j = 0; j < c[i].length; j++) {
               if (c[i][j]>0) { //JV nenulove muze byt i zaporne
                 temp++;  
               }
            }
           notNull=temp;
           if (notNull>=temp) {
               row=i;
           }
        }
       return row;
   }
   
   public static boolean oneMatrix (int[][] d){
       boolean oneMatrix = true;
       for (int i = 0; i < d.length; i++) {
           for (int j = 0; j < d[i].length; j++) {
               //JV chybi
           }
       }
       return oneMatrix;
   }
}
