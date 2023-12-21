/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thursdayzamecky;

/**
 *
 * @author Zamecky-T-45b4
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,2};
        
        int[][] matice = {
            {1,0,3,2},
            {0,5,0,7},
            {0,0,9,0},
        };
        int maxrow = -1;
        int maxnonzerocount = 0;
        for (int i = 0; i < matice.length; i++){
            int nonzerocount = 0;
            for (int j =0; j < matice[i].length; j++){
                if(matice[i][j] !=0){
                    nonzerocount++;
                }
            }
            if (nonzerocount < maxnonzerocount){
                maxnonzerocount = nonzerocount;
                maxrow = i +1;
            }
        }
        System.out.println("Řádek se nejvíce nenulovými hodnotami je: " +  maxrow);
        
    }
    public static int[] sumArray(int[] a, int[] b){ //JV nevime, ktere pole je kratsi a ktere delsi
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
           c[i] = a[i];
    }
        for (int j = 0; j < b.length; j++){
            c[a.length + b.length + j] = b[j]; //JV delka pole c je a.length + b.length, tj. index a.length + b.length + j neexistuje
        }
        return c;
        
    }
    //JV A/B    
    public static int maxRownNotNull(int[][] matice){
        int maxrow;
        int maxnonzerocount = 0;
        for (int i = 0; i < matice.length; i++){
            int nonzerocount = 0;
            for (int j =0; j < matice[i].length; j++){
                if(matice[i][j] !=0){
                    nonzerocount++;
                }
            }
            if (nonzerocount < maxnonzerocount){
                maxnonzerocount = nonzerocount;
                maxrow = i +1;
            }
        }
        return maxrow; //JV potreba inicializovat promennou
        
    }
    
    //JV chybi oneMatrix
}
    


