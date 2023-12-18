/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thursdayvobornik;

/**
 *
 * @author Vobornik-J-bb94
 */
public class Tools {
    
    public static void main(String[] args){
        int[] A = {1, 2, 3};
        int[] B = {4, 2};
        int[] vysl = sumArray(A,B);
        
        
        for(int i = 0; i < vysl.length; i++){
            System.out.print(vysl[i]);
        }
        System.out.print("\n");
        int[][] matice = {{1,0,0},{0,1,1},{0,0,1}};
        for(int i = 0; i < matice.length; i++){
            for(int j = 0;j < matice[0].length; j++){
                System.out.print(matice[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println(maxRowNotNull(matice));
        
        System.out.println(oneMatrix(matice));
        
        
    }
    //JV A
    public static int[] sumArray(int[] poleA, int[] poleB){
        int[] bigger;
        int[] smaller;
        
        if(poleA.length > poleB.length){
            bigger = poleA;
            smaller = poleB;
        }else{
            bigger = poleB;
            smaller = poleA;
        }
        int[] sum = new int[bigger.length];
                
        for(int i = 0; i < bigger.length; i++){
            sum[i] = bigger[i];
        }
        for(int i = 0; i < smaller.length; i ++){
            sum[i] = sum[i] + smaller[i];
        }
        
        return sum;
    }
    //JV A
    public static int maxRowNotNull(int[][] matice){
        int index = -1;
        int max = -1;
        
        for(int i = 0; i < matice.length; i++){
            
            int radek = 0;
            for(int j = 0; j < matice[i].length; j++){
                if(matice[i][j] != 0){
                    radek++;
                }
            }
            
            if(radek >= max){
                max = radek;
                index = i;
            }
        }
        
        return index;
    }
    
    public static boolean oneMatrix(int[][] matice){
        for(int i = 0; i < matice.length; i++){
            for(int j = 0; j < matice[i].length; j++){
                if( !((j == i && matice[i][j] == 1) || (j != i && matice[i][j] == 0))){ //JV asi ne uplne spravne
                    return false;
                }
            }
        }
        return true;
    }
    
}
