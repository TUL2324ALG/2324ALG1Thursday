package week11_2darrays;

import java.util.Scanner;
//Test 2 3 2 1 -4 -1 5 2
public class U2NormMatrixProgramv2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        //in - nacitani matice od uzivatele
        System.out.println("Zadej rozmery matice");
        int m = sc.nextInt(); 
        int n = sc.nextInt();
        double[][] matrix = new double[m][n];
        System.out.println("Zadej hodnoty matice");
        for (int i = 0; i < matrix .length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextDouble();
            }
        }
        //processing - normovani zadane matice
        double maxAbs = -Double.MAX_VALUE;
        double absElement;
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                absElement = Math.abs(matrix[i][j]);
                if(absElement > maxAbs){
                    maxAbs = absElement;
                }
            }
        }
        
        double[][] normMatrix = new double [matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
              normMatrix[i][j]  = matrix[i][j] / maxAbs;
            }
        }
        
        //out - vypis normovane matice
        for (int i = 0; i < normMatrix.length; i++){
            for(int j = 0; j < normMatrix[i].length; j++){
                System.out.format("%6.2f ", normMatrix[i][j]);
            }
            System.out.println("");
        }
    }
    
}
