
package assignments07_2darrays;

import java.util.Scanner;
//Test: 3 3 1 2 -8 3 4 -4 -5 2 8
public class U2NormMatrixProgram {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        //nacitani od uzivatele
        System.out.println("Zadej rozmery matice");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        double[][] a = new double [m][n];
        System.out.println("Zadej hodnoty matice");
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextDouble();
            }
        }
        //processing
        double[][] normA = MatrixTools.normMatrix(a);
        
        //vypis uzivateli
        for (int i = 0; i < normA.length; i++) {
            for(int j = 0; j < normA[i].length; j++){
                System.out.format("%7.2f ",normA[i][j]);
            }
            System.out.println("");
        }
    }
    
}
