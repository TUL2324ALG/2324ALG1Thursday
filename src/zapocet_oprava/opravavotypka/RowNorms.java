package zapocet_oprava.opravavotypka;

import java.util.Scanner;

/**
 *
 * @author Votypka-M-da83
 */
public class RowNorms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte rozmery matice:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        double[][] a = new double[m][n];
        System.out.println("Zadejte prvky matice:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
        boolean podminky = true;
        double norm = 0;
        double pomNorm = 0;
        for (int i = 0; i < a.length; i++) {
            double sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) {
                    podminky = false; //JV opet, pokud najdu jedine zaporne cislo, nema smysl pokracovat dal break, nebo return
                }
                sum = sum + (a[i][j] * a[i][j]);
            }
            norm = Math.sqrt(sum);
            pomNorm += norm;
        }
        if (pomNorm / a.length != norm) {
            podminky = false; 
        }
        System.out.println("Matice podminky" + ((podminky) ? " splnuje" : " nesplnuje"));
    }

}
