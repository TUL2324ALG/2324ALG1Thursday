package week11_2darrays;

import java.util.Scanner;
//Test 2 3 2 1 -4 -1 5 2
public class U2NormMatrixProgram {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        //in - nacitani matice od uzivatele
        double[][] matrix = loadMatrix();
        //processing - normovani zadane matice
        double[][] normMatrix = MatrixTools.normMatrix(matrix);
        //out - vypis normovane matice
        printMatrix(normMatrix);
    }
    
    public static double[][] loadMatrix(){
        System.out.println("Zadej rozmery matice");
        int m = sc.nextInt(); 
        int n = sc.nextInt();
        double[][] matrix = new double[m][n];
        System.out.println("Zadej hodnoty matice");
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextDouble();
            }
        }
        return matrix;
    }
    
    public static void printMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.format("%6.2f ", matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
