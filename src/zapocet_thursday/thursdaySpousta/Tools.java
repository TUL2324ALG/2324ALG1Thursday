/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thursdaySpousta;

/**
 *
 * @author Spousta-D-879d
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        int[] a = {1,2,3};
        int[] b = {4,2};
        sumArray(a,b);
    }
    public static final void sumArray(int[] a, int[] b){ 
        if(a.length > b.length){ //JV a co kdyz je b vetsi nez a
            for (int i = 0; i < b.length; i++) {
                 a[i] = a[i] + b[i]; //JV bylo potreba secist vsechny prvky, ne jenom spolecne
            }
   
    }
    }
   
   //JV A
   public static final int maxRowNotNull (int[][] a){
   int max=0;
   int sum = 0;
   int maxRow = 0;
       for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < a[0].length; j++) {
              if (a[i][j] != 0)
                  sum++;
           }
           if (sum>=max){
               max = sum;
           maxRow=i;
           }
            sum = 0;   
       }
       return maxRow;
   }
   
   public static final boolean oneMatrix (int[][] a){
       for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < a[0].length; j++) {
               if (a[i][i] != 1){ //JV kontroluje se zbytecne hodnekrat
               return false;
               }
               if (a[i][j] !=0 && i != j){
               return false;
               }
               
           }
           
       }
       return true;
       
   }
   
    
}
