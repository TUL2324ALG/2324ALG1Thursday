package thursdayrybar;

import java.util.Scanner;

public class AppMatrix {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("Zadej pocet radku: ");
            int rows = sc.nextInt();

            System.out.println("Zadej pocet sloupcu: ");
            int columns = sc.nextInt();

            double[][] mat = loadMatrix(rows, columns);
            int nonZeroValues = Tools.maxRowNotNull(mat);

            System.out.println("Nejvice nenulovych hodnot je na radku s indexem: " + nonZeroValues);
            System.out.println("Hodnoty: ");
            for (int i = 0; i < mat[0].length; i++) {
                System.out.print(mat[nonZeroValues][i] + "  ");
            }
            System.out.println();
            System.out.println("Pro ukonceni zadej K, pro pokracovani cokoli jineho");
            System.out.println();
        } while (Character.toUpperCase(sc.next().charAt(0)) != 'K');
    }

    private static double[][] loadMatrix(int m, int n) {
        double[][] mat = new double[m][n];
        System.out.println("Zadej hodnoty:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }
        return mat;
    }
}